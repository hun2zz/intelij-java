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
    }
}
