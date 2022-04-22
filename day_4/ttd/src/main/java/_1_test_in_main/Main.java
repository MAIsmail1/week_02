package _1_test_in_main;

import _2_test_with_junit.Service2;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        String msg = service.helloWorld();
        System.out.println(msg);
    }
}
