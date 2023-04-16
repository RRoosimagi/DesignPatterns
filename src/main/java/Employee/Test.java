package Employee;

public class Test {
    public static void main(String[] args) {
        Employee john = new Employee("John", "Doe", 50000, 30);
        Employee jane = new Employee("Jane", "Doe", 60000, 55);
        Employee bob = new Employee("Bob", "Smith", 55000, 45);

        Company company = new Company();
        company.addEmployee(john);
        company.addEmployee(jane);
        company.addEmployee(bob);

        System.out.println("Average Salary: " + company.getAverageSalary());
        System.out.println("Oldest Employee: " + company.getOldestEmployee().getFirstName() + " " + company.getOldestEmployee().getLastName());
        System.out.println("Random Employee: " + company.getRandomEmployee().getFirstName());
    }
}
