
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] jaggedArray = new int[10][];

		jaggedArray[0] = new int[1]; 
		jaggedArray[1] = new int[2]; 
		jaggedArray[2] = new int[3]; 
		jaggedArray[3] = new int[4]; 
		jaggedArray[4] = new int[5]; 
		jaggedArray[5] = new int[6]; 
		jaggedArray[6] = new int[7]; 
		jaggedArray[7] = new int[8]; 
		jaggedArray[8] = new int[9]; 
		jaggedArray[9] = new int[10]; 
		
		for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
            	jaggedArray[i][j] = j;
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println(); 
        }
		
		
	}

}
