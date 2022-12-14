package student_management_system;

public class Faculty extends Person{
    private String designation;
    private String department;

    private static int numberOfFaculty=0;

    public Faculty() {
        super();
        designation="Professor";
        department="Engineering";
        numberOfFaculty++;
    }

    public Faculty(String profName) {
        super(profName);
        designation="Professor";
        department="Engineering";
        numberOfFaculty++;
    }

    public Faculty(String profName, String designation, String department){
        super(profName);
        this.designation=designation;
        this.department=department;
        numberOfFaculty++;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String getDesignation() {
        return designation;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }

    public static int getNumberOfFaculty() {
        return numberOfFaculty;
    }

    public void display() {
        System.out.println();
        super.display();
        System.out.println("Designation: " + designation);
        System.out.println("Department: " + department);
    }
}
