
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sumOfTwoNumbers(5, 7));
		splitString("Something Anything Nothing Everything");
		sumOfTwoEvenNumbers(4, 6);
		sumOfTwoEvenNumbers(4, 5); 
		sumOfTwoOddNumbers(3, 5);
		sumOfTwoOddNumbers(4, 5); 
	}
	
	static int sumOfTwoNumbers (int first, int second) {
		return first + second;
	}
	
	static void splitString (String string) {
		String [] stringTwo = string.split(" ");
		System.out.println(stringTwo[1]);
	}
	
	static void sumOfTwoEvenNumbers (int first, int second) {
		if (first % 2 == 0 
		 & second % 2 == 0) {
			System.out.println(first + second);
		} else {
		System.out.println("Not Even Numbers");
		}
	}
	
	static void sumOfTwoOddNumbers (int first, int second) {
		if (first % 2 != 0 
		 & second % 2 != 0) {
			System.out.println(first + second);
		} else {
		System.out.println("Not Odd Numbers");
		}
	}
	
	
	

}
