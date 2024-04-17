package day07.encap.practice;

public class PasswordManager {

    private String password;

    public PasswordManager(String password) {
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean changePassword(String oldpassword, String newpassword) {
        if (oldpassword.equals(this.password)) {
            this.password = newpassword;
            return true;
        }
        return false;
    }
}
