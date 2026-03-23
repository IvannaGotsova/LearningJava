import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> numbers = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
		
		System.out.println(numbers); 
		
		numbers.add(10);
		numbers.add(1);
		
		System.out.println(numbers); 
		
		numbers.remove(1);
		
		System.out.println(numbers); 
		
		numbers.add(1);
		
		System.out.println(numbers); 
	}

}
