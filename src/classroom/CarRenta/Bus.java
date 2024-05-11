package classroom.CarRenta;

public class Bus extends MotoVchicle{
    private int seatCount;

    Bus(){}

    public Bus(String no,String brand,int seatCount) {
        super();
        this.setNo(no);
        this.setBrand(brand);
        this.seatCount = seatCount;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public int seat(){
        if (seatCount>16){
            return 1500;
        }else {
            return 800;
        }
    }

    public int calRent() {
        int result = 0;
        if (super.getBrand().equals("金杯")){
            result = seat();
        }else if (super.getBrand().equals("金龙")){
            result = seat();
        }
        return result;
    }
}
