package homework.StudentManagementSystem.entity;

/**
 * Student类用于创建和管理学生信息。
 */
public class Student {

    // 学生的唯一标识符
    private int id;
    // 学生的姓名
    private String name;
    // 学生的年龄
    private int age;
    // 学生的生日
    private String birthday;

    /**
     * 无参构造函数，创建一个空的学生对象。
     */
    public Student(){}

    /**
     * 带参数的构造函数，用于初始化学生对象。
     *
     * @param id 学生的唯一标识符。
     * @param name 学生的姓名。
     * @param age 学生的年龄。
     * @param birthday 学生的生日。
     */
    public Student(int id, String name, int age, String birthday) {
        this.age = age;
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }

    /**
     * 获取学生的ID。
     *
     * @return 学生的唯一标识符。
     */
    public int getId() {
        return id;
    }

    /**
     * 设置学生的ID。
     *
     * @param id 要设置的学生的唯一标识符。
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取学生的姓名。
     *
     * @return 学生的姓名。
     */
    public String getName() {
        return name;
    }

    /**
     * 设置学生的姓名。
     *
     * @param name 要设置的学生的姓名。
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取学生的年龄。
     *
     * @return 学生的年龄。
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置学生的年龄。
     *
     * @param age 要设置的学生的年龄。
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取学生的生日。
     *
     * @return 学生的生日。
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 设置学生的生日。
     *
     * @param birthday 要设置的学生的生日。
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
