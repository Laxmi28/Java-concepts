package Multithreading.Revisit;

class MyThread2 implements Runnable{



    @Override
    public void run() {
       for (int i = 0 ; i <= 4 ; i++){
            System.out.println(Thread.currentThread().getName() + "- Count :" + i);

            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){

            }
        }
    }
    
}

public class MyThread extends Thread {

    private String name ;

    public MyThread(String name){
      this.name = name;
    }

    public void run(){
        for (int i = 0 ; i <= 4 ; i++){
            System.out.println(name + "- Count :" + i);

            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){

            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread("T1");
        MyThread thread2 = new MyThread("T2");
        MyThread thread3 = new MyThread("T3");
        System.out.println(Thread.currentThread().getName());

      

        thread1.start();
        thread2.start();
        thread3.start(); 
        /**
         * thread is started using start() here instead of throwing a interrupted Exception it is better to try and catch block
         */

         thread1.join();
         thread2.join();
         thread3.join();

         /*
          * same with the help of runnable interface
          */

        Thread ty = new Thread(new MyThread2());
        ty.setPriority(MAX_PRIORITY);
        ty.start();

        Runnable runnable = new Runnable() {
            @Override
            public void run(){
                System.out.println("There is some process happening");
            }
        };

        Thread tg = new Thread(runnable);
        tg.setPriority(MIN_PRIORITY);
        tg.start();

        Thread tr = new Thread(()-> {
              for(int j = 0 ; j <= 8 ; j++){
                  try{
                    Thread.sleep(1200);
                    System.out.println(Thread.currentThread().getName() + "count of j : " + j);
                  }catch(InterruptedException i){
                    System.out.println("the thread is interrupted");
                  }
              }
        } );
        
        System.out.println(tr.getState());
        tr.start();
        System.out.println(tr.getState());
        tr.join();
        System.out.println(tr.getState());
         



    }

}
