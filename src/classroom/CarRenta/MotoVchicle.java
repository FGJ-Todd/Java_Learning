package classroom.CarRenta;

public abstract class MotoVchicle {
    private String no;
    private String brand;

    MotoVchicle(){}

    public MotoVchicle(String brand, String no) {
        this.brand = brand;
        this.no = no;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public abstract int calRent();

}
