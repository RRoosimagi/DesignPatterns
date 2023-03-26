package Students;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Students students = Students.getInstance();
        System.out.println(students.addStudent("Junior Dwayne Johnson"));
        System.out.println(students.addStudent("Senior Jane Doe"));
        System.out.println(students.addStudent("Junior John Doe"));

        List<String> juniorStudents = students.getJuniorStudents();
        List<String> seniorStudents = students.getSeniorStudents();

        System.out.println("Junior students: " + juniorStudents);
        System.out.println("Senior students: " + seniorStudents);

    }
}
