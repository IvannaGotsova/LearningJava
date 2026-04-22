import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Stack<String> numbers = new Stack<>();
		
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
		
		numbers.push("Eleven");
		
		System.out.println(numbers);
		
		System.out.println(numbers.peek());
		
        numbers.pop();
		
		System.out.println(numbers);
		
		for (String number : numbers) {
		    System.out.println(number);
		}
		
	}

}
