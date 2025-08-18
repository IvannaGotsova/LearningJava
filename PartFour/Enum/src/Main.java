
public class Main {

		public static void main(String[] args) {
		      Options option = Options.Three;
		      System.out.println(option.getOption());
		}
	}



enum Options {
	

	   One ("First option"),
	   Two ("Second option"),
	   Three ("Third option"),
	   Four ("Fourth option"),
	   Fifth ("Fifth option");

	   private String string;

	   private Options(String string) {
	      this.string = string;
	   }

	   public String getOption() {
	      return string;
	   }
	}

