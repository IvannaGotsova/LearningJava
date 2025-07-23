
public class Student extends Person{

	int grade; 
	
	Student(String name, int age, int grade) {
		super(name, age);
		this.grade = grade;
	}

	String iAmPerson() {
		return super.name + " " + super.age + " " + this.grade;
	}
}
