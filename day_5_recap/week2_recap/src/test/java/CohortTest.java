import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CohortTest {

    @Test
    void startsWithNoStudents(){
        // Given
        Cohort cohort = new Cohort("test cohort");
        // When

        // Then
        assertEquals(0, cohort.countStudents());
    }

    @Test
    void canAddStudent(){
        // Given - a cohort and a student
        Cohort cohort = new Cohort("test cohort");
        Student student = new Student("test student", 25, "Birmingham", "UEA");
        // When - we add the student to the cohort
        cohort.addStudents(student);
        // Then - the cohort should have one student in it
        assertEquals(1, cohort.countStudents());
    }
}
