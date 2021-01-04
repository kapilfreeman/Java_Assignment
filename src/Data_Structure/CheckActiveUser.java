/**
 * 
 */
package Data_Structure;

import java.io.IOException;

/**
 * @author kapilfreeman
 *
 */
public class CheckActiveUser {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ActiveUser act=new ActiveUser();
		act.readfile();
		System.out.println(act.my_dict);

	}

}
