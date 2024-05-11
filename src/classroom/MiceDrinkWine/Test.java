package classroom.MiceDrinkWine;

public class Test {
    public static void main(String[] args) {
        Master master = new Master();
        Mouse mouse1 = new WhiteMouse("小白鼠");
        Mouse mouse2 = new GrayMouse("小灰鼠");
        Mouse mouse3 = new MottleMouse("小花鼠");
        master.feedingVino(mouse1);
        master.feedingVino(mouse2);
        master.feedingVino(mouse3);
    }
}
