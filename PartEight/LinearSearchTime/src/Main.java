
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        long startTime = System.nanoTime();
		
		int[] initialNumbers = {17, 185, 55, 910, 42, 38, 2, 666, 7, 1};

		int searchedNumber = 55;

		for (int i = 0; i < initialNumbers.length; i++) {

			if (searchedNumber == initialNumbers[i]) {

				System.out.println("Number " + searchedNumber + " at index " + i);
			}
		}
        
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        
        double milliseconds = duration / 1_000_000.0;

        System.out.println(duration + " ns");
	}
}
