package day03;

public class MethodBasic {


    //자바의 함수는 반드시 클래스 블록 내부, 다른 함수 외부에 만들어야 함.

    //두개의 정수를 전달받아 합을 리턴하는 함수
    static int/*여기는 리턴되는 숫자의 타입을 적어줌. */ add (int n1, int n2) {
        return n1 + n2;
    }
    //리턴이 있으면 static 하고 리턴하는 타입을 적어줌.
    static void multiply (int n1, int n2 ) {
        System.out.printf("%d X %d = %d\n", n1, n2, n1*n2);
    }

    //n개이 정수를 전달받아 그 총합을 반환하는 함수
    static int addAll(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    //2개의 정수를 전달받아 사칙연산의 결과를 모두 리텉

    static int[] operate (int n1, int n2 ) {

        return new int[] {add(n1, n2), n1 - n2, n1 * n2, n1/ n2};
    }
    //리턴이 없으면 void를 붙이고 리턴하는 타입의 값을 적지 않아도 괜찮음.
    public static void main(String[] args) {
        //함수를 호출할 때는 함수 안에서만 가능
        int add = add(10, 20);
        System.out.println("add = " + add);

        //void 함수는 함수의 결과를 변수에 담을 수 없음
        // 반드시 단독 호출해서 사용한다.
        multiply(5,3);

        int r2 = addAll(new int[] {1,3,5,7,9});
        System.out.println("r2 = " + r2);

        int r3 = addAll(10,20,30,40,50);

        int[] operateResult = operate(20, 10);
        System.out.println("곱셈결과 = " + operateResult[2]);
    } // end main method
} //end class
