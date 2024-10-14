/*
 * File: CashRegisterView.java
 * Authors: Yara Mahmoud (100851246), Zainab Ahmed (100868502), Rushda Khan (100865307)
 * Lab CRN: 43963
 * Group Number: 5
 * Date: 2024-10-213
 *
 * Description:
 * The `CashRegisterView` class sets up the user interface for displaying product information
 * in the cash register application using a `JFrame` with a grid layout. It shows labels for
 * the product name and price, and provides methods (`setProductLabel` and `setPriceLabel`) to
 * update these labels with details from the scanned product.
 */

import javax.swing.*;
import java.awt.*;

public class CashRegisterView {
	private JFrame frame;
	private JLabel productLabel;
	private JLabel priceLabel;

	public CashRegisterView(String title) {
		frame = new JFrame(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 150);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new GridLayout(2, 2));

		productLabel = new JLabel("Product: ");
		priceLabel = new JLabel("Price: ");

		frame.add(productLabel);
		frame.add(new JLabel()); // Placeholder for spacing
		frame.add(priceLabel);
		frame.add(new JLabel()); // Placeholder for spacing

		frame.setVisible(true);
	}

	public void setProductLabel(String productName) {
		productLabel.setText("Product: " + productName);
	}

	public void setPriceLabel(double price) {
		priceLabel.setText("Price: $" + String.format("%.2f", price));
	}
}
