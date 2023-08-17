import java.io.InvalidClassException;
import java.util.ArrayList;

import javax.management.InvalidApplicationException;
public class Application {

	public static void main(String[] args) throws InvalidSimIDException,  InvalidApplicationException, InvalidClassException {
		
		// Location Tests
        System.out.println("*********************************************");
        System.out.println("Location Tests");
        System.out.println("*********************************************");
        Location location1 = new Location(1, 2);
        System.out.println("Location 1: " + location1);
        location1.update(3, 4);
        System.out.println("Updated Location 1: " + location1);

        // Animal Tests
        System.out.println("*********************************************");
        System.out.println("Animal Tests");
        System.out.println("*********************************************");
        // Animal is abstract, so we cannot instantiate it directly
        // Animal animal = new Animal(); // This will cause a compilation error

        // Goldfinch Tests
        System.out.println("*********************************************");
        System.out.println("Goldfinch Tests");
        System.out.println("*********************************************");
        Goldfinch goldfinch = new Goldfinch();
        System.out.println("Goldfinch: " + goldfinch);
        goldfinch.setSimID(123);
        goldfinch.setWingSpan(5.0);
        goldfinch.setFull(true);
        goldfinch.setRested(true);
        goldfinch.walk(2);
        goldfinch.fly(new Location(5, 6));
        System.out.println("Updated Goldfinch: " + goldfinch);

        // BrownBear Tests
        System.out.println("*********************************************");
        System.out.println("BrownBear Tests");
        System.out.println("*********************************************");
        BrownBear brownBear = new BrownBear();
        System.out.println("BrownBear: " + brownBear);
        brownBear.setSimID(456);
        brownBear.setSubSpecies("Alaskan");
        brownBear.setFull(true);
        brownBear.setRested(true);
        brownBear.walk(2);
        brownBear.swim(3);
        System.out.println("Updated BrownBear: " + brownBear);
        
     // Generics Tests
        System.out.println("*********************************************");
        System.out.println("Generics Tests");
        System.out.println("*********************************************");

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Goldfinch());
        animals.add(new Goldfinch());
        animals.add(new BrownBear());
        animals.add(new BrownBear());

        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    }
