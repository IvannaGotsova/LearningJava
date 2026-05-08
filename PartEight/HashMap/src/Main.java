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
		
		numbers.computeIfAbsent(1, k -> 1);
		numbers.computeIfAbsent(6, k -> 16);
		System.out.println(numbers);
		
		numbers.merge(7, 77, Integer::sum);
		numbers.merge(6, 50, Integer::sum);
		System.out.println(numbers);
		
		System.out.println(numbers.get(0));
		
		numbers.remove(0, 11);
		System.out.println(numbers);
		
		System.out.println(numbers.containsKey(0));
		System.out.println(numbers.containsValue(0));

		System.out.println(numbers.size());
		System.out.println(numbers.isEmpty());
		
		numbers.clear();
		System.out.println(numbers);
	}

}
