/**
 * 
 */
package storeinventory;

/**
 * @author kapilfreeman
 *
 */

public class PriceComprator {
	
	public int compare(OrderItem a, OrderItem b) {
		int retVal=0;
		if(a.getItemPrice()!=b.getItemPrice()) {
			if(a.getItemPrice()>=b.getItemPrice()) {
				retVal=-1;
			}
			else {
				retVal=1;
			}
		}
		if(a.getItemPrice()==b.getItemPrice()) {
			retVal=compareString(a.getItemName(),b.getItemName());
		}
		return retVal;
	}

	private int compareString(String str1, String str2) {
		// TODO Auto-generated method stub
		int x=String.CASE_INSENSITIVE_ORDER.compare(str1, str2);
		if(x==0) {
			x=str1.compareTo(str2);
		}
		return x;
	}

}
