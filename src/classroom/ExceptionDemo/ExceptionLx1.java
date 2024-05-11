package classroom.ExceptionDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionLx1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true){
            try{
                System.out.println("请输入1-3之间任意整数选择课程");
                switch (in.nextInt()) {
                    case 1:
                        System.out.println("C#编程");
                        break;
                    case 2:
                        System.out.println("Java编程");
                        break;
                    case 3:
                        System.out.println("SQL基础");
                        break;
                    default:
                        throw new Exception("只能输入1-3之间的整数");
                }
                System.out.println("程序运行结束");
                break;
            }catch (InputMismatchException e){
                System.out.println("请输入1-3之间的（整数）");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally{
                System.out.println("欢迎提出建议！\n");
            }
        }
    }
}
