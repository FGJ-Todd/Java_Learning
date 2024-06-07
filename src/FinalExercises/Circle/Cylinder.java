package FinalExercises.Circle;

public class Cylinder extends Circle {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(double r, double height) {
        super(r);
        this.height = height;
    }

    public double getBS(){
        return super.getR()*2*Math.PI*this.height+2*super.getR()*super.getR()*Math.PI;
    }

    public double getV(){
        return super.getR()*super.getR()*Math.PI*this.height;
    }
}
