import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Integer> numbers = new ArrayList();
		
		for (int i = 0; i < 10; i++) {
			numbers.add(i + 1);
			System.out.println(numbers.get(i));
		}
	}

}
