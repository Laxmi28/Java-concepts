package Abstraction;

public class Main {
  public static void main(String[] args) {

    Fox animal = new Fox();

    animal.sound();

    animal.zooWelcomeMessage();

    animal.zooDesc();

    /*
     * In case of animal as the reference type the method zooDesc will not be visible as it is implemeted by a subclass
     * not by a child class in order to make it accessible we need to change the reference type to child class
     */

     /*
      * Abstract class can only be implemented using anonymous class can never be implemented using lambda expersions
       following is the example for the same
      */

      Machine machine = new Machine() {
        
        public void start(){
          System.out.println("Starting the machine");
        }

        public void stop(){
          System.out.println("stoping the machine");
        }
      };


      machine.start();
      machine.stop();


      try{
        String s = "k";
        System.out.println(s.toLowerCase().toCharArray());
      }catch(NullPointerException e ){
          e.printStackTrace();
      } 

      try{

        int[] arr = new int[5];
        System.out.println(arr[9]);

      }catch(ArrayIndexOutOfBoundsException | ArithmeticException a){
          a.printStackTrace();
          return;
      }
      catch(Exception e){
          e.printStackTrace();
      }finally{
        System.out.println("the finally block is execcuted");
      }


   
  }
}
