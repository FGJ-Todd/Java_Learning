package classroom.quadrilateral;

public class Test {
    public static void main(String[] args) {
        Quadrilateral [] quadrilaterals = new Quadrilateral[3];
        quadrilaterals[0] = new Square();
        quadrilaterals[1] = new Parallelogram();
        quadrilaterals[2] = new Rectangle();
        for (Quadrilateral quadrilateral : quadrilaterals) {
            quadrilateral.protract();
        }
    }
}
