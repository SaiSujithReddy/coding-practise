package careercup;

//Given a tree, where the parent has any number of nodes and each node has a number, return the average of all the nodes on each level in an array.
import java.util.ArrayList;
public class AverageSumOfTreeLevel{
	//Tree class initialize
	AverageSumOfTreeLevel right;
	AverageSumOfTreeLevel left;
	int data;
	//ArrayList<Integer> al = new ArrayList<Integer>(); 
	ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
	//default constructor

	//public AverageSumOfTreeLevel(){};
	//constructor
	public AverageSumOfTreeLevel(AverageSumOfTreeLevel right,AverageSumOfTreeLevel left,int data){
		this.right = right;
		this.left = left;
		this.data = data;
	};

	private void printAverage(ArrayList<Double> al){
		for(Double i : al){
			System.out.print(" " + i);
		}
		System.out.println();
	}


	private int findAverageOfEachLevel(){
		if(this.right != null & this.left != null)
			return (this.right.data + this.left.data )/2;

		else if(this.right == null & this.left == null)
			return this.left.data ;

		else if (this.right != null & this.left == null)
			return this.right.data ;

		else 
			return -1; //error
	}

	/*public ArrayList<Integer> findAverage(){

//sum method for each level 
//calculate no of nodes each level 
//calculate average
if(this.data == 0){
    return al;
}

if(this.right != null | this.left != null){

    al.add((this.left.findAverageOfEachLevel() + this.right.findAverageOfEachLevel())/2);
}


if(this.right == null | this.left != null){
    this.left.findAverage();
}

if(this.right != null | this.left == null){
    this.right.findAverage();
}

if(this.right == null | this.left == null){
    return al;
}

al.add(findAverageOfEachLevel());


printAverage(al);
return al;
}*/

	public ArrayList<Double> getAverageArray(){
		int level=0;
		checkSize(level);
		al.get(level).add(data);
		addArray(left,right,level+1);
		ArrayList<Double> averageArr= new ArrayList<Double>();
		for(ArrayList<Integer> arr : al){
			int sum=0;
			for(int val :arr) {
				sum += val;
			}
			averageArr.add(sum*1.0/arr.size());
		}
		return averageArr;
	}

	private void checkSize(int index){
		if(al.size()<index+1){
			al.add(new ArrayList<Integer>());
		}
	}

	private void addArray(AverageSumOfTreeLevel left,AverageSumOfTreeLevel right,int level){
		if(left !=null) {
			checkSize(level);
			al.get(level).add(left.data);
			addArray(left.left,left.right,level+1);
		}
		if(right !=null) {
			checkSize(level);
			al.get(level).add(right.data);
			addArray(right.left,right.right,level+1);
		}

	}


	public static void main(String[] args){

		//dec & initiza tree

		AverageSumOfTreeLevel Tree = new AverageSumOfTreeLevel(null,null,1);
		//Tree.left
		Tree.right = new AverageSumOfTreeLevel(null,null,2);
		Tree.right.left = new AverageSumOfTreeLevel(null,null,3);
		Tree.right.right = new AverageSumOfTreeLevel(null,null,4);
		Tree.left = new AverageSumOfTreeLevel(null,null,5);
		Tree.left.left = new AverageSumOfTreeLevel(null,null,6);
		Tree.left.right = new AverageSumOfTreeLevel(null,null,7);
		Tree.left.left.left = new AverageSumOfTreeLevel(null,null,6);
		Tree.left.right.left = new AverageSumOfTreeLevel(null,null,7);
		Tree.left.left.right = new AverageSumOfTreeLevel(null,null,6);
		Tree.left.right.right = new AverageSumOfTreeLevel(null,null,7);

		//call method
		Tree.printAverage(Tree.getAverageArray());
		//Tree.findAverage();
	}

}