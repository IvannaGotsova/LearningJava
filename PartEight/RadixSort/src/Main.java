
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int[] initialNumbers = {17, 185, 55, 910, 42, 38, 2, 666, 7, 1};
		
        int maxNumber = 0;
        int[] finalNumbers = new int[initialNumbers.length];
        
        for (int i = 0; i < initialNumbers.length; i++) {
            
            if (i > maxNumber) {
                
                 maxNumber = initialNumbers[i];
            }
        }
        
        for (int i = 1; maxNumber / i > 0; i *= 10) {
            
            int[] countNumbers = new int[10];

            for (int j = 0; j < initialNumbers.length; j++) {
                
                countNumbers[(initialNumbers[j] / i) % 10]++;
            }

            for (int j = 1; j < 10; j++) {
                
                countNumbers[j] += countNumbers[j - 1];
            }

            for (int j = initialNumbers.length - 1; j >= 0; j--) {
                
                int currentDigit = (initialNumbers[j] / i) % 10;
                finalNumbers[countNumbers[currentDigit] - 1] = initialNumbers[j];
                countNumbers[currentDigit]--;
            }

            System.arraycopy(finalNumbers, 0, initialNumbers, 0, initialNumbers.length);
        }
        
        for (int i = 0; i < finalNumbers.length; i++) {
            
            System.out.println(finalNumbers[i]);
        }
	}

}
