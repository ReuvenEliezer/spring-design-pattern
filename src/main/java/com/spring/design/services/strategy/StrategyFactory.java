package com.spring.design.services.strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StrategyFactory {
    private Map<StrategyTypeEnum, Strategy> strategies;

    @Autowired
    public StrategyFactory(Set<Strategy> strategySet) {
        //createStrategy(strategySet);
        strategies = new HashMap<>();
        strategySet.forEach(
                strategy -> strategies.put(strategy.getStrategyName(), strategy));
    }

    public Strategy findStrategy(StrategyTypeEnum strategyName) {
        return strategies.get(strategyName);
    }

}