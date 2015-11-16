//  Printed out a linked list in reverse order 
public class ReverseLinkedList{
	
	private Node head;
	class Node{
		private Node next;
		private int data;

		Node(Node next,int data){
			this.next = next;
			this.data = data;
		}
	}

	private static void printLinkedList(Node node){
		
			while(node !=null){
				System.out.println(" "+ node.data );
				node  = node.next;
			}
	}
	
	public void addNodetoLinkedList(Node node){
		if(head == null){
			head = node;
		}
		while(head.next != null)
		{
			head = head.next;
		}
		head.next = node;
	}

	public void reverse(Node currNode){

		Node previousNode = null;
		Node nextNode;
		
		while(currNode !=null){
			nextNode = currNode.next;
			currNode.next = previousNode;
			previousNode = currNode;
			currNode = nextNode;
		}
		printLinkedList(previousNode);
	}

	public static void main(String[] args){

		//dec& init
		ReverseLinkedList object = new ReverseLinkedList();
		//create ll
		Node ll = new ReverseLinkedList().new Node(null,1);
		ll.next = new ReverseLinkedList().new Node(null,2);
		ll.next.next = new ReverseLinkedList().new Node(null,3);
		ll.next.next.next = new ReverseLinkedList().new Node(null,4);
		
		/*//create ll 
		Node head = new Node(null,1);
		object.addNodetoLinkedList(new Node(null,1));
		object.addNodetoLinkedList(new Node(null,2));*/
		// call method reverse
		
		//printLinkedList(ll);
		
		object.reverse(ll);
		
	}

}