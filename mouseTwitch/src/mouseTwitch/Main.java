package mouseTwitch;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Robot;

public class Main {
	public static final int DELTA_X = 1;
	public static final int DELTA_Y = 1;

	public static void main(String[] args) {

		try {
			Robot screen = new Robot();
			while (true) {
				try {
					Thread.sleep(20);
					screen.mouseMove(MouseInfo.getPointerInfo().getLocation().x + (Math.random() > .5 ? DELTA_X : -DELTA_X), MouseInfo.getPointerInfo().getLocation().y + (Math.random() > .5 ? DELTA_Y : -DELTA_Y));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		} catch (AWTException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}