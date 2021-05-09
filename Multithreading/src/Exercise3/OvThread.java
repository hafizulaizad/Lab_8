package Exercise3;

import Exercise2.TextArrayRunnable;

public class OvThread {
	public static void main(String args[]) {
		
		Runnable txt = new TextArrayRunnable();
		
		Thread word1 = new Thread(txt);
		word1.setName("Word 1");
		
		Thread word2 = new Thread(txt);
		word2.setName("Word 2");
		
		Thread word3 = new Thread(txt);
		word3.setName("Word 3");
		
		word1.start();
		word2.start();
		word3.start();
     }
}
