package day09.poly.car;

public class Main {

    public static void main(String[] args) {

        Car sonata1 = new Sonata();
        Car sonata2 = new Sonata();
        Sonata sonata3 = new Sonata();



        Car mustang1  = new Mustang();
        Car mustang2  = new Mustang();
        Car mustang3  = new Mustang();
        Car mustang4  = new Mustang();


        //다형성으 통해 이중 모음 구조를 구현할 수 있음.
        Car[] sArr = {sonata1, mustang3};
        for (Car car : sArr) {
            car.accelerate();
        }
        System.out.println("===================");

        Driver driver = new Driver();
        driver.drive(new Mustang());

        Sonata mySonata = new Sonata();
        mySonata.accelerate();

//        CarShop shop = new CarShop();

        //객체 타입에서 다운 캐스팅의 전제 조건 : 반드시 상속관계가 있어야 하며,
        //자식객체가 부모타입으로 업캐스팅 된 것만 내릴 수 있음.
        //즉 , 부모타입을 자식 타입으로 내릴 순 없다.

//        Sonata car = (Sonata)shop.exportCar(3000);
//        car.accelerate();
//        car.joinSonataClub(/);

        System.out.println("==================");

//        Sonata ccc = (Sonata) new Car();

//        Mustang mmm = new Mustang();

//        Car ttt = new Tucson();
//        Tucson tts = (Tucson) ttt;
    }
}
