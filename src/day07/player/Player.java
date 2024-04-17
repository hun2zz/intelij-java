package day07.player;

public class Player {
    String nickname;
    int level;
    int hp;

    public void showStatus(){
        System.out.println("\n========= Character's info==========");
        System.out.println("nickname : " + this.nickname);
        System.out.println("level : " + this.level);
        System.out.println("hp : " + this.hp);
    }
}
