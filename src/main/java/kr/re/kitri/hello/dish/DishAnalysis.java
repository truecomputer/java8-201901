package kr.re.kitri.hello.dish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DishAnalysis {
    public static void main(String[] args) {
        List<Dish> dishes = Dish.menu;

        // 필터링 400칼로리 이하
        List<Dish> result = new ArrayList<>();
        for (Dish dish : dishes) {
            if (dish.getCalories() <= 400) {
                result.add(dish);
            }
        }

        System.out.println("before : " + result);

        // sorting by calories
//        Collections.sort(result, new Comparator<Dish>() {
//            @Override
//            public int compare(Dish o1, Dish o2) {
//                return o1.getCalories() - o2.getCalories();
//            }
//        });

//        Collections.sort(result,
//                (o1, o2) -> o1.getCalories() - o2.getCalories()
//        );

//        Collections.sort(result,
//                Comparator.comparingInt(Dish::getCalories)
//        );

        result.sort(Comparator.comparingInt(Dish::getCalories));

        System.out.println("after : " + result);

        List<Dish> finalList = result.subList(0, 3);
        System.out.println("final : " + finalList);
    }
}
