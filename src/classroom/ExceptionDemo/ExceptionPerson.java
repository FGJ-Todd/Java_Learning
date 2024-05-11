package classroom.ExceptionDemo;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class ExceptionPerson {
    static Logger LOGGER = (Logger) LoggerFactory.getLogger("Test.class");
    public static void setAge(int age)throws Exception{
        if(age<=0||age>100) {
            throw new Exception("年龄必须在1-100之间！");
        }
        else {
            System.out.println("年龄合法");
        }
    }

    public static void main(String[] args) {
        while(true){
            try {
                LOGGER.info("开始运行");
                Scanner in = new Scanner(System.in);
                System.out.print("请输入年龄：");
                int a = in.nextInt();
                LOGGER.trace("输入年龄：{}", a);
                setAge(a);
                int age = a;
                LOGGER.trace("年龄：{}", age);
                break;
            }catch (Exception e ){
                System.out.println(e.getMessage()+"\n请重新输入\n");
                LOGGER.error(e.getMessage());
            }
        }
    }
}
