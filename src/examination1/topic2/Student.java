package examination1.topic2;

public class Student {
    private String name;
    private int age;
    private String sex;
    private String subject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age, String sex, String subject) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.subject = subject;
    }

    public Student(String name,int age){
        this.name = name;
        this.age = age;
        this.sex = "男";
        this.subject = "Software";
    }

    void intro(){
        System.out.println("姓名："+name+" 年龄："+age+" 性别："+sex+" 专业："+subject);
    }
}
