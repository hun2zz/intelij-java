package day11.collection.map;

import day09.poly.car.Mustang;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
    Map<String, Object> map = new HashMap<>();


    //class에서 객체는 생성자를 여러번 찍어낼 때 사용하는 것이고, map은 1회용성으로 사용한다.
    //데이터 추가 : punt()
        map.put("지갑잔액", 500);
        map.put("좋아하는 자동차", new Mustang());
        map.put("오늘 저녁 메뉴 ", "계란볶음밥");
        Map<String, Object> mep = new HashMap<>();
        mep.put("mepName", "김철수");
        mep.put("mepAge", 13);

        int age = (int) mep.get("mepAge");
        System.out.println("age = " + age);

        mep.put("mepAge", 99);
        int age1 = (int) mep.get("mepAge");
        System.out.println("age1 = " + age1);

        
        //자바 스크립트의 객체 순환처럼 키들만 순회하여 출력한다.
        for (String s : mep.keySet()) {
            System.out.println("s = " + s);
            System.out.println("mep.get(s) = " + mep.get(s));

        }

    }
}
