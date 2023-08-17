public class BrownBear extends Animal {
    private String subSpecies;

    public BrownBear() {
        super();
        this.subSpecies = "Alaskan";
    }

    //public BrownBear(int simID, Location location, String subSpecies) throws InvalidClassException, InvalidSimIDException {
     //   super(simID, location);
      //  this.setSubSpecies(subSpecies);
    //}

    public String getSubSpecies() {
        return subSpecies;
    }

    //public void setSubSpecies(String subSpecies) throws InvalidClassException {
      //  if (!subSpecies.equals("Alaskan") && !subSpecies.equals("Asiatic") && !subSpecies.equals("European") && !subSpecies.equals("Grizzly") && !subSpecies.equals("Kodiak") && !subSpecies.equals("Siberian")) {
          //  throw new InvalidSubspeciesException("Invalid subspecies: " + subSpecies);
       // }
       // this.subSpecies = subSpecies;
  //  }

    @Override
    public String toString() {
        return "BrownBear{" +
                "subSpecies='" + subSpecies + '\'' +
                ", simID=" + getSimID() +
                ", location=" + getLocation() +
                ", full=" + isFull() +
                ", rested=" + isRested() +
                '}';
    }

	public void setSubSpecies(String string) {
		// TODO Auto-generated method stub
		
	}

	public void walk(int i) {
		// TODO Auto-generated method stub
		
	}

	public void swim(int i) {
		// TODO Auto-generated method stub
		
	}
}
