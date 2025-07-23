
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
		
		Person personTwo = new Person();
		personTwo.firstName = "Petar";
		personTwo.lastName = "Petrov";
		personTwo.middleName = "Petrov";
		personTwo.age = 45;
		personTwo.city = "Plovdiv";
		
		personTwo.printPersonName();
		personTwo.printPersonFullName();
		personTwo.printPersonCity();
		personTwo.printPersonAge();
		
		Person personThree = new Person();
		personThree.firstName = "Dimitar";
		personThree.lastName = "Dimitrov";
		personThree.middleName = "Dimitrov";
		personThree.age = 55;
		personThree.city = "Varna";
		
		personThree.printPersonName();
		personThree.printPersonFullName();
		personThree.printPersonCity();
		personThree.printPersonAge();
	}

}
