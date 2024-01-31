
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = sum(10);
	    System.out.println(result);
	  }
	  public static int sum(int number) {
	    if (number > 0) {
	      return number + sum(number - 1);
	    } else {
	      return 0;
	    }
	}

}
