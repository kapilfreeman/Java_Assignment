/**
 * 
 */
package two;

import java.util.Scanner;

/**
 * @author kapilfreeman
 *
 */
public class CheckDie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double start=10.0;
	     
	     System.out.print("You have:$"+start);
	     Scanner scan=new Scanner(System.in);
	     while (start>0) {
	     System.out.print("How much would you like to bet?");
	     
	     double betAmount=scan.nextDouble();
	     Die die1=new Die();
	     int roll1 = die1.roll();
	     int roll2 = die1.roll();
	     System.out.print("You rolled "+die1.toString(roll1)+" and "+die1.toString(roll2));
	     boolean win;
	     win= (roll1==roll2);
	     if (win) {
	    	 System.out.println("You win $"+betAmount*2);
	    	 start+=2*betAmount;
	    	 
	     }else
	    	 System.out.println("You lost $"+betAmount*2);
	    	 start-=betAmount;
	     }
	     System.out.println("Better luck next time");
	     
	     
	}



	}


