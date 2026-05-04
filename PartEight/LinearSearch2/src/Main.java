
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] initialNumbers = {17, 185, 55, 910, 42, 38, 2, 666, 7, 1};

		int[] searchedNumbers = {55, 2, 333};

		for (int i = 0; i < initialNumbers.length; i++) {

			for (int j = 0; j < searchedNumbers.length; j++) {
			    
			    if (searchedNumbers[j] == initialNumbers[i]) {

				System.out.println("Number " + searchedNumbers[j] + " at index " + i);
			    }
			} 
		}
	}

}
