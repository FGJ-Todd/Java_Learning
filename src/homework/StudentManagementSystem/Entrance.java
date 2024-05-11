package homework.StudentManagementSystem;

import homework.StudentManagementSystem.controller.ExchangeStudentController;
import homework.StudentManagementSystem.controller.StudentController;

import java.util.Scanner;

public class Entrance {
    /**
     * 程序的主入口函数。
     * 使用 Scanner 从标准输入读取用户指令，实现学生信息管理和教师信息管理的功能选择。
     * 用户可以选择进入学生管理模块、教师管理模块，或选择退出程序。
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true; // 标志变量，用于控制循环的执行
        while(flag){
            // 打印欢迎信息及功能选择菜单
            System.out.println("-------------欢迎使用学生信息管理系统-------------");
            System.out.println("教师管理模块暂时无法使用");
            System.out.println("请输入您的指令：1、学生管理模块 2、教师管理模块 3、交换生管理模块 4、退出");

            // 读取用户输入的指令
            String module = sc.next();

            // 根据用户输入的指令执行相应的操作
            switch (module){
                case "1":
                    System.out.println("进入学生管理系统");
                    StudentController studentController = new StudentController();
                    studentController.start();
                    break;
                case "2":
                    System.out.println("进入教师管理模块");
                    break;
                case "3":
                    System.out.println("进入交换生管理模块");
                    ExchangeStudentController exchangeStudentController = new ExchangeStudentController();
                    exchangeStudentController.start();
                    break;
                case "4":
                    System.out.println("退出");
                    flag = false; // 设置标志变量为 false，退出循环
                    break;
                default:
                    System.out.println("输入指令不存在请重新输入");
                    break;
            }
        }

    }
}
