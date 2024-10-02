import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int first;
		int second;
		int third;
		System.out.println("Enter three numbers:");
		Scanner scanner = new Scanner(System.in);  
		first = scanner.nextInt();   
		second = scanner.nextInt();
		third = scanner.nextInt();
		
		int max;
		int min;
		
		 max = (first > second) ? (first > third ? first : third) : (second > third ? second : third);
		 min = (first < second) ? (first < third ? first : third) : (second < third ? second : third);
		 
		 System.out.println("Max number is: " + max);
		 System.out.println("Min number is: " + min);
	}

}
