/*package com.fooddelivery.payment;

public class UPIPayment {

}
*/

package com.fooddelivery.payment;

public class UPIPayment implements PaymentMethod {

    // Encapsulation
    private String upiId;

    // Constructor
    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    // Getter
    public String getUpiId() {
        return upiId;
    }

    // Setter
    public void setUpiId(String upiId) {
        this.upiId = upiId;
    }

    // Overriding method
    @Override
    public void processPayment(double amount) {

        System.out.println("Processing UPI Payment...");
        System.out.println("Amount Paid: ₹" + amount);

        System.out.println("Payment Successful using UPI");
    }
}