public class Goldfinch extends Animal {
    private double wingSpan;

    public Goldfinch() {
        super();
        this.wingSpan = 9.0;
    }

   // public Goldfinch(int simID, Location location, double wingSpan) throws InvalidApplicationException, InvalidSimIDException {
      //  super(simID, location);
       // this.setWingSpan(wingSpan);
 //   }

    public double getWingSpan() {
        return wingSpan;
    }

   // public void setWingSpan(double wingSpan) throws InvalidApplicationException {
       // if (wingSpan < 5.0 || wingSpan > 11.0) {
          //  throw new InvalidWingspanException("Invalid wingspan: " + wingSpan);
       // }
       // this.wingSpan = wingSpan;
   // }

    @Override
    public String toString() {
        return "Goldfinch{" +
                "wingSpan=" + wingSpan +
                ", simID=" + getSimID() +
                ", location=" + getLocation() +
                ", full=" + isFull() +
                ", rested=" + isRested() +
                '}';
    }

	public void fly(Location location) {
		// TODO Auto-generated method stub
		
	}

	public void setWingSpan(double d) {
		// TODO Auto-generated method stub
		
	}

	public void walk(int i) {
		// TODO Auto-generated method stub
		
	}
}

