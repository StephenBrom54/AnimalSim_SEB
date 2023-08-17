import java.io.InvalidClassException;
import java.util.Arrays;

public class Location {
    private int xCoord;
    private int yCoord;

    public Location() {
        this.xCoord = 0;
        this.yCoord = 0;
    }

    public Location(int xCoord, int yCoord) throws InvalidClassException {
        if (xCoord < 0 || yCoord < 0) {
            throw new InvalidClassException("Coordinates cannot be less than zero.");
        }
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    public void update(int xCoord, int yCoord) throws InvalidClassException {
        if (xCoord < 0 || yCoord < 0) {
            throw new InvalidClassException("Coordinates cannot be less than zero.");
        }
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    public int[] getCoordinates() {
        return new int[]{this.xCoord, this.yCoord};
    }


class InvalidCoordinateException extends Exception {
    public InvalidCoordinateException(String message) {
        super(message);
    }
    
    Location loc = new Location();

	public Location getLoc() {
		return loc;
	}

	public void setLoc(Location loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "InvalidCoordinateException [loc=" + loc + ", getLoc()=" + getLoc() + ", getMessage()=" + getMessage()
				+ ", getLocalizedMessage()=" + getLocalizedMessage() + ", getCause()=" + getCause() + ", toString()="
				+ super.toString() + ", fillInStackTrace()=" + fillInStackTrace() + ", getStackTrace()="
				+ Arrays.toString(getStackTrace()) + ", getSuppressed()=" + Arrays.toString(getSuppressed())
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}


}}


