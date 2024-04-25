package day12.stream;

import static day12.stream.Menu.menuList;

public class Finding {

    public static void main(String[] args) {

        // 메뉴 목록에서 채식주의자가 먹을 수 있는 요리가 하나라도 존재하는가 ?
        boolean flag1 = menuList.stream()
                .anyMatch(d -> d.isVegeterian());

        System.out.println("flag1 = " + flag1);

        //메뉴 목록에서 칼로리가 100 이하인 요리가 하나라도 있는가 ?
        boolean b = menuList.stream().anyMatch(d -> d.getCalories() <= 100);
        System.out.println("b = " + b);

        //메뉴 목록의 모든 요리가 1000칼로리 미만입니까?
        menuList.stream()
                .allMatch(d->d.getCalories() < 1000);
    }
}
