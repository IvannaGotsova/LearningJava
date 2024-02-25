
public class Private {

	private String privateExample = "Private Example of Modeifier";
	
	// Example of private modifier that can be reached from within class 
	
	Private privateNew = new Private();
	String stringPrivate = privateNew.privateExample;
}
