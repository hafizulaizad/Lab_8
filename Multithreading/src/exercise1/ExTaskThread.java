package exercise1;

public class ExTaskThread{
	
	public static void main(String args[]) {
        Thread R1 = new TaskThread();
        Thread R2 = new TaskThread();
        System.out.println("Thread 1");
        R1.start();
        System.out.println("Thread 2");
        R2.start();
     }
}
