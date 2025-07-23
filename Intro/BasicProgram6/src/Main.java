import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int number;
		 System.out.println("Enter a number:");
		 Scanner scanner = new Scanner(System.in);  
	     number = scanner.nextInt();   
		 if(number % 2 == 0)
		 System.out.println(number + " is even.");
		 else
		 System.out.println(number + " is odd.");
	}

}
