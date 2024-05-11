package examination1.topic4;

public class TestPerson {
    public static void main(String[] args) {
        Student s = new Student("小李", "男", 18, "中国", "浙江工商", "1");
        s.eat();
        s.sleep();
        s.job();
        Worker w = new Worker("小王", "男", 20, "中国", "工地", 2);
        w.eat();
        w.sleep();
        w.job();
        Cadre c = new Cadre("小赵", "男", 22, "中国", "行政部");
        c.eat();
        c.sleep();
        c.job();
    }
}
