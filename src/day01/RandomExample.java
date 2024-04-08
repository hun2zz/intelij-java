package day01;

public class RandomExample {
    public static void main(String[] args) {


        //연산자 우선순위
        // 단항(++) > 이항(*, / , %) > 삼항(? : ) > 대입 (=)


        /*
           자바에서 난수 만들기
         */
        double random =(int) (Math.random() * 10) + 1 ;
        System.out.println(random);
    }
}
