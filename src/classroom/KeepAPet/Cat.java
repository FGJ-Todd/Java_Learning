package classroom.KeepAPet;

public class Cat extends Pet {
    private String color;

    public Cat() {}

    public Cat(String name, int health, int love, String color) {
        super(name, health, love);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void eat() {
        if (this.getHealth() >= 100) {
            System.out.println("猫咪 "+this.getName()+",吃饱了，不用投喂了");
        }else {
            this.setHealth(this.getHealth()+4);
            System.out.println("猫咪 "+this.getName()+",健康值+4");
        }
    }
}
