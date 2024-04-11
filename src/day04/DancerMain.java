package day04;


//실행용 클래스 : 객체를 생성해서 객체의 기능을 실행시키는 곳
//main이 필요함

public class DancerMain {

    public static void main(String[] args) {

        //설계도(클래스)를 통해서 객체를 찍어냄(생성)
        Dancer kim = new Dancer(); // kim이라는 변수는 Dancer 타입이라는 것이다.


        //객체의 속성 부여
        kim.dancerName = "김뽀또";
        kim.crewName = "치즈치즈";
        kim.genre = "스트릿";
        kim.danceLevel = 1;
        kim.introduce();
        kim.dance();

        Dancer park = new Dancer();

        park.dancerName = "박격포";
        park.crewName = "전쟁이야";
        park.genre = "코레오";
        park.danceLevel = 2;

        park.dance();

        Dancer hong = new Dancer(); // 여기서 new Dancer()가 생성자 호출이다.
        hong.dance();

        Dancer choi = new Dancer("최폭풍");
        choi.dance();
        choi.introduce();


        Dancer nanana = new Dancer("냐냐냥", "시골크루");
        nanana.dance();
        nanana.introduce();

        Dancer rock = new Dancer("메롱롱", "폭식맨", "락킹");
        rock.introduce();


    }
}
