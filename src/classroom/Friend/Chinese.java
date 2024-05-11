package classroom.Friend;

public class Chinese extends Friend{
    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Chinese(String name, String hobby, String food) {
        super(name, food);
        this.hobby = hobby;
    }

    private String hobby;

    public void invitation() {
        System.out.println("牛犇和他的中国朋友"+super.getName()+"一起"+hobby+"吃"+super.getFood());
    }
}
