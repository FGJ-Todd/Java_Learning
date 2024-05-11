package examination1.topic3;

public class TestShape {
    public static void main(String[] args) {
        Circle c = new Circle(5, "red");
        System.out.println(c.toString());
        Rectangle r = new Rectangle("blue", 5, 6);
        System.out.println(r.toString());
        Triangle t = new Triangle("yellow", 5);
        System.out.println(t.toString());
    }
}
