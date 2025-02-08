package Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairnessOfLockExample {

   private final Lock lock = new ReentrantLock(true);

   public void accessResource(){
      
    try{
        lock.lock();
        System.out.println(Thread.currentThread().getName() + " has aquired the lock");
        Thread.sleep(1000);

    }catch(Exception e){
        Thread.currentThread().interrupt();
    }finally{
        System.out.println(Thread.currentThread().getName() + " unlockin the lock");
        lock.unlock();
    }



   }

}
