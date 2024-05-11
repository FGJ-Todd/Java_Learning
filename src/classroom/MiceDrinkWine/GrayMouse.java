package classroom.MiceDrinkWine;

public class GrayMouse extends Mouse {
    public GrayMouse(String name) {
        super(name);
    }

    @Override
    public void drink() {
        System.out.println("小灰鼠运动一下，把酒一口喝下。");
        System.out.println("反应：");
        System.out.println("\t脸色微红，不一会就开始跳舞。");
        System.out.println("主人感觉这就还有点浪漫情调");
        System.out.println("---------------------------------");
    }
}
