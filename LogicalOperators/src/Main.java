
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10; 
		
		if (x > 5 && x < 15) {
			System.out.println("Both conditions are true");
		}
		
        int y = 10; 
		
		if (y > 5 || y < 5) {
			System.out.println("One condition is true");
		}
		
        int z = 10; 
		
		if (!(z < 5) && z > 5) {
			System.out.println("One condition is reversed");
		}
	}

}
