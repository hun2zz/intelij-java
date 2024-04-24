package day12.stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static day12.stream.Menu.menuList;

public class Filtering {

    public static void main(String[] args) {
        //요리 메뉴 중 채식주의자가 먹을 수 있는 요리만 필터링
        List<Dish> collect = menuList
                .stream()
                .filter(dish -> dish.isVegeterian())
                .collect(Collectors.toList());

        collect.forEach(dish ->
                System.out.println("dish = " + dish.getName()));
        System.out.println("=======================");
        //메뉴 목록중에 육류이면서 600카로리 미만인 요리
        List<Dish> collect1 = menuList.stream().filter(dish -> dish.getType() == Dish.Type.MEAT
                && dish.getCalories() < 600).collect(Collectors.toList());

        collect1.forEach(dish -> System.out.println("dish = " + dish));
        System.out.println("============================");
        //메뉴 목록에서 요리 이름이 4글자
        menuList.stream().filter(dish -> dish.getName().length() == 4)
                .collect(Collectors.toList()).forEach(dish -> System.out.println(dish));


        System.out.println("============================");
        // 칼로리가 300칼로리보다 큰 요리 중 앞에서 3개만 필터링 // .limit <<
        menuList.stream().filter(dish -> dish.getCalories() > 300).limit(3) // 앞에서 3개
                .collect(Collectors.toList()).forEach(dish -> System.out.println(dish));
        System.out.println("============================");

        //300 칼로리보다 높은 요리 중 처음 2개는 넘기고 필터링 // .skip <<
        menuList.stream().filter(dish -> dish.getCalories() > 300).skip(7)
                .collect(Collectors.toList()).forEach(dish -> System.out.println(dish));


        List<Integer> numbers = List.of(1,2,3,1,23,12,125,215,6,2);
        //리스트에서 짝수만 필터링. // 중복제거는 .distinct() .
        List<Integer> collect2 = numbers.stream().filter(n -> n % 2 == 0)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("collect2 = " + collect2);


    }
}
