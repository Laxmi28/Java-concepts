import java.util.Scanner;


public class VirtualPet {
    private String name;
    private int hunger;     
    private int happiness; 
    private int energy;    

    public VirtualPet(String name) {
        this.name = name;
        this.hunger = 5;    
        this.happiness = 5;  
        this.energy = 5;     
    }

    public void feed() {
        if (hunger > 0) {
            hunger -= 2;
            System.out.println(name + " is eating...");
        } else {
            System.out.println(name + " is already full!");
        }
 
        hunger = Math.max(hunger, 0);
    }


    public void play() {
        if (energy > 1) {
            happiness += 2;
            hunger += 1;
            energy -= 2;
            System.out.println(name + " is playing and is happier!");
        } else {
            System.out.println(name + " is too tired to play.");
        }

        happiness = Math.min(happiness, 10);
    }


    public void sleep() {
        energy = 10; 
        System.out.println(name + " is sleeping and has regained energy!");
    }


    public void checkStatus() {
        System.out.println("\n--- Status of " + name + " ---");
        System.out.println("Hunger: " + hunger + "/10");
        System.out.println("Happiness: " + happiness + "/10");
        System.out.println("Energy: " + energy + "/10\n");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter the name of your virtual pet: ");
        String petName = scanner.nextLine();

        VirtualPet pet = new VirtualPet(petName);


        while (true) {
            pet.checkStatus();

            System.out.println("What would you like to do with " + petName + "?");
            System.out.println("1. Feed");
            System.out.println("2. Play");
            System.out.println("3. Sleep");
            System.out.println("4. Exit");


            int choice = -1;
            boolean validInput = false;
            while (!validInput) {
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a number between 1 and 4.");
                    scanner.next();  
                }
            }

            switch (choice) {
                case 1:
                    pet.feed();
                    break;
                case 2:
                    pet.play();
                    break;
                case 3:
                    pet.sleep();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    scanner.close();  
                    return;
                default:
                    System.out.println("Invalid option, please choose again.");
            }
        }
    }
}
