import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int number;
		System.out.println("Enter your number:");
		Scanner scanner = new Scanner(System.in);  
		number = scanner.nextInt();   
		if (number > 0) {
		  System.out.println("The number is a positive one.");
		} else if (number < 0) {
		  System.out.println("The number is a negative one.");
		} else {
		  System.out.println("The number is 0.");
		}
	}

}
