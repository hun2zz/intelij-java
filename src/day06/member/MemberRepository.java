package day06.member;
//역할 : 회원 배열을 관리하는 역할 - 회원 데이터 저장소

public class MemberRepository {
    //필드
    static Member[] members;

    //생성자
    MemberRepository() {
        this.members = new Member[3];
        members[0] = new Member("abc@def.com", "1234", "김수니", "남성", 30);
        members[1] = new Member("qwe@def.com", "1222", "홍순", "여성", 20);
        members[2] = new Member("123@def.com", "1111", "명수", "남성", 10);
    }


    /**
     * 생성된 회원정보를 회원 배열에 끝에 추가하는 기능
     * @param newMember - 사용자의 입력으로 전달된 회원 정보 객체
     */
    void addNewMember(Member newMember) {
        //배열에 데이터를 추가하는 로직
        Member[] temp = new Member[members.length + 1];
        for (int i = 0; i < members.length; i++) {
            temp[i] = members[i];

        }
        temp[temp.length -1] = newMember;
        members = temp;
    }


    /**
     * 이메일 중복을 확인하는 기능
     * @param targetEmail - 검사할 사용자의 입력 이메일 값
     * @return - 이메일이 이미 존재한다면 true, 존재하지 않은 사용가능한 이메일임.
     */

    boolean isDuplicateEmail(String targetEmail) {
        for (Member member : members) {
            if (targetEmail.equals(member.email)) {
                return true;
            }
        }
        return false;
    }
}
