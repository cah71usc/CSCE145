//Christia Ayana Holland

import java.util.Scanner;

public class CoffeeTester {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        boolean Tester = true;

        System.out.println("Welcome to the Coffee Hour!!!");

        while (Tester) {
            Coffee coffee1 = new Coffee();
            Coffee coffee2 = new Coffee();

            // Input for first coffee
            System.out.print("What's the name of the first coffee?\n");
            String name1 = key.nextLine();
            coffee1.setName(name1);

            int caffeineContent1;
            while (true) {
                System.out.print("What's the caffeine content?\n");
                caffeineContent1 = key.nextInt();
                try {
                    coffee1.setCaffeineContent(caffeineContent1);
                    break; // Exit loop if valid
                } catch (Coffee.CoffeeException e) {
                    System.out.println(e.getMessage());
                }
            }
            //User Input
            key.nextLine(); 

            // Output for first coffee
            System.out.println("Coffee Name: " + coffee1.getName());
            System.out.println("Caffeine Amount: " + coffee1.getCaffeineContent());
            System.out.printf("It would take %.1f cups of %s before it's dangerous to drink more.\n",
                    coffee1.riskyAmount(), coffee1.getName());

            // Input for second coffee
            System.out.print("What's the name of the second coffee?\n");
            String name2 = key.nextLine();
            coffee2.setName(name2);

            int caffeineContent2;
            while (true) {
                System.out.print("What's the caffeine content?\n");
                caffeineContent2 = key.nextInt();
                try {
                    coffee2.setCaffeineContent(caffeineContent2);
                 // Exit loop if valid
                    break; 
                } catch (Coffee.CoffeeException e) {
                    System.out.println(e.getMessage());
                }
            }
            key.nextLine(); 

            // Output for second coffee
            System.out.println("Coffee Name: " + coffee2.getName());
            System.out.println("Caffeine Amount: " + coffee2.getCaffeineContent());
            System.out.printf("It would take %.1f cups of %s before it's dangerous to drink more.\n",
                    coffee2.riskyAmount(), coffee2.getName());

            // Check if both coffees are equal
            boolean Equal = coffee1.equals(coffee2);
            System.out.println("Are both coffees the same? " + Equal);

            // Ask user if they want to continue or stop
            System.out.print("Do you want to create more coffee objects? Enter \"Yes\" or \"No\":\n");
            String response = key.next();
            Tester = response.equalsIgnoreCase("Yes");
            key.nextLine(); 
        }

        key.close();
    }
}
