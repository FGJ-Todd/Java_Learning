package FinalExercises.Circle;

public class Text {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2, 5);
        System.out.println(cylinder.getBS());
        System.out.println(cylinder.getV());

        Cone cone = new Cone(4, 5);
        System.out.println(cone.getBS());
        System.out.println(cone.getV());
    }
}
