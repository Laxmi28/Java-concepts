package Collections.MapImplemetation;

import java.util.HashMap;

class HashMapExamplee{

    
    public static void main(String[] args) {
        HashMap<Person , Integer>  map = new HashMap<>();
        Person p1 = new Person("lxmi", 1);
        Person p2 = new Person("hello", 2);
        Person p3 = new Person("lxmi", 1);

        map.put(p1, 12);
        map.put(p2, 13);
        map.put(p3, 14);

        System.out.println(map.size());
        // this example needs to be studied

        
    }

}

public class Person {

    private String name;
    private int id;

    public Person ( String name , int id){
        this.name = name;
        this.id = id;
    }

}
