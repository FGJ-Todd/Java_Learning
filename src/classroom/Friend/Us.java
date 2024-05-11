package classroom.Friend;

public class Us extends Friend{
    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Us(String name, String hobby, String hobby1) {
        super(name, hobby);
        this.hobby = hobby1;
    }

    private String hobby;

    public void invitation() {
        System.out.println("牛犇和他的米国朋友"+super.getName()+"一起"+hobby+"吃"+super.getFood());
    }
}
