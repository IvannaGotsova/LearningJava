import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Queue<Integer> numbers = new LinkedList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		
		System.out.println(numbers);
		
		numbers.offer(11);
		System.out.println(numbers);
		
		numbers.add(12);
		System.out.println(numbers);
		
		System.out.println(numbers.poll());
		numbers.poll();
		System.out.println(numbers);
		
		System.out.println(numbers.remove());
		numbers.remove();
		System.out.println(numbers);
		
		System.out.println(numbers.peek());
		
		System.out.println(numbers.isEmpty());
		
		System.out.println(numbers.size());
		
		System.out.println(numbers.contains(8));
		numbers.clear();
		System.out.println(numbers);
		
	}
}