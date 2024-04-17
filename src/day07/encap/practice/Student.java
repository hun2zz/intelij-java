package day07.encap.practice;

public class Student {
    private String Name;
    private String StudentId;
    private String Department;

    public void setName(String name) {
        Name = name;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getName() {
        return Name;
    }

    public String getStudentId() {
        return StudentId;
    }

    public String getDepartment() {
        return Department;
    }
}
