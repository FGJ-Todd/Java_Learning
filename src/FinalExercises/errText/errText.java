package FinalExercises.errText;

import java.util.Scanner;

public class errText {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.print("请输入整数：");
        int num1 = in.nextInt();
        System.out.print("请输入整数：");
        int num2 = in.nextInt();
        if (num1*num2>10000){
            throw new Exception("输入的数字相乘大于10000");
        }else{
            System.out.println(num1*num2);
        }
    }
}
