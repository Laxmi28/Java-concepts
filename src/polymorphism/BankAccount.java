package polymorphism;

public class BankAccount {

    private String name;
    private double balance;
    private int age;

    /*
     * usuage of this with constructor chaining
     */
    

    BankAccount(String name){
        this(name,0.0,0);
    }

    BankAccount(String name , double balance , int age){
        this.name = name;
        this.balance = balance;
        this.age = age;
    }

    public static void main(String[] args) {
        BankAccount ac = new BankAccount("Laxmi");
        System.out.println(ac.balance);
        System.out.println(ac.age);
    }

}
