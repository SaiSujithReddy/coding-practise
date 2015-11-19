package ctci;
import java.util.LinkedList;
import java.util.ListIterator;
import javax.xml.soap.Node;

public class CTCI2dot3v1DeleteNode {

	static int n = 3;
	
	private static void printLinkedList(LinkedList ll)
	{
		ListIterator linkedlistIterator = ll.listIterator();
		while(linkedlistIterator.hasNext())
		{
			System.out.println(linkedlistIterator.next());
		}
	}

	static LinkedList deleteNode(LinkedList ll, int n)
	{
		//TODO list iterator to n 
		ListIterator listIterator = ll.listIterator();

		for (int i=0;i<n;i++)
		{
			//listIterator.next();
			System.out.println(listIterator.next());
		}

		ll.remove(n);

		//ask for single or double linkedlist


		// TODO set previous & set Next

		return ll;
	}

	public static void main (String[] args)

	{

		// TODO create Linkedlist

		LinkedList ll = new LinkedList();
		ll.add("1");
		ll.add("2");
		ll.add("3");
		ll.add("4");
		ll.add("5");
		ll.add("6");
		ll.add("7");
		System.out.println(ll);



		deleteNode( ll,n);
	}

}
