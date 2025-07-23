import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNumber;
		int secondNumber;
		System.out.println("Enter two numbers:");
		Scanner scanner = new Scanner(System.in);  
		firstNumber = scanner.nextInt();   
		secondNumber = scanner.nextInt();
		int sum = firstNumber + secondNumber;
		System.out.println("Sum is: " + sum);
      
	}

}
