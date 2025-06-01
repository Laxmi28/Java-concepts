package Abstraction;

public class Fox extends Animal implements Zoo {

    @Override
    void sound() {
       System.out.println("The fox has a cunning voice");
    }

    @Override
    public void zooDesc() {
       System.out.println("The Animal's jungle zoo!!");
    }

}
