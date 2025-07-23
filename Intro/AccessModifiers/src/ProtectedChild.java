
public class ProtectedChild extends Protected {


	// Example of protected modifier that can be reached from child classes of parent class 
	
	ProtectedChild protectedNew = new ProtectedChild();
	String stringProtected = protectedNew.protectedExample;
}