import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World");
		System.out.println(simpleCalculator(2, 3, '+'));
		System.out.println(greetMessage("Peter", "Petrov"));
		loopWithStep(4);
		System.out.println(findName("Ivan"));
		checkGrade(5.55);
		checkDay("Sunday");
		replaceWords("banana", "car");
		replaceWords("banana", "kiwi");
		reverseWords();
		
		
	}
	
	static void reverseWords() {
		String [] fruits = {"kiwi", "cherry", "orange", "berries", "strawberries"};
		List fruitsList = Arrays.asList(fruits);
		
		if (fruitsList.size() > 1) {
			Collections.reverse(fruitsList);
			System.out.println(fruitsList.toString());
		} else {
			System.out.println(fruitsList.toString());
		}
	}
	
	static void replaceWords(String newWord, String oldWord) {
		String [] fruits = {"kiwi", "cherry", "orange", "berries", "strawberries"};
		List fruitsList = Arrays.asList(fruits);
		
		if (fruitsList.contains(oldWord)) {
			int index = fruitsList.indexOf(oldWord);
			fruitsList.set(index, newWord);
			System.out.println(fruitsList.toString());
		} else {
			System.out.println("There is no such fruit");
		}
	}

	static void checkDay(String day) {
		switch (day) {
		case "Sunday" : System.out.println("Today, it is Sunday");
		break;
		case "Monday" : System.out.println("Today, it is Monday");
		break;
		case "Tuesday" : System.out.println("Today, it is Tuesday");
		break;
		case "Wednesday" : System.out.println("Today, it is Wednesday");
		break;
		case "Thursday" : System.out.println("Today, it is Thursday");
		break;
		case "Friday" : System.out.println("Today, it is Friday");
		break;
		case "Saturday" : System.out.println("Today, it is Saturday");
		break;
		default : System.out.println("Please, insert valid day");
		}
	}
	
	static void checkGrade (double grade) {
		if (grade >= 5.50 && grade <= 6) {
			System.out.println("You have an excellent grade");
		} else if (grade >= 4.50 && grade < 6) {
			System.out.println("You have a very good grade");
		} else if (grade >= 3.50 && grade < 5) {
			System.out.println("You have a good grade");
		} else if (grade >= 3 && grade < 4) {
			System.out.println("You have a fair grade");
		} else if (grade >= 2 && grade < 3) {
			System.out.println("You have a poor grade");
		} else {
			System.out.println("Please, insert valid number");
		} 
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
