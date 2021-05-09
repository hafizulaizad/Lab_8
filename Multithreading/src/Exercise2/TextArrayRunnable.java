package Exercise2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TextArrayRunnable implements Runnable {
		
	    public void printText(String threadName) {
	    	
	    	String[] strArr = {"it","is","recommended","to","use","calendar","class"};
	        
	    	

	    	for (int counter = 0; counter < 10; counter++) {
				
			System.out.println("Thread :"+threadName + "-> " + counter);
				
			List<String> list = Arrays.asList(strArr);
			
			for (int x = 0; x < 10; x++) {
				
				
			    Collections.shuffle(list);
				 
			    int i = x+1;
			    System.out.print("Shuffle word: (count : " + i + " ):");
			    for (String str : list) {
			       System.out.print(str+" ");
			    }
		
				System.out.println(".\n");
			}
			
			if(threadName == "Word 1") {
				System.out.println("\n\nSleep for 3 second. Name :"+threadName);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("End sleep for 3 second\n\n");
			}
	    }
			
			
		}
	    
	    public void run() {
	    	Thread currentThread = Thread.currentThread();
			printText(currentThread.getName() );
	    }
}

