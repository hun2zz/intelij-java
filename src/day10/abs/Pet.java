package day10.abs;

public abstract class Pet {

    String name;
    int age;
    String kind;

    //산책 기능은 필요한 객체가 필요에 따라 오버라이딩 하는 것이지
    //모두에게 강요할 필요가 없다면 굳이 추상화하지 않아도 됨.

    public abstract void eat();// 추상 메서드


//    추상 메서드는 본문이 없는 껍데기 역할 ( 자식들에게 이름을 통일 시키기 위한 장치)로만 사용한다.
//    추상 메서드는 추상 클래스 안에서만 선언이 가능하다.
//    다만 추상 클래스 내부에는 추상 메서드 이외에 모든 메서드 선언 가능
    public abstract void sleep();

}