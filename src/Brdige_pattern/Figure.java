package Brdige_pattern;

public abstract class Figure {
    protected Color color;

    public Figure(Color color){
        this.color = color;
    }
    public abstract void info();
}
