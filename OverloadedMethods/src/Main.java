
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(add(1, 2));
		System.out.println(add(1, 2, 3));
		System.out.println(add(1, 2, 3, 4));
		System.out.println(add(1, 2, 3, 4, 5));
		System.out.println(add(1, 2, 3, 4, 5, 6));
	}
	
	static int add (int x, int y) {
		return x + y;
	}
	
	static int add (int x, int y, int z) {
		return x + y + z;
	}
	
	static int add (int x, int y, int z, int a) {
		return x + y + z + a;
	}
	
	static int add (int x, int y, int z, int a, int b) {
		return x + y + z + a + b;
	}
	
	static int add (int x, int y, int z, int a, int b, int c) {
		return x + y + z + a + b + c;
	}

}
