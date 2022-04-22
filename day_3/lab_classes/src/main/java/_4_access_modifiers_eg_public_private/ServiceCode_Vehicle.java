package _4_access_modifiers_eg_public_private;

public class ServiceCode_Vehicle {
    /*

    +-----------------------+
    |       Vehicle         |   <- name of the class
    +-----------------------+
    |    kind: String       |   <- properties section
    +-----------------------+
    |  startEngine(): void  |   <- methods section (data type could be boolean, string etc)
    +-----------------------+
    + public
    # protected
    ~ default (package private)
    - private

    +-----------------------+
    |       aClassName       |   <- name of the class
    +-----------------------+
    |   ~ propName: Type      |   <- properties section
    +-----------------------+
    | ~ methodName: returnType |   <- methods section (data type could be boolean, string etc)
    +-----------------------+

     */

    String kind = "A hardcoded value of the kind property";

    void startEngine() {
        System.out.println("The engine has started");
    }

}
//