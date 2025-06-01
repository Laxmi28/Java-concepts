package ExceptionHandling;

public class Human extends Concisous {
        
   @Override
    public void think() throws ArithmeticException{
        // int i = 0;
        // System.out.println(10/i);
        System.out.println("We are living thinking human being!");
    }

    public static void main(String[] args) {
        Concisous human = new Human();
        human.think();

        Runnable runnable = new Runnable() {
            public void run(){
                try{
                    throw new IllegalArgumentException("A illegal agrument exception is thrown!!");
                }catch(IllegalArgumentException e){
                     e.printStackTrace();
                }
            }
        };

        runnable.run();
    }
    

}
