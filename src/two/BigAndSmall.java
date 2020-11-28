/**
 * 
 */
package two;
import java.util.Scanner;
/**
 * @author kapilfreeman
 *
 */
public class BigAndSmall {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  double min=0;
		  double max=0;
		  double sum=0;
		  double count=0;
		  int i=0;
		  double num;
		     Scanner obj=new Scanner(System.in);
		     do {
		    	 System.out.print("Enter a number or 0 to quit:");
		      num=obj.nextDouble();
		      if (i ==0){
		    	  min=num;
		    	  max=num;
		    	  i+=1;
		    	  
		      }
		     if(num!=0) {
		    	 count+=1;
		    			 if (num>max) {
		    				 max=num;
		    			 }
		    	         if (num<min) {
		    	        	 min=num;
		    	         }
		    	         sum+=num;
		     }
		     
		     }while(num!=0);
	          if (min==0 && max==0 && num==0) {
		System.out.println("You did not enter any number");}
		    	 System.out.println("Maximum number:"+max);
		    	 System.out.println("Minimum number:"+min);
		    	 System.out.println("Average number:"+sum/count);
		    	 


	}

}
