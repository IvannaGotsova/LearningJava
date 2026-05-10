import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        long startTime = System.nanoTime();
		
		int initialNumbers[] = { 4, 3, 5, 3, 1, 1, 9 };
		
		int maxNumber = initialNumbers[0];
        int minNumber = initialNumbers[0];
        for (int i = 0; i < initialNumbers.length; i++) {
            if (initialNumbers[i] > maxNumber) maxNumber = initialNumbers[i];
            if (initialNumbers[i] < minNumber) minNumber = initialNumbers[i];
        }
        
        System.out.print("Initial numbers: ");
        System.out.println(Arrays.toString(initialNumbers));
        System.out.println("Min number: " + minNumber);
        System.out.println("Max number: " + maxNumber);
        
        int length = maxNumber - minNumber + 1;
        
        System.out.println("Count numbers: " + initialNumbers.length);

        int[] countedNumbers = new int[length];
        
        System.out.print("Counted numbers initial: ");
        System.out.println(Arrays.toString(countedNumbers));
        
        for (int i = 0; i < initialNumbers.length; i++) {
            int index = (initialNumbers[i] - minNumber);
            countedNumbers[index]++;
        }
        
        System.out.print("Counted numbers before: ");
        System.out.println(Arrays.toString(countedNumbers));
        
        for (int i = 1; i < length; i++) {
            countedNumbers[i] += countedNumbers[i - 1];
        }
        
        System.out.print("Counted numbers after: ");
        System.out.println(Arrays.toString(countedNumbers));

        int[] sortedNumbers = new int[initialNumbers.length];
        
        for (int i = initialNumbers.length - 1; i >= 0; i--) {
            sortedNumbers[countedNumbers[initialNumbers[i] - minNumber] - 1] = initialNumbers[i];
            countedNumbers[initialNumbers[i] - minNumber]--;
        }
        
        System.out.print("Sorted numbers: ");
        System.out.println(Arrays.toString(sortedNumbers));
        
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        
        double milliseconds = duration / 1_000_000.0;

        System.out.println(duration + " ns");
	}
}
