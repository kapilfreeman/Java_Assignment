/**
 * 
 */
package two;
import java.util.Scanner;
import java.lang.Math;

/**
 * @author kapilfreeman
 *
 */
public class ChangeMaker {
	public static void main(String[] args) {
		System.out.println("Enter the amount customer paid:");
		Scanner obj=new Scanner(System.in);
	     int amountpaid=obj.nextInt();
	     System.out.println("Enter the amount customer owed:");
	     int amountowed=obj.nextInt();
	     System.out.println("Their change is:"+(amountpaid-amountowed));
	     if(amountpaid-amountowed>0) {
	    	 int amount=amountpaid-amountowed;
	    	
	    		 int dollars=amount/100;
	    		 amount-=dollars*100;
	    		 int quaters=amount/25;
	    		 amount-=quaters*25;
	    		 int dimes=amount/10;
	    		 amount-=dimes*10;
	    		 int nickels=amount/5;
	    		 amount-=nickels*5;
	    		 int pennies= amount;
	    		 System.out.print("dollars:"+dollars+"   quaters:"+quaters+"   dimes:"+dimes+"   nickles:"+nickels+"   pennies:"+pennies);
	    	 
	     }
	     else {
	    	 System.out.print("Not sufficient amount paid");
	     }

		
	}
	

}
