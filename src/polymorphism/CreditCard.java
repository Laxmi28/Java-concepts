package polymorphism;

public class CreditCard  implements  PaymentMethod{

    @Override
    public void pay(Long value) {
      System.out.println("Payment done with the help of Credit Card for amount " + value);
    }

}
