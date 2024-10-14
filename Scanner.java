/*
 * File: Scanner.java
 * Authors: Yara Mahmoud (100851246), Zainab Ahmed (100868502), Rushda Khan (100865307)
 * Lab CRN: 43963
 * Group Number: 5
 * Date: 2024-10-213
 *
 * Description:
 * The `Scanner` class creates a simple UI for a scanner in the cash register application
 * using a `JFrame` with a "Scan" button. It provides a method `generateUPC()` to simulate
 * generating a UPC code and methods to access UI components like the frame and button for
 * integration with the controller.
 */

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Scanner {
	private JFrame frame;
	private JPanel scannerPanel;
	private JButton scanButton;

	public Scanner() {
		frame = new JFrame("Scanner");
		frame.getContentPane().setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(100, 100);
		frame.setLocation(300, 50);
		frame.setVisible(true);

		// Create UI elements
		scanButton = new JButton("Scan");
		scannerPanel = new JPanel();

		// Add UI element to frame
		scannerPanel.add(scanButton);
		frame.getContentPane().add(scannerPanel);

	}

	public int generateUPC() {
		int upcCode = 12345;
		System.out.println(upcCode);
		return upcCode;
	}

	public JFrame getFrame() {
		return frame;
	}

	public JPanel getScannerPanel() {
		return scannerPanel;
	}

	public JButton getScanButton() {
		return scanButton;
	}
}
