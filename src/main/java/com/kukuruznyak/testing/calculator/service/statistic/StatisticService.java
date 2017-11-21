package com.kukuruznyak.testing.calculator.service.statistic;

import com.kukuruznyak.testing.calculator.domain.Operation;

public interface StatisticService {
    void increaseOperation(Operation operation);
    int getStatistic(Operation operation);
}
