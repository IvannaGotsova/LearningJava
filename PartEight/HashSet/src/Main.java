import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Set<Integer> numbers = new HashSet<>(Set.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		
		System.out.println(numbers);
		
		numbers.add(0);
		System.out.println(numbers);
		
		numbers.add(11);
		System.out.println(numbers);
		
		numbers.remove(11);
		System.out.println(numbers);
		
		System.out.println(numbers.contains(0));
		
		
		System.out.println(numbers.size());
		System.out.println(numbers.isEmpty());
		numbers.clear();
		System.out.println(numbers);
		
		
	}

}
