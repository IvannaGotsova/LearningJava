import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numbersArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		Arrays.stream(numbersArray).forEach(System.out::println);
		
		List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		numbersList.stream().forEach(System.out::println);
		
		Arrays.stream(numbersArray)
        .filter(n -> n % 2 == 0)
        .forEach(System.out::println);
		
		numbersList.stream()
        .filter(n -> n % 2 != 0)
        .forEach(System.out::println);
		
		
		Arrays.stream(numbersArray)
                .map(n -> n + 2)
                .forEach(System.out::println);
		
		numbersList.stream()
                .map(n -> n * 2)
                .forEach(System.out::println);
		
	}

}
