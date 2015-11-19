package careercup;

public class FindBinaryTree{

public class Node{
Node right;
Node left;
int data;


public Node (Node right, Node left, int data){
this.right = right ;
this.left = left;
this.data =data;
}
}


public boolean isBinarySearchTree(Node root, Integer min, Integer max) {
        if (root != null) {
            Integer value = (Integer) root.data;
            if (root.left != null) {
                Integer left = (Integer) root.left.data;
                if (!(value > left &&
                     (min == null || left > min) &&
                     (max == null || left < max) &&
                     isBinarySearchTree(root.left, min, value)))
                {
                    return false;
                }
            }
            if (root.right != null) {
                Integer right = (Integer) root.right.data;
                if (!(value < right &&
                     (min == null || right > min) &&
                     (max == null || right < max) &&
                     isBinarySearchTree(root.right, value, max)))
                {
                    return false;
                }
            }
        }
        return true;
    }


// findBST()
/*got ot root .. get data .. check if root.left.data <data < root.right.data
temp = root
left --> all below are < temp
right --> all below are > temp
iterate
keepitereting root.left.left.data < root.left.data <root.left.right.data <data < root.right.data < 
*/

public static void main(String[] args){

Node root = new Node(null,null,1);


isBinarySearchTree(root);

}

}