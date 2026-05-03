import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float numbers[] = { 0.4F, 0.3F, 0.55F, 0.12F, 0.7F, 0.1F, 0.9F, 0.8F };
		
        int numbersCount = numbers.length;

        List<List<Float>> buckets = new ArrayList<>(numbersCount);
        
        for (int i = 0; i < numbersCount; i++) {
        	
        	buckets.add(new ArrayList<>());
        }


        for (float number : numbers) {
        	
            int partsIndex = (int) (number * numbers.length);
            buckets.get(partsIndex).add(number);
        }

        int currentIndex = 0;
        
        for (List<Float> bucket : buckets) {
            Collections.sort(bucket); 
            
            for (float number : bucket) {
                numbers[currentIndex++] = number;
            }
        }
        
        System.out.println(Arrays.toString(numbers));

	}

}
