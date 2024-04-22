package day10.inter;
//인터페이스는 기본적으로 추상화 상태이기 때문에, 추상화 키워드를 사용하지 않아도 됨.
public interface SmartPhone {

    //인터페이스는 처음 설계부터 객체를 만들지 않을 것을 가정했으므로
    //생성자 및 필드를 선언이 불가능하다.

    //스펙 보여주기 기능
    void information();
    //충전 기능
    void charge();
    //카메라 기능
    void camera();
}
