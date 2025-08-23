
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] numbers = {
				{11, 12, 13, 14, 15, 16, 17, 18, 19},
				{21, 22, 23, 24, 25, 26, 27, 28, },
				{31, 32, 33, 34, 35, 36, 37},
				{41, 42, 43, 44, 45, 46},
				{51, 52, 53, 54, 55},
				{41, 42, 43, 44, 45, 46},
				{31, 32, 33, 34, 35, 36, 37},
				{21, 22, 23, 24, 25, 26, 27, 28},
				{11, 12, 13, 14, 15, 16, 17, 18, 19}
		};
		
		for (int i = 0; i < numbers.length; i++)
		{
			for (int j = 0; j < numbers[i].length; j++)
			{
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
	}

}
