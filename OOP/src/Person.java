
public class Person {

	String firstName;
	String middleName;
	String lastName;
	String city;
	int age;
	
	void printPersonName() {
		System.out.println(firstName + " " + lastName);
	}
	
	void printPersonFullName() {
		System.out.println(firstName + " " + middleName + " " + lastName);
	}
	
	void printPersonCity() {
		System.out.println(city);
	}
	
	void printPersonAge() {
		System.out.println(age);
	}
}
