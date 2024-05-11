package examination1.topic3;

public class Circle extends Shape{
    private int r;

    public Circle(int r, String color) {
        super(color);
        this.r = r;
    }

    @Override
    public String toString() {
        return "圆的面积为"+area()+"，周长为"+perimeter();
    }

    @Override
    public double area() {
        return Math.PI*r*r;
    }

    @Override
    public double perimeter() {
        return Math.PI*2*r;
    }
}
