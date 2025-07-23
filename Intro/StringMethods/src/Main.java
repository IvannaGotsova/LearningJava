import java.lang.reflect.Array;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String example = "Something For Example For String Methods That Doesnt Matter";
		String exampleTwo = "Something For Example Two For String Methods That Doesnt Matter";
		String exampleThree = " ";
		String exampleFour = "Something 44";
		String exampleFive = "Something";
		String exampleSix = " Something  ";
		char[] exampleCharacters = {'S', 'o', 'm', 'e', 't', 'h', 'i', 'n', 'g'};
		
		
		System.out.println(example.charAt(2));
		System.out.println(example.codePointAt(1));
		System.out.println(example.codePointBefore(1));
		System.out.println(example.codePointCount(0, 3));
		System.out.println(example.compareTo(exampleTwo));
		System.out.println(example.compareToIgnoreCase(exampleTwo));
		System.out.println(example.concat(exampleTwo));
		System.out.println(example.contains("wo"));
		System.out.println(example.contentEquals("wo"));
		exampleThree = exampleThree.copyValueOf(exampleCharacters, 0, 5);
		System.out.println(exampleThree);
		System.out.println(example.endsWith("Ho"));
		System.out.println(example.equals(exampleTwo));
		System.out.println(example.equalsIgnoreCase(exampleTwo));
		String exampleString = String.format("Something %44f", 47.65734);
		System.out.println(exampleString);
		byte[] byteExample = exampleFive.getBytes();
		for (int i = 0; i < byteExample.length; i++) {
			System.out.println(Array.get(byteExample, i));
		}
		char[] charExample = new char[10];
		example.getChars(0, 10, charExample, 0);
        System.out.println(charExample);
		System.out.println(example.hashCode());
		System.out.println(example.indexOf('w'));
		String exampleSeven = example.intern();
		System.out.println(exampleSeven);
		System.out.println(example.isEmpty());
		System.out.println(example.lastIndexOf("w"));
		System.out.println(example.length());
		System.out.println(example.matches("iiiiiii"));
		System.out.println(Character.offsetByCodePoints(example, 2, 6));
		System.out.println(example.regionMatches(0, "aaa", 3, 2));
		System.out.println(example.replace('o', 'a'));
		System.out.println(example.replaceFirst("o", "a"));
		System.out.println(example.replaceAll("o", "a"));
		String[] exampleSubstring = example.split(" ");
		for (int i = 0; i < exampleSubstring.length; i++) {
			System.out.println(Array.get(exampleSubstring, i));
		}
		System.out.println(example.startsWith("Ho"));
		System.out.println(example.subSequence(0, 5));
		System.out.println(example.substring(0, 5));
		char[] exampleCharacters2 = exampleFive.toCharArray();
		for (int i = 0; i < exampleCharacters2.length; i++) {
			System.out.println(Array.get(exampleCharacters2, i));
		}
		System.out.println(example.toLowerCase());
		System.out.println(example.toString());
		System.out.println(example.toUpperCase());
		System.out.println(exampleFive.trim());
		System.out.println(example.valueOf(2));
	}

}
