import java.util.Random;

public class Animal {
    private int simID;
    private Location location;
    private boolean full;
    private boolean rested;

    public Animal() {
        this.simID = 0;
        this.location = new Location();
        this.full = false;
        this.rested = true;
    }

    public Animal(int simID, Location location) throws InvalidSimIDException {
        if (simID <= 0) {
            throw new InvalidSimIDException("SimID must be greater than zero.");
        }
        this.simID = simID;
        this.location = location;
        this.full = false;
        this.rested = true;
    }

    public void eat() {
        Random rand = new Random();
        double num = rand.nextDouble();
        if (num <= 0.5) {
            this.full = false;
        } else {
            this.full = true;
        }
    }

    public void sleep() {
        Random rand = new Random();
        double num = rand.nextDouble();
        if (num <= 0.5) {
            this.rested = false;
        } else {
            this.rested = true;
        }
    }

    public int getSimID() {
        return simID;
    }

    public void setSimID(int simID) throws InvalidSimIDException {
        if (simID <= 0) {
            throw new InvalidSimIDException("SimID must be greater than zero.");
        }
        this.simID = simID;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public boolean isFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public boolean isRested() {
        return rested;
    }

    public void setRested(boolean rested) {
        this.rested = rested;
    }
}

class InvalidSimIDException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 8467155636514444439L;

	public InvalidSimIDException(String message) {
        super(message);
    }
}
