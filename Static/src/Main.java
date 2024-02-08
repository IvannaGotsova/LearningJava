
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person personOne = new Person("Ivan");
		System.out.println(Person.visits);
		Person personTwo = new Person("Ivan");
		System.out.println(Person.visits);
		Person personThree = new Person("Ivan");
		System.out.println(Person.visits);
		Person.makeExtraVisit();
		System.out.println(Person.visits);
		Person.makeExtraVisit();
		System.out.println(Person.visits);
		Person.makeExtraVisit();
		System.out.println(Person.visits);
	}

}

