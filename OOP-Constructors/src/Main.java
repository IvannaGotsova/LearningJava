
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person("Ivan", "Ivanov", "Ivanov", "Sofiq", 35);
		
		person.printPersonName();
		person.printPersonFullName();
		person.printPersonCity();
		person.printPersonAge();
		
		Person personTwo = new Person("Petar", "Petrov", "Petrov", "Plovdiv", 45);
		
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
