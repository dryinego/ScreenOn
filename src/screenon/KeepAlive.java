package screenon;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

/**
 *
 * @author eyogved
 */
public class KeepAlive extends Thread {

    public void run() {

        try {
            Robot robot = new Robot();

            while (ScreenOn.enableFlag) {
                Thread.sleep(60 * 1000); // one minute
                robot.keyPress(KeyEvent.VK_F15);
                Thread.sleep(50);
                robot.keyRelease(KeyEvent.VK_F15);
            }
        } catch (AWTException ex) {
            ex.printStackTrace();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

}