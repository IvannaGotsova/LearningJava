
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] initialNumbers = {17, 185, 55, 910, 42, 38, 2, 666, 7, 1};

		int searchedNumber = 55;

		for (int i = 0; i < initialNumbers.length; i++) {

			if (searchedNumber == initialNumbers[i]) {

				System.out.println("Number " + searchedNumber + " at index " + i);
			}
		}
	}

}
