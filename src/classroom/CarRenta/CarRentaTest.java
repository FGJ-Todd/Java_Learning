//package classroom.CarRenta;
//
//import java.util.Scanner;
//
//public class CarRentaTest {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("欢迎您来到汽车租赁公司！");
//        System.out.print("请输入要租赁的天数：");
//        int days = sc.nextInt();
//        System.out.print("请输入要租赁的汽车类型(1、轿车   2、客车)：");
//        int Type = sc.nextInt();
//        if (Type == 1) {
//            System.out.print("请输入要租赁的汽车品牌(1、宝马   2、别克)：");
//            int brand = sc.nextInt();
//            if (brand == 2) {
//                System.out.print("请输入轿车的型号(1、商务舱GL8   2、林荫大道)：");
//                String type = sc.next();
//                System.out.print("分配给您的汽车车牌号是：");
//                String no = sc.next();
//                Car c = new Car(no,type,brand+"");
//                System.out.println("顾客您好！，您需要支付的租赁费用是"+c.calRent(days));
//            }else{
//                System.out.print("请输入轿车的型号(1、宝马55i)：");
//                String type = sc.next();
//                System.out.print("分配给您的汽车车牌号是：");
//                String no = sc.next();
//                Car c = new Car(no,type,"1");
//                System.out.println("顾客您好！，您需要支付的租赁费用是"+c.calRent(days));
//            }
//        }else {
//            System.out.print("请输入要租赁的汽车品牌(1、金杯   2、金龙)：");
//            int brand = sc.nextInt();
//            if (brand == 1) {
//                System.out.print("请输入客车的座位号数量");
//                int type = sc.nextInt();
//                System.out.print("分配给您的汽车车牌号是：");
//                String no = sc.next();
//                Bus b = new Bus(brand+"",type);
//                System.out.println("顾客您好！，您需要支付的租赁费用是"+b.calRent(days));
//            }else{
//                System.out.print("请输入客车的座位数量");
//                int type = sc.nextInt();
//                System.out.print("分配给您的汽车车牌号是：");
//                String no = sc.next();
//                Bus b = new Bus(brand+"",type);
//                System.out.println("顾客您好！，您需要支付的租赁费用是"+b.calRent(days));
//            }
//        }
//
//
//    }
//}
