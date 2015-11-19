package ctci;
import java.util.LinkedList;
import java.util.ListIterator;

public class CTCI2dot2v2LinkedListGetThirdItemFromLast {
	static int k =3;
	static int findElement(LinkedList<String> items,int k)
	{
		ListIterator<String> listIterator =  items.listIterator();
		while(listIterator.hasNext())
		{
			listIterator.next();
		}
		for(int i=0;i<k-1;i++)
		{
			listIterator.previous();
		}
		System.out.println(listIterator.previous());
		System.out.println(items.get(items.size()-k));
		
		return k;
	}
	
	public static void main(String[] args)
	{
		
		LinkedList<String> linkedList = new LinkedList();
		   linkedList.add("eBay");
	        linkedList.add("Paypal");
	        linkedList.add("Google");
	        linkedList.add("Yahoo");
	        linkedList.add("IBM");
	        linkedList.add("Facebook");
		findElement(linkedList,k);
	}

}
