package day05.player;
//생성자는 생성자 내부에서 또 다른 생성자를 호출할 수 있다.
//this()는 나의 생성자에 접근해 생성자 안에 생성자는 부를 땐 무조건 첫 줄에 작성을 해야한다.
//this.은 나한테 접근해.
public class Player {

    String nickname;
    int level;
    int hp;


    //생성자 : 객체가 만들어질 때 초기에 어떤값을 가질지를 정하는 곳


    public Player() {
        this("이름없는캐릭터",1,50);
        //this()로 다른 생성자를 부를 때는 생성자당 1번씩만 가능
        //그리고 가장 첫줄에 작성해야 함.

        System.out.printf("1번 생성자 호출");
    }

    Player(String nickname) {
        this(nickname,1,50);
        System.out.printf("2번 생성자 호출");
        this.nickname = nickname;
    }

    public Player(String nickname, int level) {
        this(nickname, level, 50);
        System.out.printf("3번 생성자 호출");
        this.nickname = nickname;
        this.level = level;
    }

    public Player(String nickname, int level, int hp) {
        System.out.printf("4번 생성자 호출");
        this.nickname = nickname;
        this.level = level;
        this.hp = hp;
    }

    //메서드 기능

    void attack(Player target) {
        System.out.println("target = " + target);
        //맞은 플레이어의 체력을 10 감소 시켜야함.
        target.hp -= 10;
        //때린 플레이어의 체력도 3이 닳음
        this.hp -= 3;
        System.out.println("this = " + this);
        System.out.printf("%s님이 %s님을 공격했습니다.\n",this.nickname, target.nickname);
        System.out.printf("%s님의 남은 체력 : %d\n", target.nickname, target.hp);
        System.out.printf("%s님의 남은 체력 : %d\n", this.nickname, this.hp);
    }
}
