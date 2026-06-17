

package com.fooddelivery.restaurant;

public class FoodItem {

    // Encapsulation
    private int foodId;
    private String foodName;
    private double price;

    // Constructor
    public FoodItem(int foodId, String foodName, double price) {

        this.foodId = foodId;
        this.foodName = foodName;
        this.price = price;
    }

    // Getters
    public int getFoodId() {
        return foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Display food details
    public void displayFoodItem() {

        System.out.println("Food ID   : " + foodId);
        System.out.println("Food Name : " + foodName);
        System.out.println("Price     : ₹" + price);
    }
}
