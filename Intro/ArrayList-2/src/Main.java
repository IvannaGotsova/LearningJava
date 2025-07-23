import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<ArrayList<String>> characters = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> aaa = new ArrayList<String>();
		
		aaa.add("a");
		aaa.add("aa");
		aaa.add("aaa");
		
        ArrayList<String> bb = new ArrayList<String>();
		
		bb.add("b");
		bb.add("bb");
		
        ArrayList<String> c = new ArrayList<String>();
		
		c.add("c");
		
		characters.add(aaa);
		characters.add(bb);
		characters.add(c);
		
		System.out.println(characters.get(0).get(2));
		System.out.println(characters.get(1).get(1));
		System.out.println(characters.get(2).get(0));
	}

}
