package day12.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static day12.stream.Menu.menuList;

public class Sorting {

    public static void main(String[] args) {

        //육류 요리 중 칼로리가 낮은 순으로 정렬하기
        List<Dish> collect = menuList.stream()
                .filter(d -> d.getType() == Dish.Type.MEAT)
                .sorted(Comparator.comparing(Dish::getCalories))
                .collect(Collectors.toList());
        System.out.println("collect = " + collect);

        //메뉴 목록에서 메뉴들을 이름 내림차순으로 정렬 (zyx순 )
        menuList.stream().sorted(Comparator.comparing(Dish::getName).reversed())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        List<Dish> collect1 = menuList.stream().filter(d -> d.getCalories() > 300)
                .sorted(Comparator.comparing(Dish::getCalories))
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("collect1 = " + collect1);
    }
}
