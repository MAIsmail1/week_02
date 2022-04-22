package _3_characteristics_and_behaviours_of_a_class;

public class Vehicle {
    /*

    +-----------------------+
    |       Vehicle         |   <- name of the class
    +-----------------------+
    |    kind: String       |   <- properties section
    +-----------------------+
    |  startEngine(): void  |   <- methods section (data type could be boolean, string etc)
    +-----------------------+

    +-----------------------+
    |       aClassName       |   <- name of the class
    +-----------------------+
    |    propName: Type      |   <- properties section
    +-----------------------+
    |  methodName: returnType |   <- methods section (data type could be boolean, string etc)
    +-----------------------+

     */

    String kind = "A hardcoded value of the kind property";

    void startEngine() {
        System.out.println("The engine has started");
    }

}
