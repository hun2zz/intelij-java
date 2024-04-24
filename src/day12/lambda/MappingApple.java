package day12.lambda;

//사과중에 원하는 데이터만 추출해서 새로운 리스트로 매핑

import java.util.ArrayList;
import java.util.List;

// 사과중에 원하는 데이터만 추출해서 새로운 리스트로 매핑
public class MappingApple {

    // 사과의 색상만 추출
    public static List<Color> mappingApplesByColor(List<Apple> basket) {
        List<Color> colors = new ArrayList<>();
        for (Apple apple : basket) {
            colors.add(apple.getColor());
        }
        return colors;
    }
}
