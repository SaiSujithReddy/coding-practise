package coderust;

/**
 * Created by sai on 12/9/16.
 */

public class LinkedListRotateByN_v1 {

    int findLengthOfLinkedList(Node head) {
        int lengthCount = 0;
        while(head !=null) {
            head = head.next;
            lengthCount++;
        }
        return lengthCount;
    }

    Node rotateByN(Node head, int n) {

        int length = findLengthOfLinkedList(head);

        System.out.println("value of n/length " + n/length + "n%length " + n%length);
        n = length -n%length;
        if(n == length) {
            return head;
        } else {
            Node original_head = head;
            Node new_head;
            Node new_tail;

            while (n > 1) {

                head = head.next;
                n--;
            }
            new_tail = head;
            new_head = head.next;
            while (head.next != null) {
                head = head.next;
            }
            head.next = original_head;
            new_tail.next = null;

            return new_head;
        }
    }

    void printLinkedList(Node head) {

        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;

        }
        System.out.println();
    }

    public static void main (String[] args) {

        LinkedListRotateByN_v1 obj = new LinkedListRotateByN_v1();


        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = null;

        obj.printLinkedList(node1);
        obj.printLinkedList(obj.rotateByN(node1,79));

    }

}

/*
Complexity -
Time - O(2n)
Space- O(1)

remember rotations length can be more than the length of the linkedlist

Took 32 min end - end (with correct output)

 */