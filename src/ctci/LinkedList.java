package ctci;

public class LinkedList <T> 
{
	Node head;
	
	class Node{
		Node next;
		T value;
		
		Node(T value)
		{
			this.value = value;
		}
	}
	
	public void add(T value)
	{
		if(head==null)
		{
			head = new Node(value);
			return;
		}
		
		Node t = head;
		while(t.next != null)
		{
			t = t.next;
		}
		t.next = new Node(value);
	}
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void remove(T value, Node node)
	{
		if(head == null) return;
		Node t = head;
		while(t.next != node)
		{
			t = t.next;
		}
		t.next = node.next;
		
	}
	
	@Override
	public String toString()
	{
		StringBuilder bf = new StringBuilder();
		Node t = head;
		while(t!=null)
		{
			bf.append(t.value);
			t = t.next;
		}
		return bf.toString();
	}
}
