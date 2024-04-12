package day04;

public class fieldAndLocal {
    //필드는 값을 초기화하지 않아도
    //각 타입의 기본값으로 자동 세팅
    //정수는 : 0, 실수는 0.0 , 논리는 false, 문자(char)는 공백, 나머지 : null이 기본값
    double a;

    // ccc : 매개 변수 ( parameter ) = 메서드 호출시 반드시 필요한 인자 값이다.
    //a는 힙이라는 공간에 살고 b는 스택이라는 공간에 산다.
    //힙은 넓기에 값을 안 넣으면 자동으로 0을 넣어주지만,
    // 스택이라는 공간에 값을 안 넣어주면 공간을 아끼기 위해서 기본값을 넣어주지 않는다.
    void foo(int c) {
        int b = 20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
