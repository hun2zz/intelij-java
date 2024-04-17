package day07.encap.practice;

public class BankAccount {
    private String account;
    private String name;
    private int money;


    BankAccount(String account, String name, int money){
        this.account = account;
        this.name=name;
        this.money = money;
    }

    public int getBalance() {
        return money;
    }

    public void deposit(int money) {
        if(money < 0) return;
        this.money += money;
    }

    public void withdraw(int money) {
        if(money > this.money) return;
        this.money -= money;
    }
}
