
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {1, 3, 5, 7, 10, 13, 17, 20, 22, 25, 28, 30, 32, 36, 39, 42, 44, 47, 50};
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
		  sum += numbers[i];
		}

		System.out.println("The sum is: " + sum);
	}

}
