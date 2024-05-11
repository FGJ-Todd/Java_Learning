package examination1.topic4;

public class Cadre extends person{
    private String office;

    public Cadre(String name, String sex, int age, String nationality, String office) {
        super(name, sex, age, nationality);
        this.office = office;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public void meeting(){
        System.out.println(super.getName()+"在开会");
    }
}
