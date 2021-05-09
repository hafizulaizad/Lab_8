package Exercise2;

public class ExTextThread {
	public static void main(String args[]) {
        Runnable text = new TextArrayRunnable();
        Thread word1 = new Thread(text);
		Thread word2 = new Thread(text);
        
		word1.start();
		word2.start();
     }
}
