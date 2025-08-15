
public class Parent {

	public String firstName;
	public String lastName;
	
	public Parent (String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
	public void PrintMyInfo() {
		System.out.println("Method with super keyword from Parent class.");
	}
}
