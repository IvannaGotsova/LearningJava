
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World");
		System.out.println(simpleCalculator(2, 3, '+'));
		System.out.println(greetMessage("Peter", "Petrov"));
		loopWithStep(4);
		
	}
	
	static void loopWithStep(int x) {
		for (int i = 0; i < 30; i = i + x) {
			System.out.print(i + " ");
		}
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
