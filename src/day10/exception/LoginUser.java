package day10.exception;

public class LoginUser {

    private String account; //가입 시 계정명
    private String password; // 가입 시  패스워드

    public LoginUser(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public enum Login_Status {
        SUCCESS, ID_FAIL, PW_FAIL
    }

    //로그인 검증
    public Login_Status loginValidate(String inputAccount, String inputPassword) throws Exception {

        // 아이디가 일치한가 ?
        if (!inputAccount.equals(account)){
            throw new Exception("계정이 일치하지 않습니다.");
        }

        //비번이 일치하는가 ?
        if(!inputPassword.equals(password)){
            throw new Exception("비밀번호가 일치하지 않습니다.");
        }
        System.out.println("로그인 성공");
        return Login_Status.SUCCESS;
    }
}
