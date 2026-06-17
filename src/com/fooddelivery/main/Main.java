
/*package com.fooddelivery.main;

import com.fooddelivery.users.Customer;
import com.fooddelivery.driver.Driver;

import com.fooddelivery.restaurant.FoodItem;
import com.fooddelivery.restaurant.Restaurant;

import com.fooddelivery.order.Order;

import com.fooddelivery.payment.PaymentMethod;
import com.fooddelivery.payment.UPIPayment;

public class Main {

    public static void main(String[] args) {

        // CREATE RESTAURANT
        Restaurant restaurant =
                new Restaurant(1, "Dominos");

        // CREATE FOOD ITEMS
        FoodItem pizza =
                new FoodItem(101, "Pizza", 250);

        FoodItem burger =
                new FoodItem(102, "Burger", 120);

        // ADD FOOD ITEMS TO RESTAURANT
        restaurant.addFoodItem(pizza);
        restaurant.addFoodItem(burger);

        // DISPLAY MENU
        restaurant.displayMenu();

        // CREATE CUSTOMER
        Customer customer =
                new Customer(
                        1,
                        "Karthik",
                        "9876543210",
                        "cust123",
                        "Chennai"
                );

        // CUSTOMER ACTION
        customer.placeOrder();

        // CREATE DRIVER
        Driver driver =
                new Driver(
                        101,
                        "Ravi",
                        "9999999999",
                        "driver123",
                        "TN01AB1234",
                        "Chennai"
                );

        // CREATE ORDER
        Order order =
                new Order(
                        5001,
                        customer,
                        restaurant,
                        pizza,
                        pizza.getPrice()
                );

        // ASSIGN DRIVER
        order.assignDriver(driver);

        // PAYMENT METHOD
        PaymentMethod paymentMethod =
                new UPIPayment("karthik@upi");

        // CHECKOUT
        order.checkout(paymentMethod);

        // DRIVER ACTIONS
        driver.acceptOrder();

        driver.deliverOrder();

        // SHOW ORDER DETAILS
        order.showOrderDetails();
    }
}
*/

package com.fooddelivery.main;

import java.util.Scanner;

import com.fooddelivery.users.Customer;
import com.fooddelivery.driver.Driver;

import com.fooddelivery.restaurant.FoodItem;
import com.fooddelivery.restaurant.Restaurant;

import com.fooddelivery.order.Order;

import com.fooddelivery.payment.CreditCardPayment;
import com.fooddelivery.payment.DigitalWalletPayment;
import com.fooddelivery.payment.PaymentMethod;
import com.fooddelivery.payment.UPIPayment;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("    FOOD DELIVERY APPLICATION");
        System.out.println("=================================");

        // Restaurant
        Restaurant restaurant =
                new Restaurant(1, "Dominos");

        FoodItem pizza =
                new FoodItem(101, "Pizza", 250);

        FoodItem burger =
                new FoodItem(102, "Burger", 120);
        
        FoodItem biriyani =
                new FoodItem(102, "Biriyani", 120);
        
        FoodItem chicken_Curry =
                new FoodItem(102, "Chicken Curry", 120);

        restaurant.addFoodItem(biriyani);
        restaurant.addFoodItem(chicken_Curry);

        // Customer Details
        System.out.print("\nEnter Customer ID: ");
        int customerId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        Customer customer =
                new Customer(
                        customerId,
                        customerName,
                        phone,
                        password,
                        address
                );

        customer.placeOrder();

        // Menu
        System.out.println("\n========= MENU =========");
        restaurant.displayMenu();

        System.out.print("\nSelect Food (1-Pizza, 2-Burger, 3-Biriyani, 4-Chicken Curry): ");
        int foodChoice = sc.nextInt();

        FoodItem selectedFood = null;

        switch(foodChoice) {

            case 1:
                selectedFood = pizza;
                break;

            case 2:
                selectedFood = burger;
                break;
                
            case 3:
                selectedFood = biriyani;
                break;
                
            case 4:
                selectedFood = chicken_Curry;
                break;

            default:
                System.out.println("Invalid Food Choice");
                sc.close();
                return;
        }

        // Driver
        Driver driver =
                new Driver(
                        101,
                        "Ravi",
                        "9999999999",
                        "driver123",
                        "TN01AB1234",
                        "Chennai"
                );

        // Order
        Order order =
                new Order(
                        5001,
                        customer,
                        restaurant,
                        selectedFood,
                        selectedFood.getPrice()
                );

        order.assignDriver(driver);

        // Payment Selection
        System.out.println("\nSelect Payment Method");
        System.out.println("1. UPI");
        System.out.println("2. Credit Card");
        System.out.println("3. Wallet");

        System.out.print("Enter Choice: ");
        int paymentChoice = sc.nextInt();
        sc.nextLine();

        PaymentMethod paymentMethod = null;

        switch(paymentChoice) {

            case 1:

                System.out.print("Enter UPI ID: ");
                String upiId = sc.nextLine();

                paymentMethod =
                        new UPIPayment(upiId);

                break;

            case 2:

                System.out.print("Enter Card Token: ");
                String cardToken = sc.nextLine();

                paymentMethod =
                        new CreditCardPayment(cardToken);

                break;

            case 3:

                System.out.print("Enter Wallet ID: ");
                String walletId = sc.nextLine();

                paymentMethod =
                        new DigitalWalletPayment(walletId);

                break;

            default:

                System.out.println("Invalid Payment Choice");
                sc.close();
                return;
        }

        // Checkout
        order.checkout(paymentMethod);

        driver.acceptOrder();
        driver.deliverOrder();

        order.showOrderDetails();

        sc.close();
    }
}