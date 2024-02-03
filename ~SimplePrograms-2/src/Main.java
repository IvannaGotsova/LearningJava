
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sumOfTwoNumbers(5, 7));
		splitString("Something Anything Nothing Everything");
	}
	
	static int sumOfTwoNumbers (int first, int second) {
		return first + second;
	}
	
	static void splitString (String string) {
		String [] stringTwo = string.split(" ");
		System.out.println(stringTwo[1]);
	}

}
