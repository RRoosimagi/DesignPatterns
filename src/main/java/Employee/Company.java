package Employee;

import java.util.ArrayList;
import java.util.Random;

public class Company {
    private final ArrayList<Employee> employees;

    public Company() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public double getAverageSalary() {
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return (double) totalSalary / employees.size();
    }

    public Employee getOldestEmployee() {
        Employee oldestEmployee = employees.get(0);
        for (Employee employee : employees) {
            if (employee.getAge() > oldestEmployee.getAge()) {
                oldestEmployee = employee;
            }
        }
        return oldestEmployee;
    }

    public Employee getRandomEmployee() {
        Random random = new Random();
        int index = random.nextInt(employees.size());
        return employees.get(index);
    }
}