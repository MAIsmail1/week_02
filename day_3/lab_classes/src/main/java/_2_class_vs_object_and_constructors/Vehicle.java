package _2_class_vs_object_and_constructors;

public class Vehicle {
    // class defines a type of object-like a blueprint
    // new Vehicle(), we want to call a constructor for this class. it's a special kind of method.
    // to construct objects out of particular class. object of particular type

    public Vehicle() {
        System.out.println("NO-arg constructor, a hardcoded message");
    }

    // constructor cannot be static
    //it must have a capital letter
    public Vehicle(String message) {
        System.out.println(message);

    }
}
