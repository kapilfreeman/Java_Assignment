/**
 * 
 */
package Data_Structure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;

/**
 * @author kapilfreeman
 *
 */
public class ActiveUser {
	
	// TODO Auto-generated method stub
			//initializing the dictionary to store values
			Hashtable<String, String> my_dict = new Hashtable<String, String>();
			String line="";
			String splitBy=",";
		    boolean newData=true;
		 
				//PARSE csv file
		    public void readfile() throws IOException {
		    	BufferedReader br=new BufferedReader(new FileReader("activeusers.txt"));
		    	while((line=br.readLine())!=null) {
					String[] users=line.split(splitBy);
					System.out.println(users[0]+users[1]);
					my_dict.forEach((K,V)->{
						if(K==users[0]) {
							int a=Integer.parseInt(V)+Integer.parseInt(users[1]);	
							my_dict.replace(K,Integer.toString(a));
							newData=false;
								
							}
						});
						if(newData) {
							my_dict.put(users[0], users[1]);
							newData=true;
						}
						
						//I was trying to store the value into dictionary first to remove duplicate by adding session time, 
						//but I don't know why 
						//It's not adding the session time to a particular user.
						
				}
					
				
		    	
		    }
		    	
		    
}
