package student_management_system;

public class Course extends Faculty {
    private String courseCode;
    private String courseName;
    private float marks;
    private char grade;

    public Course(){
        super();
        courseCode="";
        courseName="";
        marks=0;
        grade='F';
    }

    public Course(String courseCode, String courseName, String profName, float marks){
        super(profName);
        this.courseCode=courseCode;
        this.courseName=courseName;
        this.marks=marks;
        grade = Result.findGrade(marks);
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setMarks(float marks) {
        this.marks = marks;
        grade = Result.findGrade(marks);
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }


    public float getMarks() {
        return marks;
    }

    public char getGrade() {
        return grade;
    }

    public void displayCourseDetails() {
        System.out.println();
        System.out.println("Course " + courseCode + " : " + courseName);
        System.out.println("Faculty:- ");
        super.display();
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }

    public void displayMarks() {
        System.out.println("Course " + courseCode + " : " + courseName + " :: " + marks + " :: " + grade);
    }
}
