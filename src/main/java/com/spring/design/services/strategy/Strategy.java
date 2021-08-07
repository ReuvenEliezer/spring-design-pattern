package com.spring.design.services.strategy;

public interface Strategy {
    //https://ravthiru.medium.com/strategy-design-pattern-with-in-spring-boot-application-2ff5a7486cd8
    void doStuff();

    StrategyTypeEnum getStrategyName();

}
