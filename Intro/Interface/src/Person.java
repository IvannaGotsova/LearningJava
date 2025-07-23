
public class Person implements PersonInterface {

	private String firstName;
	private String middleName;
	private String lastName;
	private String city;
	private int age;
	
	Person(String firstName, String middleName, String lastName, String city, int age) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.city = city;
		this.age = age;
	}

	@Override
	public void personSayHello(String firstName) {
		System.out.println("Hello from " + firstName);
		
	}

	@Override
	public void personAge(String firstName, String lastName, int age) {
		System.out.println(firstName + " " + lastName + " - " + age);
		
	}

	@Override
	public void personCity(String firstName, String lastName, String city) {
		System.out.println(firstName + " " + lastName + " - " + city);
		
	}

	@Override
	public void personFullName(String firstName, String middleName, String lastName) {
		System.out.println(firstName + " " + middleName + " " + lastName);
		
	}

}
