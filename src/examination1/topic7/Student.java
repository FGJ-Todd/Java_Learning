package examination1.topic7;

public class Student {
    private String name;
    private final String id;
    private Course [] courses = new Course[3];
    private final double avgGrades;
    private final int sumFraction;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public Student(String name, String id, double avgGrades, int sumFraction) {
        this.name = name;
        this.id = id;
        this.avgGrades = avgGrades;
        this.sumFraction = sumFraction;
    }

    public void courseSelection(Course course){
        for (int i = 0; i < courses.length; i++){
            if (courses[i] == null){
                courses[i] = course;
                System.out.println(course.getNameC()+"选课成功");
                return;
            }
        }
        System.out.println("课程已满");

//        if (this.courses[0] == null){
//            this.courses[0] = course;
//            System.out.println(course.getNameC()+"选课成功");
//        }else if (this.courses[1] == null){
//            this.courses[1] = course;
//            System.out.println(course.getNameC()+"选课成功");
//        }else if (this.courses[2] == null){
//            this.courses[2] = course;
//            System.out.println(course.getNameC()+"选课成功");
//        }else {
//            System.out.println("课程已满");
//        }
    }

    public void courseExit(Course course){
        if (courses[0] == course){
            courses[0] = null;
            System.out.println(course.getNameC()+"退课成功");
        }else if (courses[1] == course){
            courses[1] = null;
            System.out.println(course.getNameC()+"退课成功");
        }else if (courses[2] == course){
            courses[2] = null;
            System.out.println(course.getNameC()+"退课成功");
        }else{
            System.out.println(course.getNameC()+"未被选中");
        }

    }

    public void examination(Course course){
        if(course != null){
            System.out.println(course.getNameC()+"考试成绩为"+course.getGrades());
        }
    }

    public void coursePrint(){
        System.out.println("\n已选课程有");
        int count = 0;
        for (Course course : courses) {
            if (course != null){
                System.out.println(course.toString());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("无课程");
        }
    }

    public void avgGradesPrint(){
        double sum = 0;
        for (Course cours : courses) {
            if (cours == null){
                continue;
            }
            sum += cours.getGrades();
        }
        sum = sum /courses.length;
        System.out.println("平均成绩为："+sum);
    }

    public void sumFractionPrint(){
        int sum = 0;
        for (Course cours : courses) {
            if (cours == null){
                continue;
            }
            if (cours.getGrades() >= 60){
                sum += cours.getFraction();
            }
//            sum += cours.getFraction();
        }
        System.out.println("获得的总学分："+sum);
    }
}
