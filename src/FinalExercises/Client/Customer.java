package FinalExercises.Client;

public class Customer {
    private String name;
    private int age;
    private boolean VIP;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isVIP() {
        return VIP;
    }

    public void setVIP(boolean VIP) {
        this.VIP = VIP;
    }
    public Customer(String name, int age, boolean VIP)
    {
        this.name = name;
        this.age = age;
        this.VIP = VIP;
    }
}
