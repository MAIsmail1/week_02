package _5_this_getters_and_setters;

import jdk.swing.interop.SwingInterOpUtils;

public class PersonClient {
    public static void main(String[] args) {
//        Person person1 = new Person();
//        person1.setMobile("0123456789");
//        person1.setName("Mohamed");
//        person1.setAge(30);
//        System.out.println(person1.getName());
//        System.out.println(person1.getAge());

        Person person2 = new Person("Michelle", "987654321", 20);
        System.out.println(person2);
    }
}
