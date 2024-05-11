package classroom.KeepAPet;

public class Master {
    public Master() {}

    public void feed(Pet pet){
        pet.eat();
    }

    public void play(Pet pet){
        if (pet instanceof Dog){
            Dog d = (Dog)pet;
            d.eat();
            d.catchingFlyDisc();
        }else if (pet instanceof Penguin){
            Penguin p = (Penguin)pet;
            p.eat();
            p.swimming();
        }else {
            System.out.println("小猫还没有play方式");
        }
    }

    public Pet adopt(int type){
        Pet pet = null;
        if (type == 1){
            pet = new Dog("欧欧", 60, 60, "金毛");
        }else if (type == 2){
            pet = new Penguin("楠楠", 60, 60, "公");
        }else if (type == 3){
            pet = new Cat("咪咪", 100, 60, "橘猫");
        }else {
            System.out.println("领养失败，没有该宠物");
        }
        return pet;
    }
}
