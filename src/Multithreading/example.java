package Multithreading;

public class example{
   public static void main(String[] args) {
    FairnessOfLockExample example = new FairnessOfLockExample();

    Runnable runnable = new Runnable() {
        @Override
        public void run(){
         example.accessResource();
        }
    };

    Thread thread1 = new Thread(runnable,"Thread-1");
    Thread thread2 = new Thread(runnable,"Thread-2");
    Thread thread3 = new Thread(runnable,"Thread-3");
    
    thread1.start();
    thread2.start();
    thread3.start();
   }
   
     

}
