
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] numbers = new int[10][10];
		
		for (int i = 0; i < numbers.length; i++) { 
			
			if (i % 2 == 0) {
				
				for (int j = 0; j < numbers[i].length; j++) { 
					numbers[i][j] = j;
		            System.out.print(numbers[i][j] + " ");
		        }
			}
			else {
				for (int j = numbers.length - 1; j >= 0; j--) { 
					numbers[i][j] = j;
	                System.out.print(numbers[i][j] + " ");
	            }
			}
           
            System.out.println(); 
        }
		
	}

}
