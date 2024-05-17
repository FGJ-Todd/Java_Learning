package examination1.topic7;

public class Course {
    private final String nameC;
    private final int fraction;
    private final int grades;

    public String getNameC() {
        return nameC;
    }

    public int getFraction() {
        return fraction;
    }

    public int getGrades() {
        return grades;
    }

    public Course(String nameC, int fraction, int grades) {
        this.nameC = nameC;
        this.fraction = fraction;
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Course{" +
                "课名='" + nameC + '\'' +
                ", 学分=" + fraction +
                ", 成绩=" + grades +
                '}';
    }
}
