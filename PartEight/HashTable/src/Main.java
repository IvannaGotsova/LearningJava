import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer, String> numbers = new Hashtable<>(Map.of(
	            1, "One",
	            2, "Two",
	            3, "Three", 
	            4, "Four", 
	            5, "Five"
	        ));
			
			System.out.println(numbers);
			
			numbers.put(6, "Six");
			System.out.println(numbers);
			
			System.out.println(numbers.get(4));
			
			numbers.remove(6);
			System.out.println(numbers);
			
			System.out.println(numbers.containsKey(4));
			System.out.println(numbers.containsValue("Four"));
			
			System.out.println(numbers.size());
			System.out.println(numbers.isEmpty());
			numbers.clear();
			System.out.println(numbers);
	}

}
