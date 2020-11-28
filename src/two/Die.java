/**
 * 
 */
package two;

import java.util.Random;

/**
 * @author kapilfreeman
 *
 */
public class Die {
	public static int roll(){
		Random rand = new Random(); 
        //outputs random number between 0,6
        int rand_int1 = rand.nextInt(6);
        return rand_int1+1;
	}
	
	public static boolean equals(int i, int j) {
		if (i==j){
			return true;
		}
		return false;}
		
	public static String toString (int n){
		switch (n) {
		case(1):
			return "One";
		 case (2):
			return "Two";
		
		case (3):
			return "Three";
		
		case (4):
			return "Four";
		
		case(5):
			return "Five";
		
		case (6):
			return "Six";}
		
		return "None";	
	}

}
