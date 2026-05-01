import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numbers[] = { 4, 3, 5, 12, 7, 1, 9 };
		
        for (int i = 0; i < numbers.length - 1; i++) {
        	
        	int minNumber = i;
        	
            for (int j = i + 1; j < numbers.length; j++) {
            	
            	if (numbers[j] < numbers[minNumber])
                    minNumber = j;   
         
              }
            
            int temp = numbers[minNumber];
            numbers[minNumber] = numbers[i];
            numbers[i] = temp;
            
        }
        
        System.out.println(Arrays.toString(numbers));
	}

}
