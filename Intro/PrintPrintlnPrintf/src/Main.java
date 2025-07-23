
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This is example with print");
		
        int x = 0;
		
		for (int i = 0; i <= 10; i++) {
			System.out.print(x);
			x++; 
		}
		
		System.out.println("This is example with println");
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(x);
			x++; 
		}
		
		System.out.println("This is example with printf");	
		System.out.println(String.format("This is example with argument string %s, argument integer %d and argument double %d", "string example", 1, 10,4));
		
	}

}
