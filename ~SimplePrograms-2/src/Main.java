import java.lang.reflect.Array;
import java.util.Arrays;
import java.text.SimpleDateFormat;  
import java.util.Date;  

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sumOfTwoNumbers(5, 7));
		splitString("Something Anything Nothing Everything");
		sumOfTwoEvenNumbers(4, 6);
		sumOfTwoEvenNumbers(4, 5); 
		sumOfTwoOddNumbers(3, 5);
		sumOfTwoOddNumbers(4, 5); 
		int [] numbers = {5, 6, 7, 8, 9};
		System.out.println(minNumber(numbers));
		System.out.println(maxNumber(numbers));
		String [] words = {"water", "freah", "smoothie", "juice", "food"};
		String [] newWords = (replaceWords("lemonade", "food", words));
		System.out.println(Arrays.toString(newWords));
		reverseNumbers(3, 6);
		currentDate();
		currentTime();
	}
	
	static int sumOfTwoNumbers (int first, int second) {
		return first + second;
	}
	
	static void splitString (String string) {
		String [] stringTwo = string.split(" ");
		System.out.println(stringTwo[1]);
	}
	
	static void sumOfTwoEvenNumbers (int first, int second) {
		if (first % 2 == 0 
		 & second % 2 == 0) {
			System.out.println(first + second);
		} else {
		System.out.println("Not Even Numbers");
		}
	}
	
	static void sumOfTwoOddNumbers (int first, int second) {
		if (first % 2 != 0 
		 & second % 2 != 0) {
			System.out.println(first + second);
		} else {
		System.out.println("Not Odd Numbers");
		}
	}
	
	static int minNumber(int [] numbers) {
		int min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		return min;
	}
	
	static int maxNumber(int [] numbers) {
		int max = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		return max;
	}
	
	static String[] replaceWords(String newWord, String oldWord, String [] words) {
		for (int i = 0; i < words.length; i++) {
			if (words[i] == oldWord) {
				words[i] = newWord;
			}
		}
		return words;
	}
	
	static void reverseNumbers (int first, int second) {
		int temp = second;
		second = first;
		first = temp;
		System.out.println(first + " " + second);
	}
	
	static void currentDate () {
		 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
		 Date date = new Date();  
		 System.out.println(formatter.format(date));  
	}
	
	static void currentTime () {
		 SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");  
		 Date date = new Date();  
		 System.out.println(formatter.format(date));  
	}

}
