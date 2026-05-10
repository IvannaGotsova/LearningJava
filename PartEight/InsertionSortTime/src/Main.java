import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

long startTime = System.nanoTime();
		
		int numbers[] = {6, 4, 3, 5, 12, 2, 11, 9, 5};

        for (int i = 1; i < numbers.length; i++) {
        	
        	for (int j = i; j > 0; j--) {
                
                if (numbers[j] < numbers[j - 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = temp;
                } else {
                    
                    break;
                }
            }
        
        }
        System.out.println(Arrays.toString(numbers));
        
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        
        double milliseconds = duration / 1_000_000.0;

        System.out.println(duration + " ns");
	}
}
