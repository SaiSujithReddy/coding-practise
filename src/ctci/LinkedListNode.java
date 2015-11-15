package ctci;

public class LinkedListNode {

	public LinkedListNode next;
	public LinkedListNode prev;
	public LinkedListNode last;
	public int data;
	public LinkedListNode(int d,LinkedListNode n, LinkedListNode p)
	{
		data = d;
		setNext(n);
		setPrevious(p);
		
	}
	
	public LinkedListNode()
	{}
	
	public void setNext(LinkedListNode n)
	{
		next = n;
		if(this == last)
		{
			last = n;
		}
		if(n!=null && n.prev != this)
		{
			n.setPrevious(this);
		}
		
		if(n.data)
		{
			return; // case of no element
		}
		
		
		
		
		
	}
	
	public void setPrevious(LinkedListNode p)
	{
		
	}
	

}
