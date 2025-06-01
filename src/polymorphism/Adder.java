package polymorphism;

public class Adder {

    /* this is example for method overloading
     * 
     * It is been executed a compile time level
     */



    static int add(int a ,int b){
        System.out.println("calling the int method");
        return a + b;
    }
    
     static float add(float a ,float b){
        return a + b;
    }

    public static void main(String[] args) {
        

      System.out.println(Adder.add(1f, 0f));
    }


}
