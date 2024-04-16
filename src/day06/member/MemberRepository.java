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

    void addNewMember(Member newMember) {
        //배열에 데이터를 추가하는 로직
        Member[] temp = new Member[members.length + 1];
        for (int i = 0; i < members.length; i++) {
            temp[i] = members[i];

        }
        temp[temp.length -1] = newMember;
        members = temp;

    }
}
