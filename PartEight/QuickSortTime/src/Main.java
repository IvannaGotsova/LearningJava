import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        long startTime = System.nanoTime();
		
		int numbers[] = {5, 2, 1, 87, 9, 64, 53, 34, 32, 33, 90, 100};
		
		Arrays.sort(numbers);
		
		System.out.println(Arrays.toString(numbers));
        
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        
        double milliseconds = duration / 1_000_000.0;

        System.out.println(duration + " ns");
	}
}
