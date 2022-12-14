package student_management_system;

public class Student extends Person {

    private int studentID;
    private String department;
    private String year;
    private boolean feeStatus;
    private int attendance;

    public Course course1, course2, course3, course4, course5;
    private static int numberOfStudents=0;

    public Student() {
        studentID=0;
        department ="Unknown";
        year="1st year";
        feeStatus=false;
        attendance=0;
        numberOfStudents++;
    }

    public Student(String name, int studentID) {
        super(name);
        this.studentID=studentID;
        department ="Unknown";
        year="1st year";
        feeStatus=false;
        attendance=0;
        numberOfStudents++;
    }

    public Student(String name, char sex, int age, int studentID) {
        super(name,sex,age);
        this.studentID=studentID;
        department ="Unknown";
        year="1st year";
        feeStatus=false;
        attendance=0;
        numberOfStudents++;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public void setFeeStatus(boolean feeStatus) {
        this.feeStatus = feeStatus;
    }

    public boolean getFeeStatus() {
        return feeStatus;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public int getAttendance() {
        return attendance;
    }

    public static int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setCourse1(String courseCode, String courseName, String profName, float marks) {
        course1 = new Course(courseCode, courseName, profName, marks);
    }
    public void setCourse2(String courseCode, String courseName, String profName, float marks) {
        course2 = new Course(courseCode, courseName, profName, marks);
    }
    public void setCourse3(String courseCode, String courseName, String profName, float marks) {
        course3 = new Course(courseCode, courseName, profName, marks);
    }
    public void setCourse4(String courseCode, String courseName, String profName, float marks) {
        course4 = new Course(courseCode, courseName, profName, marks);
    }
    public void setCourse5(String courseCode, String courseName, String profName, float marks) {
        course5 = new Course(courseCode, courseName, profName, marks);
    }


    public void displayStudentDetails() {
        System.out.println();
        System.out.println("Student Roll Number: " + studentID);
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Year: " + year);
        System.out.println("Attendance: " + attendance);
        if (feeStatus) System.out.println("Fee Status: Paid");
        else System.out.println("Fee Status: Pending");
    }

}