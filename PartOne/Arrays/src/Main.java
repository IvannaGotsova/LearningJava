import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numbers = new int[10];
		
		Arrays.fill(numbers, 0);
		
		System.out.println(Arrays.toString(numbers));
		
		for (int i = 0; i < numbers.length; i++) {
			  numbers[i] = i + 1;
			}
	
		System.out.println(Arrays.toString(numbers));
	}

}