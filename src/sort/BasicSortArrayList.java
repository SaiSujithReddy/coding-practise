package sort;

import java.util.ArrayList;
import java.util.Random;
public class BasicSortArrayList{

	public void sort(ArrayList<Integer> arrayList){

		System.out.println("Before Sorting " + arrayList);
		int temp =0;
		for(int i=0; i< arrayList.size();i++){
			for(int j=i;j<arrayList.size();j++){
				if(arrayList.get(i)>arrayList.get(j)){
					System.out.println("swapping "+ arrayList.get(i) + " " + arrayList.get(j));
					temp = arrayList.get(j);
					arrayList.set(j, arrayList.get(i));
					arrayList.set(i,temp);

				}   
			}
		}

		System.out.println("After Sorting " + arrayList);
	}

	public static void main (String[] args){

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		Random random = new Random();
		for(int i=0; i<10;i++)
		{
			arrayList.add(random.nextInt(300));
		}

		BasicSortArrayList Object = new BasicSortArrayList();
		Object.sort(arrayList);
	}

}
