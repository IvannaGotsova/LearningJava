
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 1;
		int y = 2;
		int temp;
		
		System.out.println("X before: " + x);
		System.out.println("Y before: " + y);
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("X after: " + x);
		System.out.println("Y after: " + y);
	}

}
