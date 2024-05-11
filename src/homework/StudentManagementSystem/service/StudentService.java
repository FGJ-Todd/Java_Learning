package homework.StudentManagementSystem.service;

import homework.StudentManagementSystem.dao.StudentDao;
import homework.StudentManagementSystem.entity.Student;

public class StudentService {
    public StudentService() {}

    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    private StudentDao studentDao = new StudentDao();

    /**
     * 查询所有学生信息，返回一个Student数组。
     * 本方法通过调用studentDao的findAllStudent方法获取所有学生信息的数组。之后遍历该数组，
     * 如果数组中存在非空的学生对象，则直接返回该数组；如果数组中所有学生对象都为空，则返回null。
     * @return 所有学生信息的数组，如果无学生信息则返回null。
     */
    public Student [] findAllStudent(){
        // 从studentDao获取所有学生信息的数组
        Student [] AllStudents = studentDao.findAllStudent();

        // 标记是否有非空学生对象
        boolean flag = false;
        for (Student student : AllStudents) {
            // 如果发现非空学生对象，设置标志位为true并跳出循环
            if (student != null) {
                flag = true;
                break;
            }
        }

        // 根据标志位决定是返回学生数组还是null
        if (flag){
            return AllStudents;
        }else {
            return null;
        }
    }

    /**
     * 添加一个学生到数据库。
     * @param student 学生对象，包含学生的所有信息。
     * @return boolean 返回值表示添加操作是否成功。true表示成功添加，false表示添加失败。
     */
    public boolean addStudent(Student student){
        // 通过studentDao对象调用addStudent方法，尝试在数据库中添加一个学生记录
        return studentDao.addStudent(student);
    }

    /**
     * 删除指定ID的学生信息。
     * @param id 学生的唯一标识符。
     * @return boolean 如果删除成功则返回true，否则返回false。
     */
    public boolean deleteStudent(int id){
        // 通过学生DAO层删除指定ID的学生
        return studentDao.deleteStudent(id);
    }

    /**
     * 更新学生信息。
     * @param student 包含更新后学生信息的对象。
     * @return boolean 如果学生信息成功更新，则返回true；否则返回false。
     */
    public boolean updateStudent(Student student){
        // 通过studentDao更新学生信息
        return studentDao.updateStudent(student);
    }

}
