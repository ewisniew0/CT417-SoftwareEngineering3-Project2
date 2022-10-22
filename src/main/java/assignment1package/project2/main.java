package assignment1package.project2;
import assignment1package.*;
import org.joda.time.DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        course_program course = new course_program("Computer Science & IT", new DateTime(2020, 8, 1, 8, 0), new DateTime(2020, 8, 1, 8, 0));
        course_program course2 = new course_program("Mathematics", new DateTime(2020, 8, 1, 8, 0), new DateTime(2020, 8, 1, 8, 0));

        module[] module_array = {
                new module("Software Engineering", 101, new DateTime(2020, 8, 1, 8, 0), new DateTime(2020, 8, 1, 8, 0)),
                new module("Cryptography", 202, new DateTime(2020, 8, 1, 8, 0), new DateTime(2020, 8, 1, 8, 0))
        };


        student[] student_array = {
                new student("John", 21, LocalDate.of(2000, 12, 31), 111111111, course, module_array),
                new student("James", 22, LocalDate.of(1999, 11, 30), 111111112, course, module_array),
                new student("Jack", 21, LocalDate.of(2000, 11, 29), 111111113, course, module_array)
        };

        lecturer lecturer = new lecturer("Jones", 41, LocalDate.of(1980, 12, 31), 222222222, module_array);

        course.setModule_list(module_array);
        course2.setModule_list(module_array);

        course.setEnrolled_students(student_array);
        course2.setEnrolled_students(student_array);

        for (int i = 0; i < module_array.length; i++) {
           module_array[i].setEnrolled_students(student_array);
           module_array[i].setLecturer_responsible(lecturer);
        }

        List<course_program> course_list = new ArrayList<course_program>();
        course_list.add(course);
        course_list.add(course2);


        for (int i = 0; i < course_list.size(); i++) {
            System.out.println("\nCourses List:\n");
            System.out.println("\t"+course_list.get(i).getCourse_name() + "\n");

            System.out.println("\t\tModule List:\n");
            for (int j = 0; j < module_array.length; j++) {
                System.out.println("\t\t"+module_array[j].getModule_name());
            }

            System.out.println("\n\t\t\tStudent List:\n");
            for (int j = 0; j < student_array.length; j++) {
                System.out.println("\t\t\t"+student_array[j].getName());
            }

        }
    }
}



