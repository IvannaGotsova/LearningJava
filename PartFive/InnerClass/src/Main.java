
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OuterClass outerClassExample = new OuterClass();
	    OuterClass.InnerClass innerClassExample = outerClassExample.new InnerClass();
	    System.out.println(outerClassExample.outerClassExample + innerClassExample.innerClassExample);
	}

}

class OuterClass {
	  int outerClassExample = 1000;

	  class InnerClass {
	    int innerClassExample = 100;
	  }
}
