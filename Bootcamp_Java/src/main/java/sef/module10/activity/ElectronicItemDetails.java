package sef.module10.activity;

import java.util.HashMap;

/**
 * Stores electronic item prices in a HashMap and retrieves prices by item name.
 */
public class ElectronicItemDetails {
    /**
     * Returns the price of a specified electronic item from the HashMap.
     *
     * @param itemHashMap the HashMap containing item names and their prices
     * @param name        the name of the item to look up
     * @return the price of the item, or 0.0 if the item is not found
     */
    public double returnPriceOfItem(HashMap<String, Double> itemHashMap, String name) {
        if (itemHashMap != null && itemHashMap.containsKey(name)) {
            return itemHashMap.get(name);
        }
        return 0.0;
    }

    /**
     * Main entry point for running Activity 5.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        // Create itemHashMap with String name and double price
        HashMap<String, Double> itemHashMap = new HashMap<>();

        // Add 4 items to HashMap
        itemHashMap.put("TV", 699.99);
        itemHashMap.put("Freezer", 849.50);
        itemHashMap.put("Washing Machine", 499.00);
        itemHashMap.put("Laptop", 1699.99);

        // Create instance to call non-static returnPriceOfItem method
        ElectronicItemDetails details = new ElectronicItemDetails();

        IO.println("Price of TV is " + details.returnPriceOfItem(itemHashMap, "TV"));
    }
}
