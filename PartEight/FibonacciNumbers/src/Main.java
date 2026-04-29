
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		checkFibonacciNumbers(0);
		
	}
	
	private static void checkFibonacciNumbers(int numbers) {
		// TODO Auto-generated method stub
		   int firstNumber = 0;
		   int secondNumber = 1;
		   
		   if (numbers == 0) System.out.print(firstNumber);
		   if (numbers >= 1) System.out.print(firstNumber + ", " + secondNumber);
		   
		   for (int i = 2; i <= numbers; i++) {
			   
			   int nextNumber = firstNumber + secondNumber;
			   
			   System.out.print(", " + nextNumber);
			   
			   firstNumber = secondNumber;
			   secondNumber = nextNumber;
	   
		   }

	}
}
