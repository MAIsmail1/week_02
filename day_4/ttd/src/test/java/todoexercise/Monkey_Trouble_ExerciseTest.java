package todoexercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Monkey_Trouble_ExerciseTest {
    Monkey_Trouble_Exercise monkeyTroubleExercise = new Monkey_Trouble_Exercise();

    @Test
    void monkeyTrouble_true_true() {
        // given
        boolean firstParam = true;
        boolean secondParam = true;

        //when
        boolean actualValue = monkeyTroubleExercise.monkeyTrouble(firstParam, secondParam);
        //then
        assertTrue(actualValue);
    }

    @Test
    void monkeyTrouble_false_false() {
        // given
        boolean firstParam = false;
        boolean secondParam = false;
        //when
        boolean actualValue = monkeyTroubleExercise.monkeyTrouble(firstParam, secondParam);
        //then
        assertTrue(actualValue);

    }

    @Test
    void monkeyTrouble_true_false() {
        // given
        boolean firstParam = true;
        boolean secondParam = false;
        //when
        boolean actualValue = monkeyTroubleExercise.monkeyTrouble(firstParam, secondParam);
        //then
        assertFalse(actualValue);

    }
}