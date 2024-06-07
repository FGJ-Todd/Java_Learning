package FinalExercises.Circle;

public class Circle {
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getS(){
        return Math.PI*this.r*this.r;
    }
}
