package day11.collection.list;

import java.util.ArrayList;
import java.util.List;
public class ListExample {

    public static void main(String[] args) {

        ArrayList<String> foods = new ArrayList<>();

        foods.add("짜자면");
        foods.add("볶음밥");
        foods.add("짬짜면");
        foods.add(1,"삼산");
        System.out.println(foods);

        //리스트에 초기값 넣고 시작하지
        int[] arr = {10, 20, 30};

        ArrayList<Integer> numbers = new ArrayList<>(List.of(12, 20, 30, 10, 20 ,99 , 90));
        System.out.println("numbers = " + numbers);

        //오름차 정렬
        numbers.sort(Integer::compareTo);
        System.out.println("numbers = " + numbers);
    }
}
