
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String [] people = {"Ivan", "Petar", "Dimitar"};
			System.out.println(people[12]);
		} catch(Exception e) {
			System.out.println("There is no such person ");
	    } finally {
	        System.out.println("This is the end");
	    }
		
		
		
		int age = 17;
		
		if (age < 18) {
		      throw new ArithmeticException("Age must be 18 or older");
		    }
		    else {
		      System.out.println("You are older than 18.");
		    }
	}

}
