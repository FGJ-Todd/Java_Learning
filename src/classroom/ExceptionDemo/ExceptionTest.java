package classroom.ExceptionDemo;

public class ExceptionTest {
    public static void main(String[] args) {
        try{
            int a = 1/0;
        }catch (Exception e){
            System.exit(1);
        }finally {
            System.out.println("finally");
        }
    }
}
