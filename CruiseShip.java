
public class CruiseShip extends Ship {
    private int passengerCapacity;
    private int crewMembers;

    // Constructor
    public CruiseShip(String name, String launchDate, int passengerCapacity, int crewMembers) {
        super(name, launchDate);
        this.passengerCapacity = passengerCapacity;
        this.crewMembers = crewMembers;
    }

    // Accessors
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public int getCrewMembers() {
        return crewMembers;
    }

    // Mutators
    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public void setCrewMembers(int crewMembers) {
        this.crewMembers = crewMembers;
    }

    // Override toString method to display CruiseShip-specific info
    @Override
    public String toString() {
        return "Name: " + getName() + "\nPassenger Capacity: " + passengerCapacity + "\nCrew: " + crewMembers;
    }
}
