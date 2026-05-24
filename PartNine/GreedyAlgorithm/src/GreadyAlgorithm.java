import java.util.HashMap;
import java.util.Map;

public class GreadyAlgorithm {

	  public static void GreedyATM (int amount) {

	        int[] moneyATM = {500, 200, 100, 50, 20, 10, 5};
	        
	        Map<Integer, Integer> moneyCounter = new HashMap<>();

	        System.out.println("Amount: " + amount);
	        
	        for (int money : moneyATM) {

	            if (amount >= money) {
	            	
	                int count = amount / money; 
	                amount = amount % money;    
	                
	                moneyCounter.put(money, count);
	                System.out.println(count + " х " + money + " Leaving: " + amount);
	            }
	        
	        }
	        
	        System.out.println("moneyATM");
	        
	        for (Map.Entry<Integer, Integer> count : moneyCounter.entrySet()) {
	        	
	            System.out.println(count.getValue() + " money " + count.getKey());
	            
	        }
	  }
}
