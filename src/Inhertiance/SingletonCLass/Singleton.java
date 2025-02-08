package Inhertiance.SingletonCLass;

public  class Singleton {

    private static Singleton instance;

    private Singleton(){

    }

    public static class InnerClass{
        public  static Singleton createInstance(){
            return  new Singleton();
        }

    }

    public static Singleton getInstance(){
        if (instance == null){
            instance = InnerClass.createInstance();
        }
        
        return instance;
    }
    
    

}
class main{
    public static void main(String[] args) {
        Singleton singleton =Singleton.getInstance();
        System.out.println(singleton);

    }
}