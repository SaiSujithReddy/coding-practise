import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class AngryProfessor {
	
	private static Scanner input;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		input = new Scanner(System.in);
		int noOfTestCases = Integer.parseInt(input.nextLine());
		for(int i=0; i< noOfTestCases;i++)
		{
			ArrayList<String> arrayListOfNandK = new ArrayList<String>();
			String listKandN = input.nextLine();
			arrayListOfNandK.addAll(Arrays.asList(listKandN.split("\\s+")));
			//System.out.println(arrayListOfNandK);
			int noOfStudents;
			noOfStudents = Integer.parseInt(arrayListOfNandK.get(0));
			ArrayList<String> arrayListOfStudents = new ArrayList<String>();
			String listOfStudents = input.nextLine(); 
			arrayListOfStudents.addAll(Arrays.asList(listOfStudents.split("\\s+")));
			
				int studentInClass =0;
				for(String student:arrayListOfStudents )
				{
					if(Integer.parseInt(student)<=0)
					{
						studentInClass++;
					}
					
				}
				if (studentInClass>=Integer.parseInt(arrayListOfNandK.get(1)))
				{
					System.out.println("NO");
				}
				else
				{
					System.out.println("YES");
				}
			
		}

	}

}
