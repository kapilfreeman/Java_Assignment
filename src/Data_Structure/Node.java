/**
 * 
 */
package Data_Structure;

/**
 * @author kapilfreeman
 *
 */
public class Node {
	private int data;
	private Node next;
	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}
	public Node(int data) {
		this.data = data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}
	/**
	 * @return the next
	 */
	public Node getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(Node next) {
		this.next = next;
	}
	
	

}
		