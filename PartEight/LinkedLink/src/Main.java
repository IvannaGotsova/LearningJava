import java.util.LinkedList;
import java.util.Collections;

public class Main
{
	public static void main(String[] args) {
		
		 LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(2);
        numbers.addFirst(1);
        numbers.addLast(3);
        
        numbers.add(45);
        numbers.add(12);
        numbers.add(9);
        numbers.add(68);
        numbers.add(25);
        numbers.add(37);
        numbers.add(6);
        numbers.add(17);
        numbers.add(4);
        numbers.add(77);

        int minNumber = numbers.get(0);
        
        for (Integer number : numbers) {
            
            if (number < minNumber) {
                
                minNumber = number;
            }
        } 
        
        System.out.println("The lowest number is " + minNumber);
        
        int removedNumber = minNumber;
        
        numbers.removeIf(n -> n.equals(removedNumber));
        
        System.out.println("The removed number is " + minNumber);
        
        numbers.add(0, 77);
        
        System.out.println(numbers);
        
        int indexToChanged = numbers.size() / 2;
        
        numbers.add(indexToChanged, 68);
        
        System.out.println(numbers);
        
        Collections.sort(numbers);
        
        System.out.println(numbers);
        
	}
}