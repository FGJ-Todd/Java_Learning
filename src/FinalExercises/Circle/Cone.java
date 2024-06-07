package FinalExercises.Circle;

public class Cone extends Circle{
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cone(double r, double height) {
        super(r);
        this.height = height;
    }

    public double getBS(){
        return Math.PI*super.getR()*super.getR()+Math.PI*super.getR()*(Math.sqrt(Math.pow(height, 2)+Math.pow(super.getR(), 2)));
    }

    public double getV(){
        return Math.PI*super.getR()*super.getR()*height/3;
    }
}
