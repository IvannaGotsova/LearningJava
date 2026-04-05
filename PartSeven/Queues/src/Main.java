import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Queue<String> numbers = new LinkedList<>();
		
		numbers.add("One");
		numbers.add("Two");
		numbers.add("Three");
		numbers.add("Four");
		numbers.add("Five");
		numbers.offer("Six");
		numbers.offer("Seven");
		numbers.offer("Eight");
		numbers.offer("Nine");
		numbers.offer("Ten");
		
		System.out.println(numbers);
		
		System.out.println(numbers.poll());
		
		System.out.println(numbers);
		
		System.out.println(numbers.peek());
		
	}

}
