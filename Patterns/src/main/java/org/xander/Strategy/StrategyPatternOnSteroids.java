package org.xander.Strategy;

import java.util.Arrays;
import java.util.List;

public class StrategyPatternOnSteroids {
    public static void main(String[] args) {
        List<Duck> strategies = Arrays.asList(new MallardDuck(), new ModelDuck());

        strategies.forEach(Duck::performFly);
        strategies.forEach((elem) -> elem.performQuack());
    }

}
