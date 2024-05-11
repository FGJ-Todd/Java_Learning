package homework.StudentManagementSystem.controller;

/**
 * 学生信息管理系统的控制层类。
 * 通过调用学生服务层方法，实现对学生信息的增删改查等操作。
 */
public class StudentController extends BaseStudentController{
    public StudentController() {
        message = "-------------欢迎使用<学生>信息管理系统-------------\n"+
                "请输入您的指令：1、新增学生 2、删除学生 3、修改学生 4、查询学生列表 5、退出";
    }

}
