import java.util.Scanner;


public class TimeConversion {
	
	private static Scanner input; 
	
	private static String convertAMto24hr(String time12hr)
	{
		time12hr = time12hr.replaceAll("(?i)AM","");
		if(time12hr.substring(0, 2).equalsIgnoreCase("12"))
		{
			time12hr = time12hr.replaceFirst(time12hr.substring(0, 2), "00");
		}
		return time12hr;
	}
	
	private static String convertPMto24hr(String time12hr)
	{
		time12hr = time12hr.replaceAll("(?i)PM","");
		if(time12hr.substring(0, 2).equalsIgnoreCase("12"))
		{
			return time12hr;
		}
		int time = Integer.parseInt(time12hr.substring(0, 2));
		time = time +12;
		time12hr = time12hr.replaceFirst(time12hr.substring(0, 2), Integer.toString(time));
		
		return time12hr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input = new Scanner(System.in);
		String time12hr = input.nextLine();
		if (time12hr.contains("AM"))
		{
			System.out.println(convertAMto24hr(time12hr));
		}
		else
		{
			System.out.println(convertPMto24hr(time12hr));
		}

	}

}
