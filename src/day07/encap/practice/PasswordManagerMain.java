package day07.encap.practice;

public class PasswordManagerMain {

    public static void main(String[] args) {

        PasswordManager pm = new PasswordManager("oldPassword123");
        boolean isChanged = pm.changePassword("oldPassword123", "newPassword123");
        System.out.println("Password changed: " + isChanged); // true

    }
}
