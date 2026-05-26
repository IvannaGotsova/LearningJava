import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int number = 5;
		    
		    if (number < 0) {
		        
	            throw new IllegalArgumentException("Number must be bigger or equal to 0.");
	        }
			
			BigInteger result = BigInteger.ONE;
			
	        for (int i = 2; i <= number; i++) {
	            
	            result = result.multiply(BigInteger.valueOf(i));
	        }
	        
	        System.out.println(result); 
	        
	}

}
   