package FinalExercises.Student;

public class StudentText {
    public static void main(String[] args) {
        Student s1 = new Student("2019001", "张三", "男", 18, 90);
        Student s2 = new Student("2019002", "李四", "女", 19, 80);
        Student s3 = new Student("2019003", "王五", "男", 20, 70);
        Student s4 = new Student("2019004", "赵六", "女", 21, 60);
        Student s5 = new Student("2019005", "孙七", "男", 22, 50);
        int arr [] = {s1.getsJava(), s2.getsJava(),s3.getsJava(),s4.getsJava(),s5.getsJava()};
        int sum = 0;
        int max = 0;
        int min = arr[0];
        for (int num : arr) {
            sum += num;
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("平均分：" + sum / arr.length);
        System.out.println("最高分：" + max);
        System.out.println("最低分：" + min);
    }
}
