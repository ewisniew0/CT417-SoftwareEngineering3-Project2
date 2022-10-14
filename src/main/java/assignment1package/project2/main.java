package assignment1package.project2;
import assignment1package.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class main {
    student[] student_array = {
            new student("John", 21, LocalDate.of(2000, 12, 31), 111111111, "BCT", new String[]{"CT100", "CT200"}),
            new student("James", 22, LocalDate.of(1999, 11, 30), 111111112, "BCT", new String[]{"CT100", "CT200"}),
            new student("Jack", 21, LocalDate.of(2000, 11, 29), 111111113, "BCT", new String[]{"CT100", "CT200"})
    };

    lecturer lecturer = new lecturer("Jones", 41, LocalDate.of(1980, 12, 31), 222222222, new String[]{"CT100", "CT200"});

    module[] module_array = {
            new module("Software Engineering", 100, student_array, LocalDate.of(2000, 12, 31), LocalDate.of(2000, 12, 31), lecturer.getModules_teaching(), lecturer),
            new module("Cryptography", 200, student_array, LocalDate.of(2000, 12, 31), LocalDate.of(2000, 12, 31), lecturer.getModules_teaching(), lecturer),
    };

    course_program course = new course_program("Computer Science & IT", module_array, student_array, new org.joda.time.DateTime());






}

