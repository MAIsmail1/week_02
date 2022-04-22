package _2_test_with_junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Service2Test {

    @Test
//    @DisplayName("When calling hello(\"Mohamed\") on a Service2 object we should get")
    void helloTest() {
        // given  (an object of type Service2)
        Service2 service = new Service2();
        String expectedValue = "Hello, Mohamed!";
        // when (when hello is called with "mohamed")
        String actualValue = service.hello("Mohamed");
        // then  (it should return "Hello, lucas!")
        assertEquals(expectedValue, actualValue);
//        fail();
    }
}