package examination1.topic4;

public class Student extends person{
    private String school;
    private String ID;

    public Student(String name, String sex, int age, String nationality, String school, String ID) {
        super(name, sex, age, nationality);
        this.school = school;
        this.ID = ID;
    }

    void job(){
        System.out.println(super.getName() + "在学习");
    }
}
