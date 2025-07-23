
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person personOne = new Person("Ivan", "Ivanov", "Ivanov", "Sofiq", 35);		
		Person personTwo = new Person("Petar", "Petrov", "Petrov", "Plovdiv", 45);
		Person personThree = new Person("Dimitar", "Dimitrov", "Dimitrov", "Varna", 55);
		
        Person [] people = {personOne, personTwo, personThree};
        
        System.out.println(personOne.firstName);
        System.out.println(personTwo.firstName);
        System.out.println(personThree.firstName);
        
	}

}
