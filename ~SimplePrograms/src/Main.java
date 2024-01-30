import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World");
		System.out.println(simpleCalculator(2, 3, '+'));
		System.out.println(greetMessage("Peter", "Petrov"));
		loopWithStep(4);
		System.out.println(findName("Ivan"));

		
	}
	
	static boolean findName(String name) {
		String [] names = {"Ivan", "Peter", "Dimitar", "Yordan", "Daniel"};
		List namesList = Arrays.asList(names);
		
		if (namesList.contains(name)) {
			return true;
		} else {
			return false;
		}
	}
	
	static void loopWithStep(int x) {
		for (int i = 0; i < 30; i = i + x) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	static String greetMessage(String first, String last) {
		return "Hello " + first + " " + last;
	}
	
	static double simpleCalculator(double first, double second, char x) {
		if (x == '+') {
			return first + second;
		} else if (x == '-') {
			return first - second;
		} else if (x == '/') {
			return first / second;
		} else {
			return first * second;
		} 
	}

}
