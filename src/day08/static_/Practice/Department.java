package day08.static_.Practice;

public class Department {
    String departmentName;
    int studentCount;
    static int totalStudents;

    Department(String DepartmentName, int studentCount){
        this.departmentName = DepartmentName;
        this.studentCount = studentCount;
        totalStudents += studentCount;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    void addStudent(int studentCount) {
        this.studentCount += studentCount;
    }

    public int getStudentCount() {
        return studentCount;
    }
}
