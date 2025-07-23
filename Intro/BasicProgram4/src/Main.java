import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int second; 
		int minute; 
		int hour;
		GregorianCalendar date = new GregorianCalendar(); 
		second = date.get(Calendar.SECOND); 
		minute = date.get(Calendar.MINUTE);
		hour = date.get(Calendar.HOUR);
		System.out.println("The current time is  " + hour + " : " + minute + " : " + second);
		}
	}


