/*package com.fooddelivery.users;

public class RestaurantOwner {

}*/

package com.fooddelivery.users;

public class RestaurantOwner extends user {

    private String restaurantName;

    // Constructor
    public RestaurantOwner(int id,
                           String name,
                           String phone,
                           String password,
                           String restaurantName) {

        // Calling parent constructor
        super(id, name, phone, password);

        this.restaurantName = restaurantName;
    }

    // Getter
    public String getRestaurantName() {
        return restaurantName;
    }

    // Setter
    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    // Add food item
    public void addFoodItem(String foodName) {
        System.out.println(foodName +
                " added to menu by " + getName());
    }

    // View orders
    public void viewOrders() {
        System.out.println(getName()
                + " is viewing restaurant orders.");
    }
}
