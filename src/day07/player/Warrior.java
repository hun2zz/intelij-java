package day07.player;

public class Warrior extends Player {
    int rage; // 분노 게이지

    public Warrior(String nickname) {
        this.nickname = nickname;
        this.level = 1;
        this.hp =50;
        this.rage = 100;
    }
    public void dash(Warrior target) {
        System.out.println("DASH 스킬을 사용합니다.");
    }

    //오버 라이딩 : 부모가 물려준 메서드를 고쳐 쓰는 것.
    //규칙 : 부모가 물려준 형태를 유지할 것(파라미터, 리턴타입, 이름)
    //      접근제한자는 부모보다 more public 할 것.

    @Override // 오버라이딩 룰을 지켰는지 검증해줌.
    public void showStatus(){
        super.showStatus();
        System.out.println("rage : " + this.rage);
    }

}
