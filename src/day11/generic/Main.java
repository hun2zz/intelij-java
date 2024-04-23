package day11.generic;

public class Main {

    public static void main(String[] args) {

        AppleBasket ab = new AppleBasket();
        ab.setApple(new Apple(10));


        BananaBasket bb = new BananaBasket();
        bb.setBanana(new Banana(15));


        Basket<Apple> appleBasket = new Basket<Apple>();
    }
}
