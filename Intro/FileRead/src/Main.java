import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 try {
		      FileReader fileReader = new FileReader("filename.txt");
		      int data = fileReader.read();
		      
		      while (data >= 0) {
		          System.out.print((char)data);
		          data = fileReader.read();
		        }
		      
		      fileReader.close();
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}

}
