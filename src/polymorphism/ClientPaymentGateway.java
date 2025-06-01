package polymorphism;

import java.util.Scanner;

public class ClientPaymentGateway {
    public static void main(String[] args) {

        PaymentProcessor paymentProcessor = new PaymentProcessor();
        Scanner sc = new Scanner(System.in);

        // System.out.println("Please enter the total amount you need to pay ");

        // Long amount = sc.nextLong();

        System.out.println("Please enter the payment method (creditCard,Upi)");

        String paymentMethodType = sc.nextLine().toLowerCase().trim();

        PaymentMethod method;

        switch (paymentMethodType) {
            case "creditCard":
                 method = new CreditCard();
                break;

            case "upi":
               method = new UPI();
               break;    
        
            default:
                throw new IllegalArgumentException("Unsupported payment method");
              
        }

        paymentProcessor.processPayment(method, 1000L);

        
    }

}
