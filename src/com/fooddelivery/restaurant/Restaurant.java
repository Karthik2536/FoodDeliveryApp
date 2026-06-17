package com.fooddelivery.restaurant;

import java.util.ArrayList;

public class Restaurant {

    // Encapsulation
    private int restaurantId;
    private String restaurantName;

    // Collection
    private ArrayList<FoodItem> menu;

    // Constructor
    public Restaurant(int restaurantId,
                      String restaurantName) {

        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;

        // Initialize menu
        menu = new ArrayList<>();
    }

    // Getter
    public String getRestaurantName() {
        return restaurantName;
    }

    public ArrayList<FoodItem> getMenu() {
        return menu;
    }

    // Add food item
    public void addFoodItem(FoodItem foodItem) {

        menu.add(foodItem);

        System.out.println(foodItem.getFoodName()
                + " added to "
                + restaurantName);
    }

    // Display menu
    public void displayMenu() {

        System.out.println("\n----- MENU -----");

        for(FoodItem item : menu) {

            System.out.println(item.getFoodId()
                    + " | "
                    + item.getFoodName()
                    + " | ₹"
                    + item.getPrice());
        }
    }
}