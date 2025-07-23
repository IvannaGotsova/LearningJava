import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Number of active threads: " + Thread.activeCount());
		System.out.println("Id of current thread: " + Thread.currentThread().getId());
		System.out.println("Name of current thread: " + Thread.currentThread().getName());
		System.out.println("Class of current thread: " + Thread.currentThread().getClass());
		System.out.println("Priority of current thread: " + Thread.currentThread().getPriority());
		System.out.println("State of current thread: " + Thread.currentThread().getState());
		System.out.println("Is current thread alive: " + Thread.currentThread().isAlive());
		System.out.println("Is current thread daemon: " + Thread.currentThread().isDaemon());
		System.out.println("Is current thread interrupted: " + Thread.currentThread().isInterrupted());
		System.out.println("--------------------------------");
		
		Thread threadExample = new Thread();
		threadExample.start();

		System.out.println("Number of active threads: " + Thread.activeCount());
		System.out.println("Id of threadExample thread: " + threadExample.getId());
		System.out.println("Name of threadExample thread: " + threadExample.getName());
		System.out.println("Class of threadExample thread: " + threadExample.getClass());
		System.out.println("Priority of threadExample thread: " + threadExample.getPriority());
		System.out.println("State of threadExample thread: " + threadExample.getState());
		System.out.println("Is threadExample thread alive: " + threadExample.isAlive());
		System.out.println("Is threadExample thread daemon: " + threadExample.isDaemon());
		System.out.println("Is threadExample thread interrupted: " + threadExample .isInterrupted());
		System.out.println("--------------------------------");
		
		threadExample.run();

		System.out.println("Number of active threads: " + Thread.activeCount());
		System.out.println("Id of threadExample thread: " + threadExample.getId());
		System.out.println("Name of threadExample thread: " + threadExample.getName());
		System.out.println("Class of threadExample thread: " + threadExample.getClass());
		System.out.println("Priority of threadExample thread: " + threadExample.getPriority());
		System.out.println("State of threadExample thread: " + threadExample.getState());
		System.out.println("Is threadExample thread alive: " + threadExample.isAlive());
		System.out.println("Is threadExample thread daemon: " + threadExample.isDaemon());
		System.out.println("Is threadExample thread interrupted: " + threadExample .isInterrupted());
	}

}
