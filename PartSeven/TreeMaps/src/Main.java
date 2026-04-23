import java.util.HashMap;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        TreeMap<Integer, String> numbers = new TreeMap<>();
		
		numbers.put(1, "One");
		numbers.put(2, "Two");
		numbers.put(3, "Three");
		numbers.put(4, "Four");
		numbers.put(5, "Five");
		numbers.put(6, "Six");
		numbers.put(7, "Seven");
		numbers.put(8, "Eight");
		numbers.put(9, "Nine");
		numbers.put(10, "Ten");
		
        System.out.println(numbers); 
        
        for (Integer num : numbers.keySet()) {
            System.out.println("Number: " + num + ", Name: " + numbers.get(num));
        }
        
        System.out.println(numbers.headMap(6));
        System.out.println(numbers.subMap(5, 7));
        System.out.println(numbers.tailMap(6));
        
	}

}
