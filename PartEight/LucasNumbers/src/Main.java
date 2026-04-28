
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		checkLucasNumbers(50);
	}
	
	private static void checkLucasNumbers(int numbers) {
		// TODO Auto-generated method stub
		   int firstNumber = 2;
		   int secondNumber = 1;
		   
		   System.out.print(firstNumber + ", " + secondNumber);
		   
		   for (int i = 2; i <= numbers; i++) {
			   
			   int nextNumber = firstNumber + secondNumber;
			   
			   System.out.print(", " + nextNumber);
			   
			   firstNumber = secondNumber;
			   secondNumber = nextNumber;
	   
		   }

	}

}
