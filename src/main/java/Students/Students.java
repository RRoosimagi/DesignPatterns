package Students;

import java.util.ArrayList;
import java.util.List;

public class Students {
    private static volatile Students instance = null;
    private final List<String> studentNames;

    private Students() {
        studentNames = new ArrayList< >();
    }

    public static Students getInstance() {
        if (instance == null) {
            synchronized (Students.class) {
                if (instance == null) {
                    instance = new Students();
                }
            }
        }
        return instance;
    }

    public boolean addStudent(String name) {

        if (!name.toLowerCase().startsWith("senior") && !name.toLowerCase().startsWith("junior")) {
            return false;
        }

        if (studentNames.contains(name)) {
            return false;
        }

        studentNames.add(name);
        return true;
    }

    public List<String> getSeniorStudents() {
        List<String> seniorStudents = new ArrayList< >();
        for (String name : studentNames) {
            if (name.toLowerCase().startsWith("senior")) {
                seniorStudents.add(name);
            }
        }
        return seniorStudents;
    }

    public List<String> getJuniorStudents() {
        List<String> juniorStudents = new ArrayList< >();
        for (String name : studentNames) {
            if (name.toLowerCase().startsWith("junior")) {
                juniorStudents.add(name);
            }
        }
        return juniorStudents;
    }
}
