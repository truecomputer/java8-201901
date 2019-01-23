package kr.re.kitri.hello.dish;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DishAnalysisStream {
    public static void main(String[] args) {
        List<String> collect = Dish.menu.stream()  // make stream Stream<Dish>
                .filter(dish -> dish.getCalories() <= 400)
                .sorted(Comparator.comparingInt(Dish::getCalories))
                .map(Dish::getName) // 이름만 갖고 있는 데이터로 변환
                .collect(Collectors.toList());// 리스트 반환

        System.out.println(collect);
    }
}
