package kr.re.kitri.hello.apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AppleFilter {
    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(
                new Apple(55, "red"),
                new Apple(85, "green"),
                new Apple(120, "red"),
                new Apple(170, "green")
        );

//        System.out.println(apples.toString());

        List<Apple> result = filterGreenApples(apples);
        List<Apple> result2 = filterApplesByColor(apples, "green");
        List<Apple> result3 = filterApples(apples, new RedHeavyApplePredicate());
//        System.out.println(result3);

//        List<Apple> result4 = filterApples(apples, new ApplePredicate() {
//            @Override
//            public boolean test(Apple apple) {
//                return apple.getColor().equals("green") && apple.getWeight() < 100;
//            }
//        });
//        System.out.println(result4);

        List<Apple> result5 = filterApples(apples, a -> a.getColor().equals("green") && a.getWeight() < 100);
//        System.out.println(result5);

        Predicate<Apple> p = a -> a.getWeight() >= 100;
        List<Apple> list5 = filterApples(apples, p.negate().and(a -> a.getColor().equals("red")).negate());
        System.out.println(list5);
    }

    public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    // 전통적인 명령형 프로그래밍
    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor().equals("green")) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterApplesByColor(List<Apple> inventory, String color) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor().equals(color)) {
                result.add(apple);
            }
        }
        return result;
    }
}
