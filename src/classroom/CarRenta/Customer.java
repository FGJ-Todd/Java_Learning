package classroom.CarRenta;

public class Customer {

    public int calRent1(MotoVchicle motos){
        if (motos instanceof Car){
            Car C = (Car) motos;
            return C.calRent();
        }else if(motos instanceof Bus) {
            Bus B = (Bus) motos;
            return B.calRent();
        }else {
            Truck t = (Truck) motos;
            return t.calRent();
        }
    }
    public int calcTotalRent(MotoVchicle[] motos, int days){
        int sum = 0;
        for (MotoVchicle moto : motos) {
            sum += calRent1(moto) * days;
        }
        return sum;
    }
}
