package examination1.topic3;

public abstract class Shape {
    private String color;

    public Shape(String color) {
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract String toString();

    public abstract double area();
    public abstract double perimeter();
}
