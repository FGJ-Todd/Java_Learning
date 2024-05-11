package examination1.topic7;

public class Student {
    private String name;
    private String id;
    private Course [] courses;
    private double avgGrades;
    private int sumFraction;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course[] getCourses() {
        return courses;
    }

    public Student(String name, String id, Course[] courses, double avgGrades, int sumFraction) {
        this.name = name;
        this.id = id;
        this.courses = courses;
        this.avgGrades = avgGrades;
        this.sumFraction = sumFraction;
    }

    {
        this.courses = new Course[3];
    }

    public void courseSelection(Course course){
        if (this.courses[0] == null){
            this.courses[0] = course;
            System.out.println(course.getNameC()+"选课成功");
        }else if (this.courses[1] == null){
            this.courses[1] = course;
            System.out.println(course.getNameC()+"选课成功");
        }else if (this.courses[2] == null){
            this.courses[2] = course;
            System.out.println(course.getNameC()+"选课成功");
        }else {
            System.out.println("课程已满");
        }
    }

    public void courseExit(Course course){
        if (this.courses[0] == course){
            this.courses[0] = null;
            System.out.println(course.getNameC()+"退课成功");
        }else if (this.courses[1] == course){
            this.courses[1] = null;
            System.out.println(course.getNameC()+"退课成功");
        }else if (this.courses[2] == course){
            this.courses[2] = null;
            System.out.println(course.getNameC()+"退课成功");
        }else{
            System.out.println(course.getNameC()+"未被选中");
        }
    }

    public void examination(Course course){
        System.out.println(course.getNameC()+"考试成绩为"+course.getGrades());
    }

    public void coursePrint(){
        System.out.println("\n已选课程有");
        for (Course cours : this.courses) {
            System.out.println(cours.toString());
        }
    }

    public void avgGradesPrint(){
        double sum = 0;
        for (Course cours : this.courses) {
            sum += cours.getGrades();
        }
        sum = (double) sum /this.courses.length;
        System.out.println("平均成绩为："+sum);
    }

    public void sumFractionPrint(){
        int sum = 0;
        for (Course cours : this.courses) {
            sum += cours.getFraction();
        }
        System.out.println("获得的总学分："+sum);
    }
}
