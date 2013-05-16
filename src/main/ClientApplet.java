package main;

import javax.swing.JApplet;
import javax.swing.SwingUtilities;

import client.ChatClient;

public class ClientApplet extends JApplet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void init() {
		SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ChatClient();
            }
        });
	}
}