package student_management_system;

public class Person {
    private String name;
    private char sex;
    private byte age;
    private String dob;
    private String mobileNo;

    public Person() {
        this.name="Unknown";
        this.sex='U';
        this.age=0;
        this.mobileNo="";
        this.dob="";
    }
    public Person(String name) {
        this.name=name;
        this.sex='U';
        this.age=0;
        this.mobileNo="";
        this.dob="";
    }
    public Person(String name, char sex, int age) {
        this.name=name;
        this.sex=sex;
        this.age=(byte) age;
        this.mobileNo="";
        this.dob="";
    }
    public Person(String name, char sex, int age, String mobileNo, String dob) {
        this.name=name;
        this.sex=sex;
        this.age=(byte) age;
        this.mobileNo=mobileNo;
        this.dob=dob;
    }

    public String getName() {
        return name;
    }
    public char getSex() {
        return sex;
    }
    public byte getAge() {
        return age;
    }
    public String getMobileNo() {
        return mobileNo;
    }

    public void setName(String name) {
        this.name=name;
    }
    public void setSex(char sex) {
        this.sex=sex;
    }
    public void setAge(int age) {
        this.age=(byte) age;
    }
    public void setDOB(String dob) {
        this.dob=dob;
    }
    public void setMobileNo(String mobileNo) {
        this.mobileNo=mobileNo;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Sex: " + sex);
        System.out.println("Age: " + age);
        System.out.println("DOB: " + dob);
        System.out.println("Mobile Number: " + mobileNo);
    }

}
