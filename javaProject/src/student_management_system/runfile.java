package student_management_system;

public class runfile {
    public static void main(String[] args) {

        //Creating a new object for storing all information of student
        Result resultStudent1 = new Result("Nandita Biswas", 'F', 20, 21124033);

        //Adding remaining data to the attributes through setter methods
        resultStudent1.setDOB("26-05-2002");
        resultStudent1.setMobileNo("8841572000");
        resultStudent1.setDepartment("Mathematical Sciences");
        resultStudent1.setYear("1st year");
        resultStudent1.setFeeStatus(true);
        resultStudent1.setAttendance(156);
        //Displaying all the details of the student
        resultStudent1.displayStudentDetails();

        //Adding the necessary data for all the courses
        resultStudent1.setCourse1("MA104", "IT & C Workshop", "Dr. LP Singh", 84.50f);
        resultStudent1.setCourse2("CSO102", "Data Structure", "Dr. SK Singh", 77.00f);
        resultStudent1.setCourse3("MA101", "Mathematics-I", "Dr. Abhash Kumar Jha", 88.75f);
        resultStudent1.setCourse4("ME104", "Engineering Drawing", "Dr. LP Singh", 96.50f);
        resultStudent1.setCourse5("H106", "Education and Self", "Dr. Swasti Mishra", 63.25f);

        //Adding the details of a faculty member of a course
        resultStudent1.course1.setDepartment("Mathematical Sciences");
        resultStudent1.course1.setSex('F');
        resultStudent1.course1.setAge(62);
        resultStudent1.course1.setDOB("12-10-1960");
        resultStudent1.course1.setMobileNo("9994452611");
        //displaying the details of the course along with details of the faculty member
        resultStudent1.course1.displayCourseDetails();
        //printing out the number of faculty member objects created
        System.out.println("\nNumber of Faculty: " + Faculty.getNumberOfFaculty());

        //displaying the result along with all the details of the student
        resultStudent1.displayResult();

    }
}
