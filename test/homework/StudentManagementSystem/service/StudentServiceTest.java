package homework.StudentManagementSystem.service;

import homework.StudentManagementSystem.entity.Student;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentServiceTest extends TestCase {

    /**
     * 测试查找所有学生的方法。
     * 该方法不接受参数，也没有返回值。
     * 主要通过调用StudentService的findAllStudent方法来获取所有学生信息，并打印出来。
     */
    public void testFindAllStudent() {
        // 创建一个StudentService实例
        StudentService studentService = new StudentService();

        // 遍历并打印出所有学生信息
        for(Student student : studentService.findAllStudent()){
            System.out.println(student);
        }
    }

}