package Inhertiance;

public abstract class Just implements Sayable  {

    public Just(){

    }

    private Just(String className){
       System.out.println(className);
    }

    //whenever there is case where you want to implemt=ent the default and static method in an interface you need to make the access modifire public
    @Override
    public void printVariable(){
        System.out.println("Say yes");
        Sayable.super.printVariable();
    }

    // you can override a static methofd from interface in a class
    public void printName(){
        System.out.println("This is in the abstract class");
        Sayable.printName();
    }



}
