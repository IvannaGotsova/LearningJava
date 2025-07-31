package HashMap.src;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> peopleList = new HashMap<Integer, String>();
		
		peopleList.put(1, "Ivan");
		peopleList.put(2, "Petar");
		peopleList.put(3, "Stefan");
		peopleList.put(4, "Dimitar");
		peopleList.put(5, "Kiril");
		peopleList.put(6, "Nikola");
		
		System.out.println(peopleList.toString());
	}
}
