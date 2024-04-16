package day06.member;
//역할 - 회원 데이터 관리를 위해 입력 출력을 담당함
public class MemberView {

    //현재 members라는 배열을 ㅁ르기 때문에 객체의 협력이 필요한
    MemberRepository mr;
    MemberView(){
        this.mr = new MemberRepository();
    }
    void showMembers(){
        System.out.printf("========현재 회원 목록 (총 %d명)========\n", mr.members.length);
        for (Member m : mr.members){
            System.out.println(m);
        }
    }

}
