package Students;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Students students = Students.getInstance();
        students.addStudent("Junior Dwayne Johnson");
        students.addStudent("Senior Jane Doe");
        students.addStudent("Junior John Doe");

        List<String> juniorStudents = students.getJuniorStudents();
        List<String> seniorStudents = students.getSeniorStudents();

        System.out.println("Junior students: " + juniorStudents);
        System.out.println("Senior students: " + seniorStudents);

    }
}
