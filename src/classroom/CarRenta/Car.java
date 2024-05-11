package classroom.CarRenta;

public class Car extends MotoVchicle{
    public void setType() {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    private String type;

    Car(String no, String type, String brand) {
        super();
        this.setNo(no);
        this.setBrand(brand);
        this.type = type;
    }

    public int Bmw(){
        return 500;
    }

    public int Buick(){
        if (type.equals("商务舱GL8")){
            return 600;
        }else if(type.equals("林荫大道")){
            return 300;
        }
        return 0;
    }

    public int calRent() {
        int result=0;
        if (getBrand().equals("宝马")){
            result = Bmw();
        }else if(getBrand().equals("别克")){
            result = Buick();
        }
        return result;
    }
}
