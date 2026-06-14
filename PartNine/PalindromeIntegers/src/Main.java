
public class Main {

public static void main(String[] args) {
	    
	    int number = 854458;
	    
        if (number < 0) {
            
            System.out.println("Input must be bigger than 0!");
        }
        
        int original = number;
        int reversed = 0;
        
         while (number != 0) {
             
            int digit = number % 10;          
            reversed = reversed * 10 + digit; 
            number /= 10;                     
        }
        
        if (original == reversed ) {
            
            System.out.println("Palindrome");
        } 
        else {
            
            System.out.println("No Palindrome");
        }

	}
	
}