import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       HashSet<String> numbers = new HashSet<>();
		
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
		
		numbers.add("Eleven");
		
		System.out.println(numbers);
		
        numbers.add("Eleven");
		
		System.out.println(numbers);
		
        numbers.remove("Eleven");
		
		System.out.println(numbers);
	}

}
