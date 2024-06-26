package day06.member;

public class Test {

    public static void main(String[] args) {
        Member[] arr = new Member[5];




        Member m1 = new Member("abc@def.com", "1234", "김철수", "남성", 30);
        Member m2 = new Member("xyz@ghi.com", "1521", "김영희", "여성", 32);

        arr[0] = m1;
        arr[1] = m2;
        arr[2] = new Member("ad","zz","d","d",30);

        System.out.println("m1 = " + m1.toString());
        System.out.println("m2 = " + m2.toString());


        Member[] members = {m1, m2};

        System.out.println("===========================");
        MemberRepository mr = new MemberRepository();
        MemberView mv = new MemberView();
        mr.addNewMember(new Member("123","321","임","남",12));

        mv.showMembers();

    }
}
