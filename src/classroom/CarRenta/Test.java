package classroom.CarRenta;

public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Bus car = new Bus("123", "����", 12);
        System.out.println(customer.calRent1(car));
    }
}
