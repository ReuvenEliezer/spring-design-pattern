package com.spring.design.services.strategy;

import org.springframework.stereotype.Component;

@Component
public class StrategyA implements Strategy {
    @Override
    public void doStuff() {
        //implement algorithm A here
    }

    @Override
    public StrategyTypeEnum getStrategyName() {
        return StrategyTypeEnum.StrategyA;
    }
}