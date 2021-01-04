/**
 * 
 */
package Data_Structure;

/**
 * @author kapilfreeman
 *
 */
public class ReverseLinkedList {
	Node start=null;
	
	public void PrintLinkedListInReverseOrder() {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		Node n8 = new Node(8);

		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		n5.setNext(n6);
		n6.setNext(n7);
		n7.setNext(n8);

		start = n1; 
		printLinkedListInReverse(start);
	}
	
	//Using Recursion
	public void printLinkedListInReverse(Node startNode){
		if(startNode==null){
			return;
		}
		printLinkedListInReverse(startNode.getNext());
		System.out.print(startNode.getData() + " " );
	}

	
	public static void main(String[] args) {

		ReverseLinkedList test=new ReverseLinkedList();
		test.PrintLinkedListInReverseOrder();
	}
	

	
}



