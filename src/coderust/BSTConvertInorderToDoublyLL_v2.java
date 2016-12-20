package coderust;

/*
 * Created by sai on 12/19/16.
 */



import java.util.Stack;

public class BSTConvertInorderToDoublyLL_v2 {


    void iterativeInorder(TreeNode root, Node head) {

        Stack stack = new Stack();

        while (root != null || !stack.isEmpty()) {
            if(root != null) {
                stack.push(root);
                root = root.left;
            } else {

                TreeNode newRoot =  (TreeNode) stack.pop();
                //System.out.println(newRoot.data);
                if(head == null) {
                    head.data = newRoot.data;
                    head.next = null;
                } else {
                    Node newNode = new Node(newRoot.data);
                    head.next = newNode;
                    head = head.next;
                }
                root = newRoot.right;
            }

        }
    }

    void convertToLL (TreeNode root, Node ll) {

        iterativeInorder(root,ll);
        printLinkedList(ll.next);
    }

    void printLinkedList(Node head) {
        while(head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main (String[] args) {
        BSTConvertInorderToDoublyLL_v2 obj = new BSTConvertInorderToDoublyLL_v2();

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


// Using iterative i solved it for singly LinkedList