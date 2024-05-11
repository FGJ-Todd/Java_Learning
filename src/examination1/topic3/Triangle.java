package examination1.topic3;

public class Triangle extends Shape{
    private int side;

    public Triangle(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public String toString() {
        return "三角形的面积为"+area()+"，周长为"+perimeter();
    }

    @Override
    public double area() {
        double s = (double) (side * 3) /2;
        return s*(s-side)*(s-side)*(s-side);
    }

    @Override
    public double perimeter() {
        return side*3;
    }
}
