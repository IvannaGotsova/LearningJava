
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String oldString = "My name is %s. %nI am %d years old. %nI am from %s.";
		String newString = String.format(oldString, "Ivan Ivanov", 45, "Sofia");
		System.out.println(newString);
	}

}
