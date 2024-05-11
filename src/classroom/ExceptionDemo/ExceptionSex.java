package classroom.ExceptionDemo;

import java.util.Scanner;

public class ExceptionSex {
    public static void sex()throws Exception{
        Scanner in = new Scanner(System.in);
        String sex = in.next();
        if (sex.equals("男") || sex.equals("女")){
            System.out.println("性别输入成功！");
        }else {
            throw new Exception("性别错误异常");
        }
    }

    public static void main(String[] args) {
        while(true){
            try {
                sex();
                break;
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("请重新输入！");
            }finally{
                System.out.println("欢迎建议");
            }
        }
    }
}
