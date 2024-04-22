package day10.exception;

public class Main {


    public static void main(String[] args) {

        ThrowsExample te = new ThrowsExample();

//        int i = te.inputNumbe();
//        System.out.println("i = " + i);


//        try {
//            int n = te.convert("100");
//            System.out.println(" n * 20 = " +  n * 20);
//        } catch (NumberFormatException e) {
//            System.out.println("ㅁㄴㅇㅁㄴㅇㅁㄴㅇ");
//        }
        LoginUser loginUser = new LoginUser("1234", "1234");
        try {
            loginUser.loginValidate("12314", "1234");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
