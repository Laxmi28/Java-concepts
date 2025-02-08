package Multithreading;

public class Test {
  
    public static void main(String[] args) {
        
       System.out.println("hello");
       System.out.println(Thread.currentThread().getName());

       SecondMsg secondMsg = new SecondMsg();
       secondMsg.start();
       /* this is the first way of writing code and below is the second way of doing the same with the
        * help of runnable interface
        */

       Test2 test2 = new Test2();
       Thread t1 = new Thread(test2);
       t1.start();

       for (int i=1;i<=99999999 ; i++){
        System.out.println("the first message");
       }

    }
}
