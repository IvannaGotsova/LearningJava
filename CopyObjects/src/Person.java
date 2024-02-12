
public class Person {

	private String firstName;
	private String middleName;
	private String lastName;
	private String city;
	private int age;
	
	Person() {
		
	}
	
	Person(String firstName, String middleName, String lastName, String city, int age) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.city = city;
		this.age = age;
	}
	
    public String getFirstNamePerson() {
		return firstName;
	}
    
    public String getMiddleNamePerson() {
		return middleName;
	}
    
    public String getLastNamePerson() {
		return lastName;
	}
    
    public String getCityPerson() {
		return city;
	}
    
    public int getAgePerson() {
		return age;
	}
    
    public void setFirstNamePerson(String firstName) {
    	this.firstName = firstName;
   	}

    public void setMiddleNamePerson(String middleName) {
    	this.middleName = middleName;
   	}
    
    public void setLastNamePerson(String lastName) {
    	this.lastName = lastName;
   	}
    
    public void setCityPerson(String city) {
    	this.city = city;
   	}
    
    public void setAgePerson(int age) {
    	this.age = age;
   	}
    
	public void copyPerson(Person personCopy) {
		this.setFirstNamePerson(personCopy.getFirstNamePerson());
		this.setMiddleNamePerson(personCopy.getMiddleNamePerson());
		this.setLastNamePerson(personCopy.getLastNamePerson());
		this.setCityPerson(personCopy.getCityPerson());
		this.setAgePerson(personCopy.getAgePerson());
	}
}
