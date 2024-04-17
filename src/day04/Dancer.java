package day04;


import javax.swing.*;

//class : 객체를 찍어내는 설계도다.
//라이브러리 클래스: 설계도의 역할만 함, 실행은 안함 그래서 메인이 없음.
public class Dancer {


    //클래스에서는 객체의 속성과 기능을 정의한다.

    // 객체의 속성 : 객체를 표혀하는 데이터
    // - >자바에서는 필드 ( field)라고 부른다.
    //자바에서는 함수 안에서 선언되는 변수만 변수라 부르고 클래스 안에서 선언한 변수는 필드이다.


    String dancerName; // 댄서 이름
    String crewName; // 팀 이름
    String genre; // 장르
    int danceLevel; // 0: 초보, 1: 아마추어, 2: 프로

    //객체의 기능 : 객체가 할 수 있는 일, 행위
    //- > 메서드(method) 라고 부름. static을 붙이지 않기

    //자기소개 기능
    void introduce() {
        System.out.println("이름 : " + dancerName);
        System.out.println("팀명 : " + crewName);
        System.out.println("장르 : " + genre);
        System.out.println("레벨 : " + danceLevel);
    }

    //춤추느 기능
    public void dance() {
        System.out.printf("%s 댄서가 %s춤을 춥니다.\n",dancerName, genre);
    }


    //생성자 (constructor)
    //객체가 생성될 때, 초기 값을 세팅해주는 함수의 일종
    //1. 생성자는 함수의 일종인데 반드시 이름이 클래스 이름과 같아야 함.
    //2. 생성자는 리턴값이 없음. 따라서 void가 생략됨
    public Dancer() {
      dancerName = "춤꾼";
      crewName = "팝핀크루";
      genre = "케이팝";
      danceLevel = 0;
    }

    //생성자는 여러 개 만들 수 있음 용어적으로는 생성자 오버로딩이라고 부른다.
    //규칙 : 파라미터가 달라야 함.
    Dancer(String dNAme) {
        dancerName = dNAme;
        crewName = "도시의 춤꾼들";
        genre = "어반";
        danceLevel = 1;
    }

    Dancer(String dNAme, String cName) {
        dancerName = dNAme;
        crewName = cName;
        genre = "어반";
        danceLevel = 1;
    }

    Dancer(String dNAme, String cName, String ge) {
        dancerName = dNAme;
        crewName = cName;
        genre = ge;
        danceLevel = 1;
    }
}
