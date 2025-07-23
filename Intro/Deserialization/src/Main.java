import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Person personExample = null;
	      try {
	    	 FileInputStream fileInExample = new FileInputStream("person.ser");
	         ObjectInputStream inExample = new ObjectInputStream(fileInExample);
	         personExample = (Person) inExample.readObject();
	         inExample.close();
	         fileInExample.close();
	      } catch (FileNotFoundException c) {
	         System.out.println("Person can not be deserialized");
	         return;
	      } catch (ClassNotFoundException c) {
		         System.out.println("Person can not be deserialized");
		         return;
		  } catch (IOException c) {
		         System.out.println("Person can not be deserialized");
		         return;
		  }

	      System.out.println("Person First Name: " + personExample.firstName);
	      System.out.println("Person Middle Name: " + personExample.middleName);
	      System.out.println("Person Last Name: " + personExample.lastName);
	      System.out.println("Person City Name: " + personExample.city);
	      System.out.println("Person Age: " + personExample.age);
	   }
	}


