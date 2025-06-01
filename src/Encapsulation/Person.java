package Encapsulation;

public class Person {
    
    private String name;
    private int id;

    public void setName(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }
    
    public String toString(){
        return "Person id: " + this.id + " name :" + this.name;
    }

    public static void main(String[] args) {
        Person p  = new Person();
        p.setId(12);
        p.setName("hello there");
        System.out.println(p);


    }

}
