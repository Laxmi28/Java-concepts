package polymorphism;

public class PaymentProcessor {

    public void processPayment(PaymentMethod method , Long amount){
        method.pay(amount);
    }

}
