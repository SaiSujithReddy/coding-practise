
// For complete Binary tree - Count the nodes == 2^h -1 and then count 
//the height ..if 2^h -1 = nodes then complete binary tree



package careercup;
public class CompleteBinaryTree{
    int data;
    CompleteBinaryTree left;
    CompleteBinaryTree right;
    
    static int right_height =0;
    static int left_height =0;

    public CompleteBinaryTree(){};

    public CompleteBinaryTree(int data,CompleteBinaryTree left,CompleteBinaryTree right){
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public boolean findIfCompleteBinaryTree(){
        
        if(this.left !=null){
            if(this.right ==null ) return false;
            if(this.left.findIfCompleteBinaryTree()){
            	System.out.println("Increasing left height - curr height " +left_height );
            System.out.println("this.data = " +this.data );
            left_height++;
            }
        }

        if(this.right !=null){
            if(this.left ==null ) return false;
            if(this.right.findIfCompleteBinaryTree())
            right_height++;
        }
        if(this.right ==null & this.left == null){
        	return true;
        }
        
        
        System.out.println(" left_height is " + left_height);
        System.out.println(" right_height is " + right_height);
        return right_height == left_height;
    }

    public static void main(String[] args){

        CompleteBinaryTree newCompleteBinaryTree = new CompleteBinaryTree();
        newCompleteBinaryTree = new CompleteBinaryTree (1,null,null);
        newCompleteBinaryTree.left = new CompleteBinaryTree (2,null,null);
        newCompleteBinaryTree.right = new CompleteBinaryTree (3,null,null);
        newCompleteBinaryTree.right.right = new CompleteBinaryTree (4,null,null);
        newCompleteBinaryTree.right.left = new CompleteBinaryTree (5,null,null);
        newCompleteBinaryTree.left.right = new CompleteBinaryTree (6,null,null);
        newCompleteBinaryTree.left.left = new CompleteBinaryTree (7,null,null);
        System.out.println(newCompleteBinaryTree.findIfCompleteBinaryTree());
    }
}