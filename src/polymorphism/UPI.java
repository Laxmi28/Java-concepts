package polymorphism;

public class UPI  implements PaymentMethod{

    @Override
    public void pay(Long value) {
     System.out.println("Making payment with the help of UPI for amount " + value);
    }

}
