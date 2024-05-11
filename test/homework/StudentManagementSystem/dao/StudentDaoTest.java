package homework.StudentManagementSystem.dao;

import homework.StudentManagementSystem.entity.Student;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentDaoTest extends TestCase {

    /**
     * 测试更新学生信息的方法。
     * 该方法首先创建一个学生对象，然后尝试更新该学生的信息。
     * 如果更新成功，则打印"修改成功"，否则打印"修改失败(未找到id为：x)的学生"，其中x是尝试更新的学生的id。
     * 最后，该方法会打印出所有学生的详细信息。
     */
    public void testUpdateStudent(){
        // 创建StudentDao实例
        StudentDao studentDao = new StudentDao();
        // 创建一个学生对象，初始化学生信息
        Student student = new Student(1,"张三",20,"1999-01-01");
        // 尝试更新学生信息，返回更新结果
        boolean flag = studentDao.updateStudent(student);
        // 根据更新结果打印相应信息
        if (flag){
            System.out.println("修改成功\n");
        }else {
            System.out.println("修改失败(未找到id为："+student.getId()+")的学生\n");
        }
        // 获取所有学生的信息
        Student [] AllStudents = new StudentDao().findAllStudent();

        // 遍历并打印所有学生的信息
        for (Student allStudent : AllStudents) {
            System.out.println(allStudent);
        }
    }


    /**
     * 测试删除学生的方法
     * 该方法会尝试删除指定ID的学生，并给出操作结果（成功或失败）。
     * 删除后，会打印出所有剩余学生的详细信息。
     * 参数:
     * 无
     * 返回值:
     * 无
     */
    public void testDeleteStudent() {
        // 创建StudentDao实例
        StudentDao studentDao = new StudentDao();
        int id = 2; // 指定要删除的学生ID
        boolean flag = studentDao.deleteStudent(id); // 尝试删除指定ID的学生，返回操作是否成功

        // 打印删除操作的结果
        if (flag){
            System.out.println("删除成功\n");
        }else {
            System.out.println("删除失败(未找到id为："+id+")的学生\n");
        }

        // 获取所有剩余学生的信息
        Student [] AllStudents = new StudentDao().findAllStudent();

        // 遍历并打印所有学生信息
        for (Student allStudent : AllStudents) {
            System.out.println(allStudent);
        }
    }


    /**
     * 测试添加学生到数据库的方法。
     * 该方法首先创建一个学生对象，然后通过StudentDao来尝试添加这个学生。
     * 如果添加成功，则打印"添加成功"；如果添加失败（例如，学生信息列表已满），则打印"添加失败, 学生信息列表已满"。
     * 最后，打印出所有学生的信息列表。
     */
    public void testAddStudent() {
        // 创建一个学生对象并初始化
        Student student = new Student(1,"张三",18,"1999-01-01");
        // 实例化StudentDao对象
        StudentDao studentDao = new StudentDao();
        // 尝试将学生添加到数据库，并获取操作结果
        boolean flag = studentDao.addStudent(student);
        // 根据操作结果打印相应信息
        if (flag){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败, 学生信息列表已满");
        }
        // 打印学生信息列表分隔线
        System.out.println("-------------学生信息列表-------------");
        // 获取所有学生信息
        Student [] AllStudents = new StudentDao().findAllStudent();
        // 遍历并打印所有学生信息
        for (Student allStudent : AllStudents) {
            System.out.println(allStudent);
        }
    }

    /**
     * 测试查找并打印所有学生信息的方法。
     * 该方法直接调用StudentDao的findAllStudent方法来获取所有学生信息数组，
     * 然后遍历这个数组，将每个学生的信息打印出来。
     */
    public void testFindAllStudent() {
        // 获取所有学生信息
        Student [] AllStudents = new StudentDao().findAllStudent();
        // 遍历并打印所有学生信息
        for (Student allStudent : AllStudents) {
            System.out.println(allStudent);
        }
    }

}