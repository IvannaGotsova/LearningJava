
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person("Ivan", "Ivanov", "Ivanov", "Sofia", 35);
		Person personCopy = new Person();
		personCopy.copyPerson(person);
		
		System.out.println(person);
		System.out.println(person.getFirstNamePerson());
		System.out.println(person.getMiddleNamePerson());
		System.out.println(person.getLastNamePerson());
		System.out.println(person.getCityPerson());
		System.out.println(person.getAgePerson());
		System.out.println();
		System.out.println(personCopy);
		System.out.println(personCopy.getFirstNamePerson());
		System.out.println(personCopy.getMiddleNamePerson());
		System.out.println(personCopy.getLastNamePerson());
		System.out.println(personCopy.getCityPerson());
		System.out.println(personCopy.getAgePerson());
		System.out.println();
		
		personCopy = person;
		System.out.println(person);
		System.out.println(personCopy);
	}

}
