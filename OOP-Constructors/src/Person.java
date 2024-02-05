
public class Person {

	String firstName;
	String middleName;
	String lastName;
	String city;
	int age;
	
	Person(String firstName, String middleName, String lastName, String city, int age) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.city = city;
		this.age = age;
	}
	
	void printPersonName() {
		System.out.println(this.firstName + " " + this.lastName);
	}
	
	void printPersonFullName() {
		System.out.println(this.firstName + " " + this.middleName + " " + this.lastName);
	}
	
	void printPersonCity() {
		System.out.println(this.city);
	}
	
	void printPersonAge() {
		System.out.println(this.age);
	}
}
