package classroom.animal;

public class Bird extends Animal {
    private String color;

    public Bird(int age, String color) {
        super(age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void info() {
        System.out.println("我是一只"+color+"的鸟！");
        System.out.println("今年"+this.getAge()+"岁了！");
    }
}
