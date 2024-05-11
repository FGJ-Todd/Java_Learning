package examination1.topic2;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("张三", 18, "男", "软件");
        student1.intro();
        Student student2 = new Student("小李", 19);
        student2.intro();
    }
}
