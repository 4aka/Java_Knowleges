package J_UseKeyboardsKeys;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Test {

	public static void main() throws AWTException {
	Robot robot = new Robot();
    try {
        robot = new Robot();
    }
        catch (AWTException e) {
        e.printStackTrace();
    }
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        
        robot.keyPress(KeyEvent.VK_END);
        robot.keyRelease(KeyEvent.VK_END);
	}

}
