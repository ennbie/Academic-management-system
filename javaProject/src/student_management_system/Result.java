package student_management_system;

public class Result extends Student {
    private float totalMarks;
    private float percentage;
    private char overallGrade;

    public Result(String name, char sex, int age, int studentID) {
        super(name,sex,age,studentID);
    }

    public float calcTotalMarks() {
        totalMarks = course1.getMarks() + course2.getMarks() + course3.getMarks() + course4.getMarks() + course5.getMarks();
        return totalMarks;
    }
    public float calcPercentage() {
        percentage = totalMarks/5;
        return percentage;
    }
    public char calcOverallGrade() {
        overallGrade = findGrade(percentage);
        return overallGrade;
    }

    public static char findGrade(float marks) {
        if (marks>90) return 'A';
        else if (marks>80) return 'B';
        else if (marks>70) return 'C';
        else return 'F';
    }

    public void displayResult() {
        System.out.println();
        System.out.println("------------------------------------------------------");
        super.displayStudentDetails();
        System.out.println("------------------------------------------------------");
        course1.displayMarks();
        course2.displayMarks();
        course3.displayMarks();
        course4.displayMarks();
        course5.displayMarks();
        System.out.println("------------------------------------------------------");
        System.out.println("Total Marks (out of 500): " + calcTotalMarks());
        System.out.println("Percentage of marks: " + calcPercentage());
        System.out.println("Overall grade: " + calcOverallGrade());
        System.out.println("------------------------------------------------------");
    }
}
