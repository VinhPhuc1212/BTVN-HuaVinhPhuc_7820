package LEC_08_Objectanclass.EX1.StudentID;
import java.util.*;
public class Student {

    private String studentID;
    private String fullName;
    private String major;

    public Student(String studentID, String fullName, String major) {
        this.studentID = studentID;
        this.fullName = fullName;
        this.major = major;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ID: ");
        this.studentID = scanner.nextLine();
        System.out.println("Nhap Ten: ");
        this.fullName = scanner.nextLine();
        System.out.println("Nhap nganh: ");
        this.major = scanner.nextLine();

    }

    public void displayInfo() {
        System.out.println(studentID + " - " + fullName + " - " + major);

    }
}
