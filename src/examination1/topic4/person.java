package examination1.topic4;

public class person {
    private String name;
    private String sex;
    private int age;
    private String nationality;

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

    public person(String name, String sex, int age, String nationality) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.nationality = nationality;
    }

    void eat(){
        System.out.println(name + "在吃东西");
    }

    void sleep(){
        System.out.println(name + "在睡觉");
    }

    void job(){
        System.out.println(name + "在工作");
    }
}
