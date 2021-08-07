package com.spring.design.services.strategy;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class StrategyTest {

    @Autowired
    private StrategyFactory strategyFactory;

    @Test
    public void strategyTest(){
        Strategy strategy = strategyFactory.findStrategy(StrategyTypeEnum.StrategyA);
        strategy.doStuff();
    }
}
