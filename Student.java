// student.java
public class Student {
    public static void main(String[] args) {
        System.out.println("Student Management System v2.0");
        Login.login("student","password");
        Marks.printMarks();
        Attendance.markPresent("student");
    }
}
