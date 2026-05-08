import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Map<Integer, Integer> numbers = new HashMap<>(Map.of(0, 10, 1, 11, 2, 12, 3, 13, 4, 14, 5, 15));
		
		System.out.println(numbers);
		
		numbers.put(0, 00);
		System.out.println(numbers);
		
		numbers.put(0, 10);
		System.out.println(numbers);
		
		System.out.println(numbers.get(0));
		
		numbers.remove(0, 11);
		System.out.println(numbers);
		
		System.out.println(numbers.containsKey(0));
		System.out.println(numbers.containsValue(0));
	}

}
