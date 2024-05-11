package classroom.ExceptionDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

    public static void divide() throws InputMismatchException, ArithmeticException{
        Scanner in = new Scanner(System.in);
        System.out.print("输入被除数：");
        int a = in.nextInt();
        System.out.print("输入除数：");
        int b = in.nextInt();
        System.out.println(a/b);
    }

    public static void main(String[] args) {
        try{
            divide();
        }catch(InputMismatchException e) {
            System.out.println("输入类型错误,请重新输入");
        }catch(ArithmeticException e){
            System.out.println("除数不能为0,请重新输入");
        }catch (Exception e){
            System.out.println("异常");
        }finally{
            System.out.println("感谢使用");
        }
    }
}
