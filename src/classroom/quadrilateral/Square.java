package classroom.quadrilateral;

public class Square extends Quadrilateral {

    @Override
    public void protract() {
        System.out.println("   正方形");
        System.out.println("------------");
        System.out.println("|          |");
        System.out.println("|          |");
        System.out.println("|          |");
        System.out.println("------------");
        System.out.println();
    }
}
