/**
 * 
 */
package storeinventory;

import java.util.List;

/**
 * @author kapilfreeman
 *
 */
public class ReceiptImplement implements Receipt{
	
	private String formattedTotal=null;
	private List<String> orderedItems=null;
	
	
	public ReceiptImplement() {
		
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the formattedTotal
	 */
	public String getFormattedTotal() {
		return formattedTotal;
	}
	/**
	 * @param formattedTotal the formattedTotal to set
	 */
	public void setFormattedTotal(String formattedTotal) {
		this.formattedTotal = formattedTotal;
	}
	/**
	 * @return the orderedItems
	 */
	public List<String> getOrderedItems() {
		return orderedItems;
	}
	/**
	 * @param orderedItems the orderedItems to set
	 */
	public void setOrderedItems(List<String> orderedItems) {
		this.orderedItems = orderedItems;
	}
	

}
