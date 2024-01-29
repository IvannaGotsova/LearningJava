
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		voidMethod();
		String string = notVoidMethod("String", 123);
		System.out.println(string);
		
				
	}
	
	
	static void voidMethod () {
		System.out.println("This is void method without arguments");
	}
	
	static String notVoidMethod (String string, int number) {
		return String.format("This is not void method with string argument %s and integer argument %d.", string, number);
	} 

}
