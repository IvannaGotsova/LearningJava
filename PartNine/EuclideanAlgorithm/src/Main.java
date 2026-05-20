
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numberOne = 24, numberTwo = 12;

		int result = euclideanAlgorithm(numberOne, numberTwo);

		System.out.println(result);
	}
	
	public static int euclideanAlgorithm(int numberOne, int numberTwo) {

		if (numberTwo == 0) {
			
			return Math.abs(numberOne);
		}
		
		return euclideanAlgorithm(numberTwo, numberOne % numberTwo);
	}

}
