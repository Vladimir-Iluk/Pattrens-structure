package Composit_pattern;

public class Worker implements Employee {
    private String name;
    private String position;
    public Worker(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void info() {
        System.out.println("Name: " + name + " Position: " + position);
    }
}
