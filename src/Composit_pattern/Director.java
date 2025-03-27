package Composit_pattern;

import java.util.ArrayList;
import java.util.List;

public class Director implements Employee {
    private String name;
    private String position;
    private List<Employee> managers = new ArrayList<>();
    public Director(String name, String position) {
        this.name = name;
        this.position = position;
    }
    public void addManager(Employee employee) {
        managers.add(employee);
    }
    @Override
    public void info() {
        System.out.println("Name: " + name + " Position: " + position);
        System.out.println("Managed managers: ");
        for (Employee employee : managers) {
            employee.info();
        }
    }
}
