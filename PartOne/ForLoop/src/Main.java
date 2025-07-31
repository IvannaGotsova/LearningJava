package ForLoop.src;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numbers = new int[10];
		
		Arrays.fill(numbers, 0);
		
		System.out.println(Arrays.toString(numbers));
		
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			  numbers[i] = i + 1;
			  sum += numbers[i];
			  
			  System.out.println(numbers[i]);
			  System.out.println("The sum of the numbers is: " + sum);
			}
		
		  System.out.println("The final sum of the numbers is: " + sum);
	
	    for (int i : numbers) {
	    	i += 10;
	    	sum += i;	
	    }
	    
	    System.out.println("The final sum of the numbers is: " + sum);
	}

}
