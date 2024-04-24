package day12.inner;

import day07.modi.pac2.C;

public class Main {

    //내부 클래스 (중첩 클래스 )
    //뺄셈 계산기가 필요한데 아마도 이 계산기 설계도는
    //main 클래스 안에서만 사용하고 외부에서는 안 쓸것 같아
    public static class SubCalculator implements Calculator {

        @Override
        public int operate(int n1, int n2) {
            return n1 -n2;
        }
    }

    public static void main(String[] args) {

        Calculator addCal = new AddCalculator();
        int r1 = addCal.operate(10, 20);
        System.out.println("r1 = " + r1);

        addCal = new SubCalculator();
        int r2 = addCal.operate(50, 10);
        System.out.println("r2 = " + r2);

        //익명 클래스 : 이름이 없는 클래스를 빠르게 선언하는 법
        // 클래스를 통해 객체를 생성하긴 할건데..
        //재활용은 안 할 거 같은데

        //람다 //
        //= 반드시 인터페이스 안의 추상메서드가 1개여야 한다.

        addCal = new Calculator() {

            @Override
            public int operate(int n1, int n2) {
                return n1 * n2;
            }
        };
        int operate = addCal.operate(10, 4);
        System.out.println("operate = " + operate);

//        Calculator cal = new Calculator();
        System.out.println("=============================================");
        Restaurant fr = new FrechRestaurant();
        Restaurant fr1 = new FrechRestaurant();
        Restaurant fr2 = new FrechRestaurant();

        Restaurant japaneseRestaurant = new Restaurant() {

            @Override
            public void cook() {
                System.out.println("일식 요리를 합니다.");
            }
        };

        Restaurant italian = () -> System.out.println("이탈리아 요리 시작~");


    }
}
