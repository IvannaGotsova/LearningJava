import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner newScanner = new Scanner(System.in);  
	    
	    System.out.println("Enter your name");
	    String name = newScanner.nextLine();  
	    System.out.println("Name is: " + name); 
	    
	    System.out.println("Enter your age");
	    int age = Integer.parseInt(newScanner.nextLine());  
	    System.out.println("Age is: " + age); 
	    
	    System.out.println("Enter your city");
	    String city = newScanner.nextLine();  
	    System.out.println("City is: " + city); 
	    
	    System.out.println("Enter your job");
	    String job = newScanner.nextLine();  
	    System.out.println("Job is: " + job); 
	    
	    System.out.println("Enter your salary");
	    Double salary = Double.parseDouble(newScanner.nextLine());  
	    System.out.println("salary is: " + salary); 
	    
	    newScanner.close();
	}

}
