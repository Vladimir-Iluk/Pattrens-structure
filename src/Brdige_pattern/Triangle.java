package Brdige_pattern;

public class Triangle extends Figure {
    public Triangle(Color color) {
        super(color);
    }
    @Override
    public void info() {
        System.out.println("Created figure Triangle with color ");
        color.fillColor();
    }
}
