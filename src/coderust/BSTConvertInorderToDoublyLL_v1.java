package coderust;

/*
 * Created by sai on 12/19/16.
 */

// It doesn't work because you tried with recursive

public class BSTConvertInorderToDoublyLL_v1 {


    void recursiveInorder(TreeNode root, Node head) {
        if(root != null) {
            recursiveInorder(root.left,head);
            Node node = new Node(root.data);
            System.out.println(" root data is  " + root.data);
            if(head != null) {
                System.out.println(" head is NOT null " + head.data);
                head.next = node;
                head = head.next;
                System.out.println(" head is NOT null " + head.data);
            } else {
                System.out.println(" head is null " );
                head = node;
            }
            recursiveInorder(root.right,head);

        } else return;
    }

    void convertToLL (TreeNode root, Node ll) {

                recursiveInorder(root,ll);
        printLinkedList(ll);
    }

    void printLinkedList(Node head) {
        while(head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main (String[] args) {
        BSTConvertInorderToDoublyLL_v1 obj = new BSTConvertInorderToDoublyLL_v1();

        TreeNode Main1 = new TreeNode(1);
        TreeNode Main2 = new TreeNode(2);
        TreeNode Main3 = new TreeNode(3);
        TreeNode Main4 = new TreeNode(4);
        TreeNode Main5 = new TreeNode(5);
        TreeNode Main6 = new TreeNode(6);
        TreeNode Main7 = new TreeNode(7);

        Main4.left = Main2;

        Main2.left = Main1;
        Main2.right = Main3;

        Main4.right = Main6;
        Main6.left = Main5;
        Main6.right = Main7;

                /*

                 4
               /   \
              2    6
             / \   /\
            1   3 5  7

                 */

        Node ll = new Node(-1);
        obj.convertToLL(Main4,ll);
    }
}


// you cannot use recursive because head will not be updated 