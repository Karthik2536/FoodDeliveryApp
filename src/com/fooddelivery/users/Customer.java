/*package com.fooddelivery.users;

public class Customer {
	
	

}*/

package com.fooddelivery.users;

public class Customer extends user {

    private String address;

    // Constructor
    public Customer(int id, String name, String phone,
                    String password, String address) {

        // Calling parent constructor
        super(id, name, phone, password);

        this.address = address;
    }

    // Getter
    public String getAddress() {
        return address;
    }

    // Setter
    public void setAddress(String address) {
        this.address = address;
    }

    // Customer methods
    public void placeOrder() {
        System.out.println(getName() + " placed an order.");
    }

    public void viewRestaurants() {
        System.out.println(getName() + " is viewing restaurants.");
    }
}
