
public class Person {

	String name;
	static int visits;
	
	Person (String name) {
		this.name = name;
		visits++;
	}
	
	static void makeExtraVisit() {
		visits += 2;
	} 
}
