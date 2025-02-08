package Inhertiance.clazz;

public abstract class Kingdom implements Actions , habits {

    private static String category = "Omniverous";
    
    @Override
    public String eat(){
            System.out.println(Actions.super.eat());
            return "Animal is eating";

    }




}
