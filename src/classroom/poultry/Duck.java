package classroom.poultry;

public class Duck extends Poultry{
    public Duck(String name, String variety, String foot, String skill) {
        super(name, variety, foot, skill);
    }

    public void show() {
        System.out.println("我叫"+getName()+"，是一只"+getVariety()+"鸭！");
        System.out.println("我喜欢吃"+getFoot()+"！");
        System.out.println("我会"+getSkill()+"！");
    }
}
