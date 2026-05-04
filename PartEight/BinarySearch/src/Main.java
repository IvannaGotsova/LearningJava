
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int[] initialNumbers = {17, 18, 55, 90, 420, 3800, 20000, 66666, 700000, 10000000};
	    
	    int targetNumber = 55;
	    boolean foundNumber = false;
	    
	    int start = 0;
        int stop = initialNumbers.length - 1;

        while (start <= stop) {
            
            int middle = start + (stop - start) / 2;

            if (initialNumbers[middle] == targetNumber) {
                
                System.out.println(targetNumber + " is found");
                foundNumber = true;
                break;
                
            } else if (initialNumbers[middle] < targetNumber) {
                
                start = middle + 1; 
                
            } else {
                
                stop = middle - 1; 
            }
        }
        
        if (!foundNumber) {
            
            System.out.println(targetNumber + " is not found");
        }
	}

}
