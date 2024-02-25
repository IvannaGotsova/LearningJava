import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Person personExample = new Person("Ivan", "Ivanov", "Ivanov", "Sofia", 35);

	      try {
	         FileOutputStream fileOutExample = new FileOutputStream("person.ser");
	         ObjectOutputStream outExample = new ObjectOutputStream(fileOutExample);
	         outExample.writeObject(personExample);
	         outExample.close();
	         fileOutExample.close();
	         System.out.printf("Serialization done!");
	      } catch (IOException i) {
	    	  System.out.printf("Serialization not  done!");
	      }
	}

}
