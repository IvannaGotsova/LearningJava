
public class Main {
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person();
		System.out.println(person.firstName);
		System.out.println(person.lastName);
		System.out.println(person.phoneNumber);

		Student student = new Student();
		System.out.println(student.firstName);
		System.out.println(student.lastName);
		System.out.println(student.phoneNumber);
		System.out.println(student.gradeOne);
		System.out.println(student.gradeTwo);
	}

}


class Person {
	//it`s protected and it can be reached within the package and from outside through child class.
	protected String firstName = "Ivan";
	protected String lastName = "Ivanov";
	//it`s private and it can`t be reached from outside the class.
	private int age = 35;	
	//it`s default and it can be reached from outside the class only within the package.
	String phoneNumber = "0000000000";
}

class Student extends Person {
	protected int gradeOne = 6;
    int gradeTwo = 5;
}