package classroom.animal;

public class Fish extends Animal {
    private int weight;

    public Fish(int age, int height) {
        super(age);
        this.weight = height;
    }

    public int getHeight() {
        return weight;
    }

    public void setHeight(int height) {
        this.weight = height;
    }

    public void info() {
        System.out.println("我是一只"+weight+"的鸟！");
        System.out.println("今年"+this.getAge()+"岁了！");
    }
}
