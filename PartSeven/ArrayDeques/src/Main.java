import java.util.ArrayDeque;
import java.util.Deque;
import java.lang.Integer;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<Integer> arrayDeque = new ArrayDeque<>();
		
		for(int i = 1; i <= 10; i++) {
			arrayDeque.addLast(i);
		}
		
		for (Integer num : arrayDeque) {
			System.out.println("First number is: " + arrayDeque.peekFirst());
			System.out.println("Removed: " + arrayDeque.pollFirst());
		}
		
		for(int i = 1; i <= 10; i++) {
			arrayDeque.push(i);
		}
		
		for (Integer num : arrayDeque) {
			System.out.println("Last number is: " + arrayDeque.peek());
			System.out.println("Removed: " + arrayDeque.pop());
		}
		
		for(int i = 1; i <= 10; i++) {
			arrayDeque.addFirst(i);
			arrayDeque.addLast(i);
		}
		
		for (Integer num : arrayDeque) {
			System.out.println(num);
		}      
	}

}
