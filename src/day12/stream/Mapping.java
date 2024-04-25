package day12.stream;

import java.util.List;
import java.util.stream.Collectors;

import static day12.stream.Menu.menuList;

public class Mapping {

    public static void main(String[] args) {

        //요리 이름만 추출
        List<String> collect = menuList
                .stream()
                .map(dish -> dish.getName())
                .collect(Collectors.toList());

        System.out.println("collect = " + collect);
        List<String> words = List.of(
                "safari", "chrome", "ms edge", "opera", "firefox"
        );

        List<Integer> collect1 = words.stream()
                .map(w -> w.length()).collect(Collectors.toList());
        System.out.println("collect1 = " + collect1);

        List<Character> collect2 = words.stream()
                .map(w -> w.charAt(0)).collect(Collectors.toList());
        System.out.println("collect2 = " + collect2);

        System.out.println("==========================");

        //메뉴 목록에서 메뉴 이름과 칼로리를 추출해서 새로운 객체에 포장


        List<SimpleDish> collect3 = menuList.stream()
                .map(d -> new SimpleDish(d))
                .collect(Collectors.toList());

        collect3.forEach(o -> System.out.println(o));
        /*
            메뉴 목록에서 칼로리가 500칼로리보다 큰
            음식들을 필터링한 다음에 음식의 이름과 타입만
            추출해서 출력해주세요.

            단, 타입은 MEAT의 경우 육류, FISH는 어류, OTHER는 기타
         */
        List<DishDetail> collect4 = menuList.stream()
                .filter(dish -> dish.getCalories() > 500)
                .map(DishDetail::new)
                .collect(Collectors.toList());

        System.out.println("collect4 = " + collect4);

        System.out.println("========================");

        //메뉴 목록에 있는 요리들의 총 칼로리 수 구하기
        int sum = menuList.stream()
                .mapToInt(d -> d.getCalories())
                .sum();
        System.out.println("sum = " + sum);

        //육류 메뉴의 평균 칼로리
        double asDouble = menuList.stream()
                .filter(dish -> dish.getType() == Dish.Type.MEAT)
                .mapToInt(d -> d.getCalories())
                .average()
                .getAsDouble();
        System.out.println("asDouble = " + asDouble);
    }
}
