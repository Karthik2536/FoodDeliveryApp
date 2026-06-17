package com.fooddelivery.order;

import com.fooddelivery.users.Customer;
import com.fooddelivery.driver.Driver;
import com.fooddelivery.restaurant.Restaurant;
import com.fooddelivery.restaurant.FoodItem;
import com.fooddelivery.payment.PaymentMethod;

public class Order {

    private int orderId;

    private Customer customer;
    private Restaurant restaurant;
    private FoodItem foodItem;
    private Driver driver;

    private double totalAmount;

    // Constructor
    public Order(int orderId,
                 Customer customer,
                 Restaurant restaurant,
                 FoodItem foodItem,
                 double totalAmount) {

        this.orderId = orderId;
        this.customer = customer;
        this.restaurant = restaurant;
        this.foodItem = foodItem;
        this.totalAmount = totalAmount;
    }

    // Assign Driver
    public void assignDriver(Driver driver) {

        this.driver = driver;

        System.out.println(driver.getName()
                + " assigned for delivery.");
    }

    // Checkout Method (Polymorphism)
    public void checkout(PaymentMethod paymentMethod) {

        System.out.println("\nProcessing Order...");

        paymentMethod.processPayment(totalAmount);

        System.out.println("Order Placed Successfully!");
    }

    // Display Order Details
    public void showOrderDetails() {

        System.out.println("\n----- ORDER DETAILS -----");

        System.out.println("Order ID      : " + orderId);

        System.out.println("Customer Name : "
                + customer.getName());

        System.out.println("Restaurant    : "
                + restaurant.getRestaurantName());

        System.out.println("Food Item     : "
                + foodItem.getFoodName());

        System.out.println("Amount        : ₹"
                + totalAmount);

        if(driver != null) {

            System.out.println("Driver        : "
                    + driver.getName());
        }
    }
}