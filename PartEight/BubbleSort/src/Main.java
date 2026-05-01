import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numbers[] = { 4, 3, 5, 12, 7, 1, 9 };
	      
        for (int i = 0; i < numbers.length - 1; i++)
        	
            for (int j = 0; j < numbers.length - i - 1; j++)
            	
                if (numbers[j] > numbers[j + 1]) {
                	
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
        
        System.out.println(Arrays.toString(numbers));
	}

}
