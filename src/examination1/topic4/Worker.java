package examination1.topic4;

public class Worker extends person{
    private String unit;
    private int Seniority;

    public Worker(String name, String sex, int age, String nationality, String unit, int seniority) {
        super(name, sex, age, nationality);
        this.unit = unit;
        Seniority = seniority;
    }

    void job(){
        System.out.println(super.getName() + "在劳动");
    }
}
