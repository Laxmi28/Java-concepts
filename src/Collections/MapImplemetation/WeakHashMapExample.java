package Collections.MapImplemetation;

import java.util.WeakHashMap;

class Image{
     String image;

     public Image(String image){
        this.image = image;
     }
     
     @Override
     public String toString(){
        return "Image name : " + image;
     }
}
public class WeakHashMapExample {

    public static void main(String[] args) {
        
        WeakHashMap<String , Image> weakHashMap = new WeakHashMap<>();
        
       weakHashMap.put("img1", new Image("test.img"));
       weakHashMap.put("img2", new Image("test2.img"));
       System.out.println(weakHashMap);
       System.gc();

       try{
         Thread.sleep(5000);
       }catch(Exception e){

       }
        System.out.println(weakHashMap);

        /* The above code will not work because here the keys used are of string literal which are 
         * by default of strong reference in order to resolve this issue we need to make this string referenceing as
         * a weak reference using String s = new String() so we can create a weak reference for that
         */


           
       weakHashMap.put( new String("test1.img"), new Image("test.img"));
       weakHashMap.put(new String("test2.img"), new Image("test2.img"));
       System.out.println(weakHashMap);
       System.gc();

       try{
         Thread.sleep(5000);
       }catch(Exception e){

       }
        System.out.println(weakHashMap);

        /* it is not suggested to use as it removes the data after sometime in the programs
         * so it most;y suggested for caching system
         */
    }

}
