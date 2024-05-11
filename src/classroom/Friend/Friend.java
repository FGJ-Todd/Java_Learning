package classroom.Friend;

public abstract class Friend {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    private String name;
    private String food;

    public Friend(String name, String hobby) {
        this.name = name;
        this.food = hobby;
    }

    public abstract void invitation();
}
