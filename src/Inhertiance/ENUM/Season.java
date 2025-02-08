package Inhertiance.ENUM;

public enum Season {
    
    
    SUMMER("hot summer is here"),
    WINTER("Icy cool winter is here"),
    RAINY("Rain Rains is here");  

    private String message;

    private Season(String message){
        this.message = message;
    }
    
    private String getMessage(){
        return message;
    }

    private void setMessage(String msg){
        this.message = msg;
    }

    public static void main(String[] args) {
         
        // for(Season s : Season.values()){
        //     System.out.println(s);
        // }

        Season season = Season.SUMMER;
        System.out.println(season.getMessage());

        season.setMessage("The hot summer brings the joy of cool ice-creams");
        System.out.println(season.getMessage());


        Season season2 = Season.SUMMER;
        System.out.println(season2.getMessage());
        System.out.println(Season.WINTER.ordinal());

        System.out.println(Season.RAINY.name());
    }

}
