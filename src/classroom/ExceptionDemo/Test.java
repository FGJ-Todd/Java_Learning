package classroom.ExceptionDemo;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

public class Test {
    static Logger LOGGER = (Logger) LoggerFactory.getLogger("Test.class");
    public static void main(String[] args) {
        try {
            LOGGER.debug("main方法开始执行了~~~");
            LOGGER.info("我开始记录第二行日志，我要开始做除法~~~");
            int a = 10;
            int b = 2;
            LOGGER.trace("a=" + a);
            LOGGER.trace("b=" + b);

            System.out.println(a / b);
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("功能出现异常：" + e);
        }
    }
}
