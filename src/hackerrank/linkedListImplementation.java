package hackerrank;

/**
 * Created by sai on 12/7/16.
 */

class Node {
    int data;
    Node next;
}


public class linkedListImplementation {

    void print(Node head) {

        while(head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    Node insertTailNode(Node head, int data) {

        Node node = new Node();
        node.data = data;
        node.next = null;
        Node original_head = head;

        while(head.next != null) {
            head = head.next;
        }
        head.next = node;

        return original_head;
    }

    Node insertHeadNode(Node head, int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;

        return node;
    }


    public static void main(String[] args) {
        linkedListImplementation obj = new linkedListImplementation();
        Node node = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        node.data = 1;
        node.next = node2;
        node2.data = 2;
        node2.next = node3;
        node3.data = 3;
        node3.next = null;

        obj.print(node);
        System.out.println();

        obj.print(obj.insertTailNode(node,4));
        System.out.println();

        obj.print(obj.insertHeadNode(node,0));
        System.out.println();

    }
}
