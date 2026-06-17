/*package com.fooddelivery.users;

public class user {
    // Encapsulation: private variables cannot be accessed directly outside this class
    private String userId;
    private String name;
    private String password;

    // Constructor to initialize the user
    public user(String userId, String name, String password) {
        this.userId = userId;
        this.name = name;
        this.password = password;
    }

    // Getter for Name (Safe to expose)
    public String getName() {
        return name;
    }

    // Setter for Name (Allows changing name, but rejects empty values)
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }

    // Getter for UserId (No setter provided, making it read-only)
    public String getUserId() {
        return userId;
    }

    // Encapsulation in action: Instead of giving away the password, 
    // we provide a control method to verify it.
    public boolean verifyPassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }
}*/



package com.fooddelivery.users;

public class user {

    // Encapsulation (private fields)
    private int id;
    private String name;
    private String phone;
    private String password;

    // Constructor
    public user(int id, String name, String phone, String password) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.password = password;
    }

    // Getter Methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    // Secure method
    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    // Setter Methods
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Display user details
    public void displayUserDetails() {
        System.out.println("User ID : " + id);
        System.out.println("Name    : " + name);
        System.out.println("Phone   : " + phone);
    }
}
