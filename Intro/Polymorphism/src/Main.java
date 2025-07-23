
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person();
		Teacher teacher = new Teacher();
		Student student = new Student();
		
		Person [] people = {person, teacher, student};
		
		for (int i = 0; i < people.length; i++) {
			people[i].iAm();
		}
	}

}
