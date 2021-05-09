package exercise1;

import java.text.SimpleDateFormat;
import java.util.Date;

class TaskThread extends Thread {
	
    public void printDate() {
    	
    	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
        Date date = new Date();  
        
        for (int i = 0; i < 10; i++) {
        	System.out.println(formatter.format(date));  
        } 
    }
    
    public void run() {
    	printDate();
    }
}
