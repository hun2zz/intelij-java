package day11.generic;


//제네릭 클래스 : 타입 복제가 가능한 클래스

public class Basket<E> {

    private E fruit;

    public E getFruit() {
        return fruit;
    }

    public void setFruit(E fruit) {
        this.fruit = fruit;
    }
}
