/**
 * 
 */
package Data_Structure;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author kapilfreeman
 *
 */
public class SortArraylist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> num=new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(2);
		num.add(3);
		num.add(6);
		num.add(8);
		num.add(8);
		num.add(9);
		
		//numbers before sorting
		System.out.println("Number before sorting");
		for(int number: num) {
			System.out.println(number);
		}
		Collections.sort(num);
		//numbers after sorting
		System.out.println("Number after sorting");
		for(int number:num) {
			System.out.println(number);
		}

	}

}
