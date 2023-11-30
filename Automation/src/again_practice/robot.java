package again_practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class robot {


	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		Runtime.getRuntime().exec("notepad");
		Thread.sleep(1000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_S); 
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_G); 
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_R);
        r.keyRelease(KeyEvent.VK_SHIFT);
        
        
	}

}
