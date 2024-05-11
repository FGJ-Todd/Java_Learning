package examination1.topic1;

public class flower {

    public flower(String color) {
        this.color = color;
    }

    private String color;

    void grow(){
        System.out.println(color+"色的花生长值+1");
    }

    void bloom(){
        System.out.println(color+"色的花生开花");
    }

    public static void main(String[] args) {
        flower f = new flower("红");
        f.grow();
        f.bloom();
    }
}
