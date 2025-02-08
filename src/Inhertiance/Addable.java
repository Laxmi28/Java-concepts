package Inhertiance;

public interface Addable {
   
    String name = "Laxmi";

    void add();

    default void printMessage(){
        System.out.println("r u fine?");
    }
    
    static void owner(String name){
        System.out.println("I am the owner " + name);
    }

}
