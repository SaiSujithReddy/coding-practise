package careercup;

public class StringNumberCount{
	static int count =0;

	public void findNumberOfIntegers(int text){

		int number = text;
		
		int tempNumber = text/10;
		int glovalvar = text;
		while(number >0){
			if((number%100) <27){
				
				System.out.println("number is 1st while " + number);
				count++;
			}
	     	number = number/100;
			System.out.println(number);
		}
		System.out.println(count);
		while(tempNumber >9){
			if((tempNumber%100) <27){
				System.out.println("number is 2nd while " + tempNumber);
				count++;
			} 	
			tempNumber= tempNumber/100;
		}      
		System.out.println(count);
		while(glovalvar >9){
			count++;
			glovalvar = glovalvar/10;
		}
		System.out.println(count);


		System.out.println("Total count is "+ count);
	}
	public static void main(String [] args){

		int text = 12231;
		StringNumberCount ObjectStringNumberCount = new StringNumberCount();
		//System.out.println("HALO");
		ObjectStringNumberCount.findNumberOfIntegers(text);

	}
}