package day07.encap.practice;

public class CarMain {

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setBrand("현대");
        myCar.setModel("그랜져");
        myCar.setYear(2020);
        System.out.println("Car Brand: " + myCar.getBrand());
        System.out.println("Car Model: " + myCar.getModel());
        System.out.println("Car Year: " + myCar.getYear());
    }
}
