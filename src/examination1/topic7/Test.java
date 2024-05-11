package examination1.topic7;

public class Test {
    public static void main(String[] args) {
        Course course1 = new Course("语文", 2, 90);
        Course course2 = new Course("数学", 3, 80);
        Course course3 = new Course("英语", 4, 95);
        Student student1 = new Student("小范", "1", new Course[]{course1, course2, course3}, 0, 0);
        student1.courseExit(course1);
        student1.courseExit(course2);
        student1.courseExit(course3);
        student1.courseSelection(course1);
        student1.courseSelection(course2);
        student1.courseSelection(course3);
        student1.coursePrint();
        student1.avgGradesPrint();
        student1.sumFractionPrint();
        student1.examination(course1);
        student1.examination(course2);
        student1.examination(course3);
    }
}
