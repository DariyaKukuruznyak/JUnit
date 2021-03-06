package com.kukuruznyak.testing.calculator.service.statistic.impl;

import com.kukuruznyak.testing.calculator.domain.Operation;
import com.kukuruznyak.testing.calculator.service.statistic.StatisticService;

public class StatisticServiceImpl implements StatisticService {
    private int addOperation;
    private int subtractOperation;
    private int multiplyOperation;
    private int divideOperation;

    public void increaseOperation(Operation operation) {
        switch (operation) {
            case ADD:
                addOperation++;
                break;
            case SUBTRACT:
                subtractOperation++;
                break;
            case MULTIPLY:
                multiplyOperation++;
                break;
            case DIVIDE:
                divideOperation++;
                break;
        }
    }

    public int getStatistic(Operation operation) {
        switch (operation) {
            case ADD:
                return addOperation;
            case SUBTRACT:
                return subtractOperation;
            case MULTIPLY:
                return multiplyOperation;
            case DIVIDE:
                return divideOperation;
            default:
                return 0;
        }
    }
}
