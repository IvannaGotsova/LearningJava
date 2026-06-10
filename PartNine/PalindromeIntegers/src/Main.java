
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   String word = "word";
		    

	        int left = 0;
	        int right = word.length() - 1;
	        
	        while (left < right) {
	            
	            if (word.charAt(left) != word.charAt(right)) {
	                
	                System.out.println("No Palindrome");
	                return;
	            }
	            
	            left++;
	            right--;
	        }
	        

		}
		
	}
