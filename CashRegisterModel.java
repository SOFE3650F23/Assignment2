/*
 * File: CashRegisterModel.java
 * Authors: Yara Mahmoud (100851246), Zainab Ahmed (100868502), Rushda Khan (100865307)
 * Lab CRN: 43963
 * Group Number: 5
 * Date: 2024-10-213
 *
 * Description:
 * The `CashRegisterModel` class loads product data from a file and stores it in two maps:
 * one for product names and another for prices, indexed by UPC codes. The `loadProductData`
 * method reads the file line by line to populate these maps. It provides methods to retrieve
 * a product's name and price based on the UPC code.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CashRegisterModel {
    private Map<Integer, String> productCatalog;
    private Map<Integer, Double> priceCatalog;

    public CashRegisterModel(String filePath) {
        productCatalog = new HashMap<>();
        priceCatalog = new HashMap<>();
        loadProductData(filePath);
    }

    private void loadProductData(String filePath) {
        File file = new File(filePath);

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\s+");
                if (parts.length == 3) {
                    int upcCode = Integer.parseInt(parts[0]);
                    String productName = parts[1];
                    double productPrice = Double.parseDouble(parts[2]);

                    productCatalog.put(upcCode, productName);
                    priceCatalog.put(upcCode, productPrice);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading product file: " + e.getMessage());
        }
    }

    public String getProductName(int upcCode) {
        return productCatalog.getOrDefault(upcCode, "Unknown Product");
    }

    public double getProductPrice(int upcCode) {
        return priceCatalog.getOrDefault(upcCode, 0.0);
    }
}
