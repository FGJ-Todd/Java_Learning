package classroom.MiceDrinkWine;

public class MottleMouse extends Mouse {
    public MottleMouse(String name) {
        super(name);
    }

    @Override
    public void drink() {
        System.out.println("小花鼠看了看、把酒一口喝下。");
        System.out.println("反应：");
        System.out.print("\t没有什么反应，主人对这酒很失望，这么贵的酒\n，白花钱了。");
        System.out.print(".......又过了一会，小花鼠找了一块板砖，\n");
        System.out.print("眼睛布满血丝，晃晃悠悠地走到主人面前，说道：猫呢\n");
        System.out.print("，他在欺负我们，看我不拍死他丫的。\n");
        System.out.println("\t主人目瞪口呆");
        System.out.println("---------------------------------");
    }
}
