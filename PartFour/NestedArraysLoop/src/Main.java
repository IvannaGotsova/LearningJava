
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] numbers = {
				{11, 12, 13, 14, 15, 16, 17, 18, 19},
				{21, 22, 23, 24, 25, 26, 27, 28, 29},
				{31, 32, 33, 34, 35, 36, 37, 38, 39},
				{41, 42, 43, 44, 45, 46, 47, 48, 49},
				{51, 52, 53, 54, 55, 56, 57, 58, 59},
				{41, 42, 43, 44, 45, 46, 47, 48, 49},
				{31, 32, 33, 34, 35, 36, 37, 38, 39},
				{21, 22, 23, 24, 25, 26, 27, 28, 29},
				{11, 12, 13, 14, 15, 16, 17, 18, 19}
		};
		
		
		for (int[] array: numbers) 
		{
			for (int number: array) 
			{
				System.out.print(number + " ");
			}
			System.out.println();
		}
	}

}
