package ki304.salahub.Lab6;

import java.util.ArrayList;


/**
 * The WeaponCase class represents a container for storing objects that implement the WeaponObject interface.
 * It provides methods to find the object with the smallest caliber, put a new object into the case,
 * extract an object from the case, and display information about all objects in the case.
 *
 * @param <T> The type parameter indicating that T must be a subclass of WeaponObject.
  * @author Andriy
 * @version 1.0
 * @since 2023-11-26
 */
public class WeaponCase<T extends WeaponObject> {
    private ArrayList<T> arr;

    /**
     * Constructor for creating a new WeaponCase object with an empty array list.
     */
    public WeaponCase() {
        arr = new ArrayList<T>();
    }

    /**
     * Finds the object with the smallest caliber in the WeaponCase and prints its information.
     */
    public void findMin() {
        if (!arr.isEmpty()) {
            T min = arr.get(0);
            for (int i = 1; i < arr.size(); i++) {
                if (arr.get(i).compareTo(min) < 0)
                    min = arr.get(i);
            }
            System.out.print("The smallest caliber of object is: ");
            min.printInfo();
        }
        System.out.println();
    }

    /**
     * Puts a new object into the WeaponCase and prints information about the added object.
     *
     * @param object The object to be added to the WeaponCase.
     */
    public void putInObj(T object) {
        arr.add(object);
        System.out.print("You put: ");
        object.printInfo();
        System.out.println();
    }

    /**
     * Extracts an object from the WeaponCase at the specified index and prints information about the extracted object.
     *
     * @param index The index of the object to be extracted.
     */
    public void extractTheObject(int index) {
        if (index >= 0 && index < arr.size()) {
            T pushOutObject = arr.get(index);
            System.out.print("You pushed out object: ");
            pushOutObject.printInfo();
            arr.remove(index);
        } else {
            System.out.println("Invalid index. Cannot push out object.");
        }
        System.out.println();
    }

    /**
     * Displays information about all objects in the WeaponCase.
     */
    public void seeAllObjects() {
        System.out.println("All objects in the weapon case:");
        System.out.println();
        for (T object : arr) {
            object.printInfo();
        }
        System.out.println();
    }
}


