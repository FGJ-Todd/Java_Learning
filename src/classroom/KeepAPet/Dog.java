package classroom.KeepAPet;

/**
 * 狗狗类，宠物的子类。
 */
public class Dog extends Pet {
    private String strain;// 品种

    Dog() {
    }

    public Dog(String name, String strain) {
        super(name);
        this.strain = strain;
    }

    /**
     * 有参构造方法。
     *
     * @param name   昵称
     * @param strain 品种
     */
    public Dog(String name, int health, int love, String strain) {
        super(name, health, love); //此处不能使用this.name=name;
        this.strain = strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    public String getStrain() {
        return strain;
    }

    public void print() {
        super.print();
        System.out.println("我是一只" + this.getStrain() + "犬。");
    }

    public void catchingFlyDisc() {
        System.out.println("狗狗" + this.getName() + "正在接飞盘");
        this.setHealth(this.getHealth() - 10);
        this.setLove(this.getLove() + 5);
    }

    @Override
    public void eat() {
        if (this.getHealth() >= 100) {
            System.out.println("狗狗 " + this.getName() + ",吃饱了，不用投喂了");
        } else {
            this.setHealth(this.getHealth() + 3);
            System.out.println("狗狗 " + this.getName() + ",健康值+3");
        }
    }

    @Override
    public String toString() {
        return getName() + "{" +
                "品种='" + strain + '\'' +
                '}';
    }
}
