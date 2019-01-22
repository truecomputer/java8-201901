package kr.re.kitri.hello.apple;

public class RedHeavyApplePredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("red") && apple.getWeight() >= 100;
    }
}
