
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World");
		System.out.println(simpleCalculator(2, 3, '+'));
		
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
