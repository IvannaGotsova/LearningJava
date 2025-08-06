import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> originalNumbers = new ArrayList<>(Arrays.asList (1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		
		ArrayList<Integer> cloneNumbers = (ArrayList<Integer>)originalNumbers.clone();
		
		cloneNumbers.add(null);
		cloneNumbers.add(null);
		cloneNumbers.add(null);
		cloneNumbers.add(null);
		cloneNumbers.add(null);
		
		originalNumbers.forEach(x -> System.out.println(x));
		cloneNumbers.forEach(x -> System.out.println(x));
	}

}
