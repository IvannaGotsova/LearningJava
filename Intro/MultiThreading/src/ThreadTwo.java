
public class ThreadTwo {

    ThreadTwo(){
		
	}
	
	public void count() {
		
		for(int i = 0; i <= 10; i++) {
			System.out.println("ThreadTwo: " + i);
		}
	}
}
