package classroom.poultry;

public abstract class Poultry {
    private String name;
    private String variety;
    private String foot;
    private String skill;

    public Poultry(String name, String variety, String foot, String skill) {
        this.name = name;
        this.variety = variety;
        this.foot = foot;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getFoot() {
        return foot;
    }

    public void setFoot(String foot) {
        this.foot = foot;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public abstract void show();
}
