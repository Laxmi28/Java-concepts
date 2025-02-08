package Collections.MapImplemetation;

import java.util.EnumMap;

public class EnumMapDemo {
   
    public static void main(String[] args) {

        EnumMap<WeeKday , String>  map = new EnumMap<>();

        map.put(WeeKday.MONDAY, "study");

        
    }
}

enum WeeKday{
   
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THRUSDAY,
    FRIDAY,
    
}
