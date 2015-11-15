package careercup;
import java.util.ArrayList;
public class ConsecutiveSum
{

	private static int total =0;

	private static int add(int a , int b)
	{
		return a+b;
	}


	// TODO  sum method
	private static ArrayList<Integer> findSum(ArrayList<Integer> arrayList, int target )
	{

		ArrayList<Integer> tempArrayList = new ArrayList<Integer>();

		for(int k=0; k<arrayList.size(); k++ )
			

		{
			int total = arrayList.get(k); 
			int z =0;
			
			System.out.println("number is " + arrayList.get(k));
			
			for(int i=z+k; i< arrayList.size()-1;i++)
			{
				int j=0;
				if(total<target)
				{
					total = add(total,arrayList.get(i+1));
					System.out.println("total is " + total);
					j++;
				}

				else if(total == target)
				{
					tempArrayList.add(i);
					tempArrayList.add(j);
					System.out.println(tempArrayList.toString());
					total =0;
					break;
				}

				z++;
			}
			
		}
		return tempArrayList;


	}



	public static void main (String[] args)

	{

		// TODO initialize arraylist

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);

		int target = 7;

		// TODO find sum method

		// TODO for loop 

		arrayList1 = findSum(arrayList,target );

		for (int i=0; i<arrayList1.size();i++)
		{
			System.out.println(arrayList1.get(i)+ " " + arrayList1.get(i+1));
			i++;
		}

	}

}