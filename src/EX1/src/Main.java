import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {new Employee("Ha", 1990, 200, "Ha Noi"),
                new Employee("kiet", 1990, 100, "Ha Noi"),
                new Employee("Tung", 1990, 150, "Ha Noi"),
                new Employee("Hien", 1990, 90, "Ha Noi")};
        Employee employee = null;
        for (int i = 0; i < employees.length; i++) {
            for (int j = 1; j < employees.length; j++) {
                if (employees[j - 1].getSalary() > employees[j].getSalary()) {
                    employee = employees[j - 1];
                    employees[j - 1] = employees[j];
                    employees[j] = employee;
                }
            }
        }
        System.out.println("Employee has min salary:");
        System.out.println(employees[0]);
        System.out.println();
        System.out.println("Employee has max salary:");
        System.out.println(employees[employees.length - 1]);
    }
}