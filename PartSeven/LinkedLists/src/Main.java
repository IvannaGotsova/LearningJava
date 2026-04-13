import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> numbers = new LinkedList<>();
		
		numbers.add("One");
		numbers.add("Two");
		numbers.add("Three");
		numbers.add("Four");
		numbers.add("Five");
		numbers.add("Six");
		numbers.add("Seven");
		numbers.add("Eight");
		numbers.add("Nine");
		numbers.add("Ten");
		
		System.out.println(numbers);
		
		numbers.addFirst("Zero");
		numbers.addLast("Eleven");
		
		System.out.println(numbers);
		
		numbers.removeFirst();
		numbers.remove("Eleven");
		
		System.out.println(numbers);
		
		numbers.addFirst("Zero");
		numbers.addLast("Eleven");
		
		System.out.println(numbers);
		
		System.out.println(numbers.peekFirst());
		numbers.pollFirst();
		
		System.out.println(numbers);
		
		System.out.println(numbers.peekLast());
		numbers.pollLast();
		
		System.out.println(numbers);
		
		
	}

}
