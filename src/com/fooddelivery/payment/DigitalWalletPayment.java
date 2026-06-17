/*package com.fooddelivery.payment;

public class DigitalWalletPayment {

}
*/

package com.fooddelivery.payment;

public class DigitalWalletPayment implements PaymentMethod {

    // Encapsulation
    private String walletId;

    // Constructor
    public DigitalWalletPayment(String walletId) {
        this.walletId = walletId;
    }

    // Getter
    public String getWalletId() {
        return walletId;
    }

    // Setter
    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    // Overriding method
    @Override
    public void processPayment(double amount) {

        System.out.println("Processing Wallet Payment...");
        System.out.println("Amount Paid: ₹" + amount);

        System.out.println("Payment Successful using Wallet");
    }
}