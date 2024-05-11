package classroom.poultry;

public class Chicken extends Poultry {
    public Chicken(String name, String variety, String foot, String skill) {
        super(name, variety, foot, skill);
    }

    public void show() {
        System.out.println("我叫"+getName()+"，是一只"+getVariety()+"鸡！");
        System.out.println("我喜欢吃"+getFoot()+"！");
        System.out.println("我会"+getSkill()+"！");
    }
}
