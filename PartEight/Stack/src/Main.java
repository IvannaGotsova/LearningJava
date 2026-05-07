import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Deque<Integer> numbers = new ArrayDeque<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		
		System.out.println(numbers);
		
		numbers.push(11);
		System.out.println(numbers);
		
		System.out.println(numbers.pop());
		numbers.pop();
		System.out.println(numbers);
		
		System.out.println(numbers.peek());
		
		System.out.println(numbers.isEmpty());
		
		System.out.println(numbers.size());
	}
}