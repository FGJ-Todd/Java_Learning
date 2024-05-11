package classroom.CarRenta;

public class Truck  extends MotoVchicle{
    public Truck(int tonnage) {
        this.tonnage = tonnage;
    }

    public Truck(String brand, String no, int tonnage) {
        super(brand, no);
        this.tonnage = tonnage;
    }

    private int tonnage;

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public int calRent() {
        return 50 * getTonnage();
    }
}
