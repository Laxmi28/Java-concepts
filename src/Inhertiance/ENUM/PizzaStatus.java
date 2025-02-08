package Inhertiance.ENUM;

public enum PizzaStatus {

    ORDERED(4){
        public boolean isOrdered(){
            return true;
        }
    },
    READY(3){
        public boolean isReady(){
            return true;
        }
    },
    DELIVERED(1){
        public boolean isDelievered(){
            return true;
        }
    },
    UNDELIVERED(2){
        public boolean isUndelievered(){
            return true;
        }
    };

    private int status;

    PizzaStatus(int status){
        this.status = status;
    }

    public boolean isOrdered(){
        return false;
    }
    public boolean isReady(){
        return false;
    }
    public boolean isDelievered(){
        return false;
    }
    public boolean isUndelievered(){
        return false;
    }
    
    public static void main(String[] args) {
        PizzaStatus pizzaStatus = PizzaStatus.ORDERED;
        System.out.println(pizzaStatus.isOrdered());
    }


}
