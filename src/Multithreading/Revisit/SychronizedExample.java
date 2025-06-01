package Multithreading.Revisit;


 class Counter{
   

    private int count;

    Counter(int count){
        this.count = count;
    }

    public void increaseCount() throws InterruptedException{
        synchronized(this){
              count++;
              Thread.sleep(1000);
              System.out.println("Inside the static block");
        }
        System.out.println("Outside the static block");
    }

    public int getCOunt() throws InterruptedException{
         Thread.sleep(1000);
        return this.count;
    }
}
public class SychronizedExample {

    Counter counter;

    SychronizedExample(Counter counter){
        this.counter = counter;
    }

    public static void main(String[] args) throws InterruptedException {
        
       Counter counter = new Counter(12);

       SychronizedExample example = new SychronizedExample(counter);

       Thread t1 = new Thread(()->{
            for(int i = 0 ; i <= 5 ; i++){
                
               try {
                counter.increaseCount();
               } catch (InterruptedException e) {
                Thread.currentThread().interrupt();

                if ( Thread.interrupted()){
                    System.out.println("logging it somewhere");
                }
               
                e.printStackTrace();
               }
            }
       });

        Thread t2 = new Thread(()->{
            for(int i = 0 ; i <= 5 ; i++){
            try {
                System.out.println("the count of the counter is : " + counter.getCOunt());
            } catch (InterruptedException e) {
            
                e.printStackTrace();
            }
            }
       });

       t1.start();
       t2.start();

       t1.join();
       t2.join();

       System.out.println();

       


    }

}
