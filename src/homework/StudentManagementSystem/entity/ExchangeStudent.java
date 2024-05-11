package homework.StudentManagementSystem.entity;

public class ExchangeStudent extends Student{
    @Override
    public String toString() {
        return "ExchangeStudent{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", birthday='" + super.getBirthday() + '\'' +
                "school='" + school + '\'' +
                '}';
    }

    private String school;

    public ExchangeStudent(){}

    public ExchangeStudent(int id, String name, int age, String birthday, String school){
        super(id, name, age, birthday);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

}
