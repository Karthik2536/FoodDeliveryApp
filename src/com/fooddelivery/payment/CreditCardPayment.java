/*package com.fooddelivery.payment;

public class CreditCardPayment {

}*/


package com.fooddelivery.payment;

public class CreditCardPayment implements PaymentMethod {

    // Encapsulation
    private String cardToken;

    // Constructor
    public CreditCardPayment(String cardToken) {
        this.cardToken = cardToken;
    }

    // Getter
    public String getCardToken() {
        return cardToken;
    }

    // Setter
    public void setCardToken(String cardToken) {
        this.cardToken = cardToken;
    }

    // Overriding interface method
    @Override
    public void processPayment(double amount) {

        System.out.println("Processing Credit Card Payment...");
        System.out.println("Amount Paid: ₹" + amount);

        System.out.println("Payment Successful using Credit Card");
    }
}