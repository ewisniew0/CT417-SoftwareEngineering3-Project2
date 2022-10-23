package assignment1package.project2;

import assignment1package.course_program;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class mainTest {

    @Test
    void getGetName() {
        course_program course = new course_program("Computer Science & IT", new DateTime(2020, 8, 1, 8, 0), new DateTime(2020, 8, 1, 8, 0));

        String name = course.getCourse_name();

        System.out.println("\nTest for getCourse_name()\n");
        assertEquals (name, "Computer Science & IT");
    }
}