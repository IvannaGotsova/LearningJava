
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int euclideanAlgorithm(int numberOne, int numberTwo) {

		if (numberTwo == 0) {
			return Math.abs(numberOne);
		}
		return euclideanAlgorithm(numberTwo, numberOne % numberTwo);
	}

}
