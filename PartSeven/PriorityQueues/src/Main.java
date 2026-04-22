import java.util.LinkedList;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        PriorityQueue<String> numbers = new PriorityQueue<>();
		
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
		
		System.out.println(numbers.poll());
		
		System.out.println(numbers);
		
		System.out.println(numbers.peek());
		
		numbers.offer("Zero");
		numbers.offer("Zero");
		numbers.offer("Zero");
		
		System.out.println(numbers);
	}

}
