package coderust;
import java.util.Stack;

/**
 * Created by sai on 12/19/16.
 */


// TODO - certain cases are wrong - needs work
public class BSTInorderSuccessor_v1 {

    TreeNode inorderSuccessor(TreeNode root, TreeNode node) {

        System.out.println("Printing node data " + node.data);

        Stack stack = new Stack();

        while(root !=null || !stack.isEmpty()) {

            if(root != null) {
                stack.push(root);
                if(root == node && root.left != null) {
                    root = root.left;
                    return root;
                }
                root = root.left;
            } else {
                TreeNode tNode = (TreeNode) stack.pop();
                root = tNode.right;
                if(tNode == node ) {
                    if(root != null) {
                        return root;
                    } else return (TreeNode) stack.peek();
                }

            }

        }


        return root;
    }

    public static void main (String[] args) {
        BSTInorderSuccessor_v1 obj = new BSTInorderSuccessor_v1();

        TreeNode Main1 = new TreeNode(1);
        TreeNode Main2 = new TreeNode(2);
        TreeNode Main3 = new TreeNode(3);
        TreeNode Main4 = new TreeNode(4);
        TreeNode Main5 = new TreeNode(5);
        TreeNode Main6 = new TreeNode(6);
        TreeNode Main7 = new TreeNode(7);
        //TreeNode Main8 = new TreeNode(8);

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


        TreeNode tNode = obj.inorderSuccessor(Main4,Main6);

        System.out.println(tNode.data);

    }

}
