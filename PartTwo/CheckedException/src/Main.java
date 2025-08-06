import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File file = new File("file.txt");
	    FileInputStream stream = new FileInputStream(file);
	}

}
