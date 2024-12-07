
public class CargoShip extends Ship {
	// Dead weight tonnage
    private double tonnage;  
 // Maximum speed in mph
    private double maxSpeed; 

    // Constructor
    public CargoShip(String name, String launchDate, double tonnage, double maxSpeed) {
        super(name, launchDate);
        this.tonnage = tonnage;
        this.maxSpeed = maxSpeed;
    }

    // Accessors
    public double getTonnage() {
        return tonnage;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    // Mutators
    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // Override toString method to display CargoShip-specific info
    @Override
    public String toString() {
        return "Name: " + getName() + "\nTonnage: " + tonnage + " DWT\nMaximum Speed: " + maxSpeed + " mph";
    }
}

