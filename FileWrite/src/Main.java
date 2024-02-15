import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		
		
		try {
			  FileWriter filewriter = new FileWriter("filename.txt");
		      filewriter.write("first \nsecond \nthird");
		      filewriter.append("\nThe End");
		      filewriter.close();
			 
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}

}
