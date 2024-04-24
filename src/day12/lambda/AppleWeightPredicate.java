package day12.lambda;

public class AppleWeightPredicate implements ApplePredicate{

    @Override
    public boolean test(Apple Apple) {
        return Apple.getWeight() >= 100;
    }
}
