package classroom.ExceptionDemo;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

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
        Logger logger = (Logger) LoggerFactory.getLogger("ExceptionDemo.class");
        while(true){
            try{
                logger.info("欢迎使用");
                divide();
                break;
            }catch(InputMismatchException e) {
                logger.error(e.getMessage());
                System.out.println("输入类型错误,请重新输入");
            }catch(ArithmeticException e){
                logger.warn(e.getMessage());
                System.out.println("除数不能为0,请重新输入");
                logger.error("Main error=", e);
            }catch (Exception e){
                logger.error(e.getMessage());
                System.out.println("异常");
            }finally{
                System.out.println("感谢使用");
                logger.info("运行结束");
            }
        }

    }
}
