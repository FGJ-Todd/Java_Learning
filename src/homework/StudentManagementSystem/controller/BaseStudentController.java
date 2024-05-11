package homework.StudentManagementSystem.controller;

import homework.StudentManagementSystem.dao.StudentDao;
import homework.StudentManagementSystem.entity.Student;
import homework.StudentManagementSystem.service.StudentService;

import java.util.Scanner;

public class BaseStudentController {
    private StudentService studentService = new StudentService();
    private Scanner in = new Scanner(System.in);

    static String message = "-------------欢迎使用学生信息管理系统-------------\n"+
            "请输入您的指令：1、新增学生 2、删除学生 3、修改学生 4、查询学生列表 5、退出";

    /**
     * 系统主函数，负责循环接收用户指令并执行相应的操作。
     */
    public void start(){
        boolean running = true;
        while(running){
            // 欢迎信息及操作菜单
            System.out.println(message);
            String function = in.next();

            // 根据用户输入的指令执行对应的方法
            switch (function){
                case "1":
                    addStudent();
                    break;
                case "2":
                    deleteStudent();
                    break;
                case "3":
                    updateStudent();
                    break;
                case "4":
                    findAllStudent();
                    break;
                case "5":
                    System.out.println("退出");
                    running = false;
                    break;
                default:
                    System.out.println("输入指令不存在请重新输入");
                    break;
            }
        }
    }

    /**
     * 新增学生信息。
     */
    public void addStudent(){
        System.out.println("新增学生");
        Student student = createStudent();
        // 调用服务层方法添加学生信息，并给出成功或失败的提示
        if(studentService.addStudent(student)){
            System.out.println("新增学生成功");
        }else{
            System.out.println("新增学生失败");
        }
    }

    /**
     * 删除指定ID的学生信息。
     */
    public void deleteStudent(){
        System.out.println("删除学生");
        System.out.print("请输入学生的id：");
        int id = in.nextInt();
        // 调用服务层方法删除学生信息，并给出成功或失败的提示
        if(studentService.deleteStudent(id)){
            System.out.println("删除学生成功");
        }else{
            System.out.println("删除学生失败(该id学生不存在)");
        }
    }

    /**
     * 修改学生信息。
     * 首先创建一个新的学生对象，然后调用服务层方法尝试更新学生信息。
     */
    public void updateStudent(){
        System.out.println("修改学生");
        Student student = PresenceStudent();
        // 更新学生信息，并给出成功或失败的提示
        if(studentService.updateStudent(student)){
            System.out.println("更新学生成功");
        }else{
            System.out.println("更新学生失败");
        }
    }

    /**
     * 查询并显示所有学生信息。
     */
    public void findAllStudent(){
        System.out.println("查询学生列表");
        try {
            for (Student student : studentService.findAllStudent()){
                System.out.println(student);
            }
        }catch (NullPointerException e){
            System.out.println("学生列表为空");
        }

    }

    /**
     * 交互式创建一个学生对象。
     * 从用户输入中获取学生信息，确保学生ID的唯一性。
     * @return 创建好的学生对象
     */
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
        return new Student(id,name,age,birthday);
    }

    /**
     * 此方法用于根据用户输入的学生ID查找学生是否存在，
     * 如果存在，则要求用户输入学生的姓名、年龄和生日，并创建一个新的学生对象。
     * 此方法针对修改学生信息功能专门设计。
     * @return 返回一个新创建的学生对象，该对象包含输入的学生信息。
     */
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

        // 根据用户输入创建并返回学生对象
        return new Student(id,name,age,birthday);
    }
}
