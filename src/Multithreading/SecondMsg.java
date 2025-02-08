package Multithreading;


class Test2 implements Runnable{

    @Override
    public void run() {
        for (int i=1;i<=99999999 ; i++){
            System.out.println("Printing Test message.......");
        }
        
    }

}
public class SecondMsg extends Thread {
    
    @Override
    public void run(){
        for (int i=1;i<=99999999 ; i++){
            System.out.println("The second word");
         }
         
    }

    public static void main(String[] args) {

        
    }

}
