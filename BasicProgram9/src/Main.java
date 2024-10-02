
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String letters = "dskncsrujrtutuopoooyuvsgbvnmbdszxcvbnm";
		 int vowels = 0;
		 letters = letters.toLowerCase();

		 for (int i = 0; i < letters.length(); i++) {

		 char ch = letters.charAt(i);

		 if (ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		 vowels++;
		 } 
		 }
		 System.out.println("Vowels: " + vowels);
	}

}
