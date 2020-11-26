/**
 * 
 */
package Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 * @author kapilfreeman
 *
 */
public class FileHandling {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File inputFile=new File("input.txt");
		Scanner in =new Scanner(inputFile);
		while(in.hasNextDouble()) {
			double value=in.nextDouble();
			System.out.println(value);
		}
		

	}

}
