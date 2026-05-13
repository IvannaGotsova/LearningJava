
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

long startTime = System.nanoTime();
		
		int[] initialNumbers = {17, 185, 55, 910, 42, 38, 2, 666, 7, 1};
		
        int numbersCount = initialNumbers.length;
        int[] finalNumbers = new int[numbersCount]; 

        for (int i = 1; i < numbersCount; i *= 2) {
            
            for (int left = 0; left < numbersCount; left += 2 * i) {
                
                int mid = Math.min(left + i, numbersCount);
                int right = Math.min(left + 2 * i, numbersCount);
                
                int leftMid = left, midRight = mid, leftRight = left;
                
                while (leftMid < mid && midRight < right) {
                    if (initialNumbers[leftMid] <= initialNumbers[midRight]) {
                        
                        finalNumbers[leftRight++] = initialNumbers[leftMid++];
                    }
                    else {
                        
                        finalNumbers[leftRight++] = initialNumbers[midRight++];
                    }
                }
                
                while (leftMid < mid) {
                    
                    finalNumbers[leftRight++] = initialNumbers[leftMid++];
                }
                
                while (midRight < right) {
                    
                    finalNumbers[leftRight++] = initialNumbers[midRight++];
                }
            }

            System.arraycopy(finalNumbers, 0, initialNumbers, 0, numbersCount);
        }
        for (int i = 0; i < finalNumbers.length; i++) {
            
            System.out.println(finalNumbers[i]);
        }
        
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        
        double milliseconds = duration / 1_000_000.0;

        System.out.println(duration + " ns");
	}
}