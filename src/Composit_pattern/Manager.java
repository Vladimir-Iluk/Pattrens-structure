package Composit_pattern;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
    private String name;
    private String position;
    private List<Employee> employees = new ArrayList<>();
    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
    }
    public void addWorker(Employee employee) {
        employees.add(employee);
    }
    @Override
    public void info() {
        System.out.println("Name: " + name + " Position: " + position);
        System.out.println("Managed Employees: ");
        for (Employee employee : employees) {
            employee.info();
        }
    }
}
