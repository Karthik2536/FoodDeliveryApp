/*package com.fooddelivery.driver;

public class Driver {

}*/

package com.fooddelivery.driver;

import com.fooddelivery.users.user;

public class Driver extends user {

    // Private fields (Encapsulation)
    private String vehicleNumber;
    private String gpsLocation;
    private boolean available;

    // Constructor
    public Driver(int id,
                  String name,
                  String phone,
                  String password,
                  String vehicleNumber,
                  String gpsLocation) {

        // Parent constructor
        super(id, name, phone, password);

        this.vehicleNumber = vehicleNumber;
        this.gpsLocation = gpsLocation;
        this.available = true;
    }

    // Getter methods
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getGpsLocation() {
        return gpsLocation;
    }

    public boolean isAvailable() {
        return available;
    }

    // Setter methods
    public void setGpsLocation(String gpsLocation) {
        this.gpsLocation = gpsLocation;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Driver accepts order
    public void acceptOrder() {
        System.out.println(getName() + " accepted the order.");
    }

    // Driver delivers order
    public void deliverOrder() {
        System.out.println(getName() + " delivered the order.");
    }

    // Update GPS location
    public void updateLocation(String newLocation) {
        this.gpsLocation = newLocation;

        System.out.println("Driver location updated to: "
                + gpsLocation);
    }
}