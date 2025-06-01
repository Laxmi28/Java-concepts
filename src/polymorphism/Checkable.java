package polymorphism;

@FunctionalInterface
public interface Checkable {

    static String code = "Hello";

    void check();

    default void printLog(){
        log();
    }

    static void status(){
       System.out.println("Running...");
    }

    private void log(){
        System.out.println("logging message....");
    }

}
