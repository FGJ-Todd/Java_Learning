package homework.StudentManagementSystem.dao;

import homework.StudentManagementSystem.entity.Student;

import java.util.Arrays;

public class StudentDao {
    private static Student[] students = new Student[5];

    /**
      静态代码块，用于在类加载时初始化学生数据。
      这段代码创建了一个学生对象，并将其添加到学生数组的首个位置。
      参数：无
      返回值：无
     */
    static {
        // 创建学生对象并初始化其属性
        Student student = new Student(
                1, "呆呆", 2, "1999-01-01"
        );
        // 将新创建的学生对象添加到学生数组的第一个位置
        students[0] = student;
    }


    /**
     * 查询所有学生信息
     * @return 学生数组
     */
    public Student [] findAllStudent(){

        return students;
    }

    /**
     * 添加学生信息
     * @param student 学生对象
     * @return 是否新增成功
     */
    public boolean addStudent(Student student){

        int index = -1;
        boolean flag = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null){
                index = i;
                flag = true;
                students[index] = student;
                break;
            }
        }
        return flag;
    }

    /**
     * 删除指定ID的学生。
     * 遍历学生数组，找到匹配ID的学生，将该学生标记为删除，即置为null，并返回true。
     * 如果未找到匹配ID的学生，则不进行删除操作，返回false。
     *
     * @param id 要删除的学生的ID。
     * @return boolean 如果成功删除学生，返回true；否则返回false。
     */
    public boolean deleteStudent(int id){
        boolean flag = false; // 标记是否成功删除学生
        for (int i = 0; i < students.length; i++) {
            try {
                if (students[i].getId() == id) { // 找到匹配ID的学生
                    flag = true;
                    students[i] = null; // 将学生对象置为null，表示删除
                    break;
                }
            } catch (NullPointerException ignored) {

            }

        }
        return flag; // 返回删除操作的结果
    }

    /**
     * 更新学生信息。
     *
     * @param student 需要更新的学生对象，包含学生的全部信息。
     * @return 返回一个布尔值，如果学生信息成功更新，则返回true；如果未找到该学生则返回false。
     */
    public boolean updateStudent(Student student){
        boolean flag = false; // 标记是否成功更新学生信息

        // 遍历学生数组，寻找对应ID的学生
        for (int i = 0; i < students.length; i++) {
            try {
                if (students[i].getId() == student.getId()){ // 找到ID匹配的学生
                    students[i] = student; // 更新学生信息
                    flag = true; // 设置标志为true
                    break;
                }
            } catch (NullPointerException ignored) {

            }

        }
        return flag; // 返回更新结果
    }

}
