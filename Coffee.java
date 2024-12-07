//Christia Ayana Holland
public class Coffee {
    private String name;
    private int caffeineContent; // measured in mg

    //  Exception for Coffee
    public static class CoffeeException extends Exception {
        public CoffeeException(String message) {
            super(message);
        }
    }

    // Default constructor
    public Coffee() {
        this.name = "none";
        this.caffeineContent = 50;
    }

    // Accessors
    public String getName() {
        return name;
    }

    public int getCaffeineContent() {
        return caffeineContent;
    }

    // Mutators
    public void setName(String name) {
        this.name = name;
    }

    public void setCaffeineContent(int caffeineContent) throws CoffeeException {
        if (caffeineContent < 0 || caffeineContent > 1000) { // Example condition
            throw new CoffeeException("Caffeine content must be between 0 and 1000 mg.");
        }
        this.caffeineContent = caffeineContent;
    }

    // Risky Amount calculation
    public double riskyAmount() {
        return 180.0 / ((caffeineContent / 100.0) * 6.0);
    }

    // Equals method
    
    public boolean equals(Object obj) {
        if (this == obj) return true;

        try {
            Coffee other = (Coffee) obj; // Attempt to cast
            return this.name.equals(other.name) && this.caffeineContent == other.caffeineContent;
        } catch (ClassCastException e) {
            return false; // If it fails, return false
        }
    }

    // toString method
    
    public String toString() {
        return "Name: " + name + "\nCaffeine Amount: " + caffeineContent + "mg";
    }
}
