package Inhertiance;

public interface Sayable extends Addable {

    void say();

    default void printVariable(){
        System.out.println(name);
    }

    static void printName(){
        System.out.println("This is in the name fashion");
    }

}
