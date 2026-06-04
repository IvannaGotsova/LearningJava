
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  System.out.println(calculateRecursiveFactorial(5));                    
		       
	}
	
    public static long calculateRecursiveFactorial(int number) {
	    
        if (number < 0 || number > 20) {
            
            throw new IllegalArgumentException("Number must be between 0 and 20.");
        }
        
        if (number == 0 || number == 1) { 
            
            return 1;
        }

        return number * calculateRecursiveFactorial(number - 1); 
    }

}
