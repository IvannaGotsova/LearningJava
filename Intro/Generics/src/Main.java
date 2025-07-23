import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		genericDisplay(1);
        genericDisplay(1.0);
        genericDisplay(1f);
        genericDisplay("EXAMPLE");
        genericDisplay('E');
		
	}
		 
	public static <T> void genericDisplay(T example) {
		        
		System.out.println(example  + " = " + 
		         example.getClass().getName());
		    }

}


