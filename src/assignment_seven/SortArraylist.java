/**
 * 
 */
package assignment_seven;
import java.util.*;
/**
 * @author kapild
 *
 */
public class SortArraylist {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(8);
		numbers.add(8);
		numbers.add(9);
		numbers.add(2);
		numbers.add(2);
		numbers.add(3);
		System.out.println(numbers);
		
		Collections.sort(numbers);
		System.out.println("The sorted elements are "+ numbers);
		

	}

}
