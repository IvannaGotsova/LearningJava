
public class ThreadOne {

	ThreadOne(){
		
	}
	
    public void count() {
		
		for(int i = 0; i <= 10; i++) {
			System.out.println("ThreadOne: " + i);
		}
	}
}
