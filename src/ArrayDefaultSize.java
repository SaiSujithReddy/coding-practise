
public class ArrayDefaultSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] A = new int[10];
		for(int i = 0; i< 5; i++){
			A[i] = i+2;
		}
		
		for(int i = 0; i< A.length; i++){
			System.out.print(" "+ A[i]);
		}

	}

}
