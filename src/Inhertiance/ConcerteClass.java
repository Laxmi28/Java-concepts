package Inhertiance;

public class ConcerteClass extends Just {

    @Override
    public void say() {
      System.out.println("here i am saying  a value");
    }

    @Override
    public void add() {
        System.out.println("here i am adding a value");
        
    }

    public static void main(String[] args){
        System.out.println("helllo");

        Animal animal = new Animal() {

            @Override
            public String category(String name) {
               return "I belong to the category : " + name;
            }
           
        };

        System.out.println(animal.category("kenaine"));

        System.out.println("The emum is :" +  Days.FRIDAY);
        Days day = Days.FRIDAY;
        day.printDay();
    }

}
