import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class PlusMinus {
	
	/*static int add(int a, int b)
	{
		return a+b;
		
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int numberOfInputs = Integer.parseInt(input.nextLine());
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.addAll(Arrays.asList(input.nextLine().split("\\s+")));
		
		float positiveSum=0;
		float negativeSum=0;
		for(String x : arrayList)
		{
			float y = Integer.parseInt(x);

			if(y>0)
			{
				positiveSum +=1;
			}
			else if(y<0)
			{
				negativeSum +=1;
			}
		}

	System.out.println(positiveSum/numberOfInputs);		
	System.out.println(negativeSum/numberOfInputs);
	System.out.println((numberOfInputs-positiveSum-negativeSum)/numberOfInputs);
	}
}
