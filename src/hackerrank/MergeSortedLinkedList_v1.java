package hackerrank;

/**
 * Created by sai on 12/7/16.
 */
// Merge two sorted linkedlists

public class MergeSortedLinkedList_v1 {

    Node mergeLinkedList(Node firstNode, Node secondNode) {

        Node original_first_node = firstNode;

        int countPositionOfFirstNode=0;
        while(firstNode !=null && secondNode != null) {

            if(firstNode.data >= secondNode.data) {

                System.out.println("firstNode > secondNode " + firstNode.data +" " + secondNode.data);

                insertNodeInLinkedList(original_first_node,secondNode.data,countPositionOfFirstNode);
                //countPositionOfFirstNode++;


                if(secondNode.next !=null ) {
                    secondNode = secondNode.next;
                }  else return original_first_node;

            } else {

                System.out.println("firstNode < secondNode " + firstNode.data +" " + secondNode.data);
                //countPositionOfFirstNode++;

                if(firstNode.next !=null ) {
                    firstNode = firstNode.next;
                } else {
                    firstNode.next = secondNode;
                    return original_first_node;
                }
            }
            countPositionOfFirstNode++;
        } if (firstNode == null) {
            return secondNode;
        }
        return 	original_first_node;
    }

    void printLinkedList (Node head) {

        while(head != null) {

            System.out.println(head.data);

            head = head.next;
        }
    }

    Node insertNodeInLinkedList(Node head, int data, int position) {

        Node original_head = head;

        Node node = new Node();
        node.data = data;

        if(head == null) {

            System.out.println("Head is null, Please input correct node");

        } else {
            for(int i=1; i< position; i++) {

                head = head.next;

            }
            node.next = head.next;
            head.next = node;
        }


        return original_head;

    }




    public static void main (String[] args) {


        MergeSortedLinkedList_v1 obj = new MergeSortedLinkedList_v1();

        Node node2 = new Node();
        node2.next = null;
        node2.data = 2;
        Node node6 = new Node();
        node6.next = null;
        node6.data = 6;
        Node node8 = new Node();
        node8.next = null;
        node8.data = 8;
        Node node10 = new Node();
        node10.next = null;
        node10.data = 10;
        node2.next = node6;
        node6.next = node8;
        node8.next = node10;

        Node node3 = new Node();
        node3.next = null;
        node3.data = 3;
        Node node4 = new Node();
        node4.next = null;
        node4.data =4;
        Node node5 = new Node();
        node5.next = null;
        node5.data = 5;
        Node node7 = new Node();
        node7.next = null;
        node7.data = 7;
        Node node88 = new Node();
        node88.next = null;
        node88.data = 7;
        node3.next = node4;
        node4.next = node5;
        node5.next = node7;
        node7.next = node88;

        Node node1 = new Node();
        node1.next = null;
        node1.data = 1;
        Node node11 = new Node();
        node11.next = null;
        node11.data = 11;
        Node node12 = new Node();
        node12.next = null;
        node12.data = 12;
        node1.next = node11;
        node11.next = node12;





        obj.printLinkedList(obj.mergeLinkedList(node1,node2));


    }


}





// Remember to pass always the head while printing thr linked list

//mistake done by me.
//Always pass the head in insertLinkedList method

//insertNodeInLinkedList(original_first_node,secondNode.data,countPositionOfFirstNode);

// but not insertNodeInLinkedList(first_node,secondNode.data,countPositionOfFirstNode);



/*
it is good, but fails for following case
node 1 = 11,12
node 2 = 1,2,3,4,5,6

 */

