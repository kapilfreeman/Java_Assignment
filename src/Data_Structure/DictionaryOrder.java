/**
 * 
 */
package Data_Structure;

/**
 * @author kapilfreeman
 *
 */
public class DictionaryOrder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words= {"A","Mahesh","abc","123","4 Serv","Abcd"};
		System.out.println("Before Dictionary order");
		for(String before: words) {
			System.out.println(before);
		}
		for(int i=0;i<words.length;i++) {
			for(int j=0;j<words.length;j++) {
				if(words[i].compareTo(words[j])>0) {
					String temp=words[i];
					words[i]=words[j];
					words[j]=temp;
					
				}
			}
		}
		System.out.println("After dictionary order:");
		for (String after: words) {
			System.out.println(after);
		}


	}
}
