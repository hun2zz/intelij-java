package day07.player;

public class Main {


    public static void main(String[] args) {

        Warrior w = new Warrior("주차왕파킹");
        Mage m = new Mage("충격왕쇼킹");
        Hunter h = new Hunter("스티븐호킹");

        w.showStatus();
        m.showStatus();
        h.showStatus();

        System.out.println("=========================");

        m.thunderbolt(w,m,h,new Mage("토끼곤듀"),new Warrior("딸긔공듀"));
    }
}
