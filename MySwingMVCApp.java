/*
 * File: MySwingMVCApp.java
 * Authors: Yara Mahmoud (100851246), Zainab Ahmed (100868502), Rushda Khan (100865307)
 * Lab CRN: 43963
 * Group Number: 5
 * Date: 2024-10-213
 *
 * Description:
 * The `MySwingMVCApp` class initializes the MVC components for a cash register application.
 * It sets up the `CashRegisterModel` with a file path for product data, creates a `CashRegisterView`
 * for the user interface, and a `Scanner` for handling UPC codes, linking them through the
 * `CashRegisterController` to manage interactions.
 */

public class MySwingMVCApp {
	public static void main(String[] args) {
		// Path to the file containing the product data
		String productDataFilePath = "productData.txt";

		// Initialize the components of the Cash Register MVC
		CashRegisterModel model = new CashRegisterModel(productDataFilePath);
		CashRegisterView view = new CashRegisterView("Cash Register");
		Scanner scanner = new Scanner(); // Scanner is treated as a controller for UPC codes
		CashRegisterController controller = new CashRegisterController(model, view, scanner);
	}
}
