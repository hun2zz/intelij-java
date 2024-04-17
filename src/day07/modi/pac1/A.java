package day07.modi.pac1;

public class A {
    //필드
    public int f1;
    int f2; // 아무것도 안 붙이면 default 제한이 걸린 것이다.
    private int f3;

    //메서드
    public void m1() {}
    void m2() {}// default 제한이 걸림.
    private void m3() {}

    //생성자

    public A(int a){}
    A(double b){}
    private A(boolean c){}

    void test(){
        this.f1 = 10;
        this.f2 = 10;
        this.f3 = 10; //같은 클래스 내부이기 때문에, 어느것을 지정해도 접근이 가능하다.

        m1();
        m2();
        m3();

        new A(10); //public이 붙은 생성자
        new A(5.5); // default가 붙은 생성자
        new A(true); //private가 붙은 생성자
    }
}
