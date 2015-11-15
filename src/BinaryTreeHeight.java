public class BinaryTreeHeight {

int data;
BinaryTreeHeight left;
BinaryTreeHeight right;

public BinaryTreeHeight(int data,BinaryTreeHeight left,BinaryTreeHeight right){
	this.data = data;
	this.left = left;
	this.right = left;
}

public BinaryTreeHeight(){
}
public BinaryTreeHeight left() {
    return this.left;
  }

  public BinaryTreeHeight right() {
    return this.right;
  }

public int heightOfTree(){
	int left_height = 0;
	int right_height = 0;
	if(this.left !=null){
left_height = this.left.heightOfTree();
	}
	if(this.right !=null){
right_height = this.right.heightOfTree();
	}
return left_height>right_height?left_height+1:right_height+1;
}

public static void main(String[] args){


	BinaryTreeHeight newBinaryTree ;
	newBinaryTree = new BinaryTreeHeight(1,null,null);
	newBinaryTree.left = new BinaryTreeHeight(2,null,null);
	newBinaryTree.right = new BinaryTreeHeight(2,null,null);
	newBinaryTree.heightOfTree();
	
}
}