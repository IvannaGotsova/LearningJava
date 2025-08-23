
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][][] numbers = {
				{
					{1, 2, 3}, 
					{4, 5, 6}, 
					{7, 8, 9}
				},
				{
					{11, 12, 13}, 
					{14, 15, 16}, 
					{17, 18, 19}
				},
				{
					{21, 22, 23}, 
					{24, 25, 26}, 
					{27, 28, 29}
				}
		};
		
		for (int i = 0; i < numbers.length; i++) 
		{
			for (int j = 0; j < numbers[i].length; j++) 
			{
				for (int k = 0; k < numbers[j].length; k++) 
				{
					System.out.print(numbers[i][j][k] + " ");
				}
				
				System.out.println();
			}
			
			System.out.println();
		}
	}

}
