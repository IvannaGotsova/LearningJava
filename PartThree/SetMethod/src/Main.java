import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	    
		numbers.set(0, 0);
		numbers.set(1, 0);
		numbers.set(2, 0);
		numbers.set(3, 0);
		numbers.set(4, 0);
		
		
		System.out.println(numbers.toString());
		
		
	}

}
