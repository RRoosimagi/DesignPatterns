package Students;

import java.util.ArrayList;
import java.util.List;

public class Students {
    private static Students instance = null;
    private final List<String> seniorStudents;
    private final List<String> juniorStudents;

    private Students() {
        seniorStudents = new ArrayList<>();
        juniorStudents = new ArrayList<>();
    }

    public static synchronized Students getInstance() {
        if (instance == null) {
            instance = new Students();
        }
        return instance;
    }

    public boolean addStudent(String name) {
        if (name.startsWith("Junior") && !juniorStudents.contains(name)) {

            juniorStudents.add(name);
            return true;
        } else if (name.startsWith("Senior") && !seniorStudents.contains(name)) {

            seniorStudents.add(name);
            return true;
        } else {

            return false;
        }
    }

    public List<String> getSeniorStudents() {
        return new ArrayList<>(seniorStudents);
    }

    public List<String> getJuniorStudents() {
        return new ArrayList<>(juniorStudents);
    }
}
