package day05;

public class ListMain {

    public static void main(String[] args) {


        StringList foods = new StringList();
        StringList userNames = new StringList();


        //배열 내부 데이터 수 확인
        System.out.println(foods.size());

        //배열에 데이터 추가
        foods.push("짬뽕");
        foods.push("치킨");

        userNames.push("박영희");

        //자료 삭제
//        foods.remove(0); // 인덱스 번호를 알고 있을 때 사용.
//        foods.remove("짬뽕"); // 인덱스 번호를 모르고 배열의 이름을 알때 사

        //자료 중간 삽입
        userNames.push("박영희");
        userNames.push("김철수");

        userNames.insert(1, "뽀로로");
        foods.insert(1,"마라탕");

        //배열 데이터 수정
        foods.set(1, "김치볶음밥"); // 0번 인덱스 수정
        //배열 데이터 전체 삭제
        foods.clear();


        StringList hobbies = new StringList("축구", "영화","음악감상");

        //배열 데이터가 한개라도 있는지 확인.
        boolean empty = foods.isEmpty();
        System.out.println(empty);

        System.out.println("foods = " + foods.toString());
        System.out.println("userNames = " + userNames.toString());
        System.out.println(hobbies.toString());
    }


}
