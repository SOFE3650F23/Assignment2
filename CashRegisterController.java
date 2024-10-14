/*
 * File: CashRegisterController.java
 * Authors: Yara Mahmoud (100851246), Zainab Ahmed (100868502), Rushda Khan (100865307)
 * Lab CRN: 43963
 * Group Number: 5
 * Date: 2024-10-213
 *
 * Description:
 * The `CashRegisterController` class manages interactions between the model (data), view (UI),
 * and scanner for a cash register system. It listens for the scan button press, retrieves product
 * information using a UPC code, and updates the view with the product's name and price. This class
 * follows the MVC pattern to organize functionality.
 */
public class CashRegisterController {
	private CashRegisterModel model;
	private CashRegisterView view;
	private Scanner scanner;

	public CashRegisterController(CashRegisterModel model, CashRegisterView view, Scanner scanner) {
		this.model = model;
		this.view = view;
		this.scanner = scanner;
		initController();
	}

	private void initController() {
		scanner.getScanButton().addActionListener(e -> handleScan());
	}

	private void handleScan() {
		int upcCode = scanner.generateUPC();
		String productName = model.getProductName(upcCode);
		double productPrice = model.getProductPrice(upcCode);

		view.setProductLabel(productName);
		view.setPriceLabel(productPrice);
	}
}
