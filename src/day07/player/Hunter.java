package day07.player;

public class Hunter extends Player{


    int concentration; // 집중력

    public Hunter(String nickname) {
        super(nickname);
        this.concentration = 10;
    }

    public void multipleArrow(){

    }
    public void showStatus(){
        super.showStatus();
        System.out.println("concentration : " + this.concentration);
    }

}
