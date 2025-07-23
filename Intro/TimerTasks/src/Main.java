import java.util.Timer;
import java.util.TimerTask;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Timer timerExample = new Timer();
		
		TimerTask timerTaskExample = new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Time is over!");
			}
			
		};
		
		timerExample.schedule(timerTaskExample, 10000);
	}

}
