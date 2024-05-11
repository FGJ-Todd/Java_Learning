package examination1.topic3;

public class Rectangle extends Shape{
    private int c;
    private int k;
    public Rectangle(String color, int c, int k) {
        super(color);
        this.c = c;
        this.k = k;
    }

    @Override
    public String toString() {
        return "矩形的面积为"+area()+"，周长为"+perimeter();
    }

    @Override
    public double area() {
        return c*k;
    }

    @Override
    public double perimeter() {
        return (c+k)*2;
    }
}
