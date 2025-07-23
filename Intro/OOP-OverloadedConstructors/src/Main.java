
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person();
		
		person.firstName = "Ivan";
		person.lastName = "Ivanov";
		person.middleName = "Ivanov";
		person.age = 35;
		person.city = "Sofiq";
		
		person.printPersonName();
		person.printPersonFullName();
		person.printPersonCity();
		person.printPersonAge();
		
		Person personTwo = new Person("Petar", "Petrov");
		
		personTwo.middleName = "Petrov";
		personTwo.age = 55;
		personTwo.city = "Plovdiv";
		
		personTwo.printPersonName();
		personTwo.printPersonFullName();
		personTwo.printPersonCity();
		personTwo.printPersonAge();
		
		Person personThree = new Person("Dimitar", "Dimitrov", "Dimitrov", "Varna", 55);
		
		personThree.printPersonName();
		personThree.printPersonFullName();
		personThree.printPersonCity();
		personThree.printPersonAge();
	}

}
