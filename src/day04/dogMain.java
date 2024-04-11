package day04;

public class dogMain {

    public static void main(String[] args) {


        Dog dog = new Dog("도그");
        Dog poppy = new Dog("뽀삐");


        System.out.println("dog = " + dog);
        System.out.println("poppy = " + poppy);
        dog.petInfo();
        System.out.println("-==================");
        poppy.inject();
        poppy.petInfo();
    }
}
