
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 1;
		int y = 2;
		int z = 3;
		
		int max = Math.max(x, y);
		max = Math.max(max, z);
		
		System.out.println("The biggest number is: " + max);
		
		int min = Math.min(x, y);
		min = Math.min(min, z);
		
		System.out.println("The biggest number is: " + min);
	}

}
