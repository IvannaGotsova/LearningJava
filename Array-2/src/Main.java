
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] numbers = new int [5][5];
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println();
			for (int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = i + j;
				System.out.print(numbers[i][j] + " ");
			}
		}
		
	}

}
