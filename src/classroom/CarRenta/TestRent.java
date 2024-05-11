package classroom.CarRenta;

import java.util.Scanner;

public class TestRent {
    public static void main(String[] args) {
        int days = 1;
        int totalRent;
        Scanner in = new Scanner(System.in);
        System.out.print("请输入客户名称：");
        String userName = in.next();
        MotoVchicle[] motos = new MotoVchicle[5];
        motos[0] = new Car("浙123", "550i", "宝马");
        motos[1] = new Car("闽123", "550i", "宝马");
        motos[2] = new Car("沪123", "林荫大道", "别克");
        motos[3] = new Bus("粤123", "金龙", 34);
        motos[4] = new Truck("台123", "解放", 10);
        Customer c = new Customer();
        totalRent = c.calcTotalRent(motos, days);
        System.out.println("客户名："+userName+"，租赁天数："+days+",租赁总费用："+totalRent);
    }

}
