
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		checkTribonacciNumbers(0);
	}
	
	private static void checkTribonacciNumbers(int numbers) {
		// TODO Auto-generated method stub
		   int firstNumber = 0;
		   int secondNumber = 1;
		   int thirdNumber = 1;
		   
		   if (numbers == 0) System.out.print(firstNumber);
		   if (numbers == 1) System.out.print(firstNumber + ", " + secondNumber);
		   if (numbers >= 2)System.out.print(firstNumber + ", " + secondNumber  + ", " + thirdNumber);
		   
		   for (int i = 3; i <= numbers; i++) {
			   
			   int nextNumber = firstNumber + secondNumber + thirdNumber;
			   
			   System.out.print(", " + nextNumber);
			   
			   firstNumber = secondNumber;
			   secondNumber = thirdNumber;
			   thirdNumber = nextNumber;
	   
		   }
	}
}
