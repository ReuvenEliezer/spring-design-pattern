//package com.spring.design.services.strategy;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class StrategyService {
//
//    @Autowired
//    private StrategyFactory strategyFactory;
//
//    public void findSome(StrategyTypeEnum strategyTypeEnum) {
//
//        // Now get the strategy by passing the name
//        Strategy strategy = strategyFactory.findStrategy(strategyTypeEnum);
//        // you can now call the methods defined in strategy.
//        strategy.doStuff();
//    }
//}
