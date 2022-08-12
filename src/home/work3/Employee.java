package home.work3;

public class Employee {
    private String fullName;
    private String workingPosition;
    private String eMail;
    private long phoneNumber;
    private int age;

    public Employee(String fullName, String workingPosition, String eMail, long phoneNumber, int age) {
        this.fullName = fullName;
        this.workingPosition = workingPosition;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }
}