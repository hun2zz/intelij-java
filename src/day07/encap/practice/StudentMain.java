package day07.encap.practice;

public class StudentMain {

    public static void main(String[] args) {

        Student student = new Student();
        student.setName("박영희");
        student.setStudentId("S00111");
        student.setDepartment("Computer Science");
        System.out.println("학생 이름: " + student.getName());
        System.out.println("학번: " + student.getStudentId());
        System.out.println("전공: " + student.getDepartment());
    }
}
