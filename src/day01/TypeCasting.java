package day01;

public class TypeCasting {
    public static void main(String[] args) {
        byte a = 100; // 1byte
        int b = a; // 4byte
        //암묵적 형 변환
        System.out.println(b);

        int c = 1000;
        //명시적 형 변환
        byte d = (byte) c;
        System.out.println("d = " + d);

        int k = 50;
        double j = k ; // 암묵적으로 k를 double로 바꾸고 j에 들어감.


        double m = 5.567;
        int n = (int)m; // 명시적 형 변환이다.

        //암묵적 형변환 -> upcasting (promotion)
        //명시적 형변환 -> downcasting
        // 명시적 형변환은 데이터 손실을 일으킬 수 있음.

        int v = 100;
        double z = 5.5;
        //타입이 다른 데이터의 연산은 작은 쪽을 큰 쪽으로 캐스팅함.
        double v1 = v + z;
        
        float f1 = 3.14F;
        double f2 = 5.5;

        int s  = 10;
        int o = 5;
        double r2 = (int) s * o;

        
        //int 이하의 사이즈를 가진 타입은 연산 시 결과가 자동으로 int로 캐스팅됨 .
        
        char b1 = 'A';
        char b2 = 'C';

        char i = (char) (b1 + b2);
        System.out.println(i);

    }
}
