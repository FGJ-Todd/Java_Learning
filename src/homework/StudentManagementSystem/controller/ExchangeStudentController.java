package homework.StudentManagementSystem.controller;

import homework.StudentManagementSystem.dao.StudentDao;
import homework.StudentManagementSystem.entity.ExchangeStudent;
import homework.StudentManagementSystem.entity.Student;

import java.util.Scanner;

public class ExchangeStudentController extends BaseStudentController{
    private Scanner in = new Scanner(System.in);

    public ExchangeStudentController(){
        message = "-------------欢迎使用<交换生>信息管理系统-------------\n"+
                "请输入您的指令：1、新增学生 2、删除学生 3、修改学生 4、查询学生列表 5、退出";
    }

    public Student createStudent(){
        boolean flag;
        int id;
        do {
            flag = false; // 标记ID是否已存在
            System.out.print("请输入学生的id：");
            id = in.nextInt();
            // 检查输入的ID是否已存在于系统中的学生信息
            Student [] AllStudents = new StudentDao().findAllStudent();
            for(Student student : AllStudents){
                try
                {
                    if (student.getId() == id){
                        System.out.println("该id已存在");
                        flag = true;
                    }
                }catch (NullPointerException ignored) {}
            }
        }while (flag); // 如果ID已存在，则要求重新输入

        // 收集并返回学生信息
        System.out.print("请输入学生的姓名：");
        String name = in.next();
        System.out.print("请输入学生的年龄：");
        int age = in.nextInt();
        System.out.print("请输入学生的生日：");
        String birthday = in.next();
        System.out.print("请输入学生的学校：");
        String school = in.next();
        return new ExchangeStudent(id,name,age,birthday,school);
    }

    public Student PresenceStudent(){
        int id;
        boolean flag = false;
        do {
            // 请求用户输入学生ID
            System.out.print("请输入学生的id：");
            id = in.nextInt();
            Student [] AllStudents = new StudentDao().findAllStudent();
            for(Student student : AllStudents){
                try{
                    // 检查输入的ID是否存在于学生列表中
                    if (student.getId() == id){
                        flag = false; // ID存在，停止循环
                    }else {
                        flag = true; // ID不存在，继续循环
                    }
                }catch (NullPointerException ignored){}
            }
            // 如果ID不存在，提示用户并要求重新输入ID
            if (flag) {
                System.out.println("该id不存在");
            }
        }while (flag);

        // 收集用户输入的学生姓名、年龄和生日
        System.out.print("请输入学生的姓名：");
        String name = in.next();
        System.out.print("请输入学生的年龄：");
        int age = in.nextInt();
        System.out.print("请输入学生的生日：");
        String birthday = in.next();
        System.out.print("请输入学生的学校：");
        String school = in.next();
        // 根据用户输入创建并返回学生对象
        return new ExchangeStudent(id,name,age,birthday,school);
    }

}
