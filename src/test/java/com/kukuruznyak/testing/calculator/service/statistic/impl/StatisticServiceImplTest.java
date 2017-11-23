package com.kukuruznyak.testing.calculator.service.statistic.impl;

import com.kukuruznyak.testing.calculator.domain.Operation;
import com.kukuruznyak.testing.calculator.service.statistic.StatisticService;
import org.junit.Assert;
import org.junit.Test;

public class StatisticServiceImplTest {
    private StatisticService statisticService = new StatisticServiceImpl();

    @Test
    public void increaseOperationAdd() throws Exception {
        int expectedNumber = 1;
        statisticService.increaseOperation(Operation.ADD);
        int resultNumber = statisticService.getStatistic(Operation.ADD);
        Assert.assertEquals(expectedNumber, resultNumber);
    }

    @Test
    public void increaseOperationSubtract() throws Exception {
        int expectedNumber = 1;
        statisticService.increaseOperation(Operation.SUBTRACT);
        int resultNumber = statisticService.getStatistic(Operation.SUBTRACT);
        Assert.assertEquals(expectedNumber, resultNumber);
    }

    @Test
    public void increaseOperationMultiply() throws Exception {
        int expectedNumber = 1;
        statisticService.increaseOperation(Operation.MULTIPLY);
        int resultNumber = statisticService.getStatistic(Operation.MULTIPLY);
        Assert.assertEquals(expectedNumber, resultNumber);
    }

    @Test
    public void increaseOperationDivide() throws Exception {
        int expectedNumber = 1;
        statisticService.increaseOperation(Operation.DIVIDE);
        int resultNumber = statisticService.getStatistic(Operation.DIVIDE);
        Assert.assertEquals(expectedNumber, resultNumber);
    }

}