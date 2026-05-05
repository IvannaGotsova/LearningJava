import java.util.LinkedList;

public class Main
{
	public static void main(String[] args) {
		
		 LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(2);
        numbers.addFirst(1);
        numbers.addLast(3);

        System.out.println(numbers);
        
	}
}