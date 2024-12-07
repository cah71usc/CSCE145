
import java.util.Scanner;

public class ShipNavigator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Welcome to ShipNavigator!!!");

        // Loop to create multiple ship objects
        boolean keepCreating = true;
        while (keepCreating) {
            System.out.print("\nEnter the name of the ship:\n");
            String shipName = scanner.nextLine();

            System.out.print("Enter its launch date (mm/dd/yyyy):\n");
            String launchDate = scanner.nextLine();

            System.out.print("Is it a cruise ship or a cargo ship?\n");
            String shipType = scanner.nextLine().toLowerCase();

            if (shipType.equals("cruise ship")) {
                // Get CruiseShip details
                System.out.print("Enter the ship's passenger capacity:\n");
                int passengerCapacity = scanner.nextInt();
                System.out.print("How many crew members are on this ship?\n");
                int crewMembers = scanner.nextInt();
                scanner.nextLine();  // Consume the newline

                // Create CruiseShip
                CruiseShip cruiseShip = new CruiseShip(shipName, launchDate, passengerCapacity, crewMembers);
                System.out.println("\nCreating a cruise ship...");
                System.out.println("\nPrinting the ship's details:\n" + cruiseShip);

            } else if (shipType.equals("cargo ship")) {
                // Get CargoShip details
                System.out.print("Enter the ship's tonnage (DWT):\n");
                double tonnage = scanner.nextDouble();
                System.out.print("Enter the maximum speed of the ship (in mph):\n");
                double maxSpeed = scanner.nextDouble();
                scanner.nextLine();  // Consume the newline

                // Create CargoShip
                CargoShip cargoShip = new CargoShip(shipName, launchDate, tonnage, maxSpeed);
                System.out.println("\nCreating a cargo ship...");
                System.out.println("\nPrinting the ship's details:\n" + cargoShip);
            }

            // Ask if user wants to create another ship
            System.out.print("\nDo you want to construct another ship object? Enter yes or no:\n");
            String response = scanner.nextLine().toLowerCase();
            if (response.equals("no")) {
                keepCreating = false;
                System.out.println("Goodbye");
            }
        }

        scanner.close();
    }
}

