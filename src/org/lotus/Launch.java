package org.lotus;

import java.awt.Frame;
import java.awt.EventQueue;

public class Launch {

    public static void main(String[] args) {

		Runnable work = new Runnable() {
			@Override
			public void run() {
				Frame f = new Frame("My AWT Frame"); //set title
				f.setSize(300, 200); //width, height
				f.setLocationRelativeTo(null); //put in center of screen
				f.setVisible(true); //show to the user
				System.out.println("Press ctrl + c to exit");
			}
		};

		// create thread for this work(optional but recommended)
		EventQueue.invokeLater(work);
    }
}
