package LEC_08_Objectanclass.EX1.StudentID;

public class Studentmain {

    public static void main(String[] args) {
        Student s3= new Student (" "," "," "); 
        Student s1 = new Student("S001", "VinhPhuc", "IT");
        Student s2 = new Student("S002", "Dung", "SE");
        s1.displayInfo();
        s2.displayInfo();
        s3.input();
    }
}
