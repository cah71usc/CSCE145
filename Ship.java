
public class Ship {
    private String name;
 // Format: mm/dd/yyyy
    private String launchDate;  

    // Constructor
    public Ship(String name, String launchDate) {
        this.name = name;
     // Using the mutator to validate date
        setLaunchDate(launchDate);
        
    }

    // Accessors
    public String getName() {
        return name;
    }

    public String getLaunchDate() {
        return launchDate;
    }

    // Mutators
    public void setName(String name) {
        this.name = name;
    }

    public void setLaunchDate(String launchDate) {
        if (isValidLaunchDate(launchDate)) {
            this.launchDate = launchDate;
        } else {
            System.out.println("Invalid launch date. It should be between 1990 and 2019.");
        }
    }

    // Validate launch date between 1990 and 2019
    private boolean isValidLaunchDate(String launchDate) {
        try {
            String[] dateParts = launchDate.split("/");
            int year = Integer.parseInt(dateParts[2]);
            return year >= 1990 && year <= 2019;
        } catch (Exception e) {
            return false;
        }
    }

    //  return  ship information
    public String toString() {
        return "Name: " + name + "\nLaunch Date: " + launchDate;
    }
}

