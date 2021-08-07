package com.spring.design.services.strategy;

import org.springframework.stereotype.Component;

@Component
public class StrategyB implements Strategy {
    @Override
    public void doStuff() {
        //implement algorithm B here
    }

    @Override
    public StrategyTypeEnum getStrategyName() {
        return StrategyTypeEnum.StrategyB;
    }
}
