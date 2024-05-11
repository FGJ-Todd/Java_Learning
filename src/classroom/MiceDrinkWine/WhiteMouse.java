package classroom.MiceDrinkWine;

public class WhiteMouse extends Mouse{
    public WhiteMouse(String name) {
        super(name);
    }

    @Override
    public void drink() {
        System.out.println("小白鼠把酒一口喝下。");
        System.out.println("反应：");
        System.out.println("\t睡着了，主人对这酒很满意。");
        System.out.println("---------------------------------");
    }
}
