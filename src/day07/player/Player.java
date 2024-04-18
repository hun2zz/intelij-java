package day07.player;

public class Player {
    String nickname;
    int level;
    int hp;


    Player(String nickname){
        this.nickname = nickname;
        this.level = 1;
        this.hp = 50;
    }
    public void showStatus(){
        System.out.println("\n========= Character's info==========");
        System.out.println("nickname : " + this.nickname);
        System.out.println("level : " + this.level);
        System.out.println("hp : " + this.hp);
    }
}
