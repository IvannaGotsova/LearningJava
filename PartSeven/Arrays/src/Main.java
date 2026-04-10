
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]); 
			numbers[i] /= 10;
			System.out.println(numbers[i]); 
		}
		
	}

}
