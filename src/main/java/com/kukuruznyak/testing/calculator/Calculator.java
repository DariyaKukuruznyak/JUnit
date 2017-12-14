package com.kukuruznyak.testing.calculator;

import com.kukuruznyak.testing.calculator.domain.ComplexObject;
import com.kukuruznyak.testing.calculator.domain.Operation;
import com.kukuruznyak.testing.calculator.domain.Service;
import com.kukuruznyak.testing.calculator.service.counting.CountingService;
import com.kukuruznyak.testing.calculator.service.counting.impl.CountingServiceImpl;
import com.kukuruznyak.testing.calculator.service.statistic.StatisticService;
import com.kukuruznyak.testing.calculator.service.statistic.impl.StatisticServiceImpl;
import com.kukuruznyak.testing.calculator.service.validation.ValidationService;
import com.kukuruznyak.testing.calculator.service.validation.impl.CamsungValidationServiceImpl;
import com.kukuruznyak.testing.calculator.service.validation.impl.HappleValidationServiceImpl;
import com.kukuruznyak.testing.calculator.service.validation.impl.SaimensValidationServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private CountingService countingService = new CountingServiceImpl();
    private StatisticService statisticService = new StatisticServiceImpl();
    private final Map<Service, ValidationService> validationServiceMap = new HashMap<Service, ValidationService>();

    public Calculator() {
        validationServiceMap.put(Service.CAMSUNG, new CamsungValidationServiceImpl());
        validationServiceMap.put(Service.HAPPLE, new HappleValidationServiceImpl());
        validationServiceMap.put(Service.SAIMENS, new SaimensValidationServiceImpl());
    }

    public void setCountingService(CountingService countingService) {
        this.countingService = countingService;
    }

    public ComplexObject operate(ComplexObject param1, ComplexObject param2, Operation operation) {
        ComplexObject resultObject;
        validate(param1, param2);
        switch (operation) {
            case ADD:
                resultObject = countingService.add(param1, param2);
                statisticService.increaseOperation(Operation.ADD);
                break;
            case SUBTRACT:
                resultObject = countingService.subtract(param1, param2);
                statisticService.increaseOperation(Operation.SUBTRACT);
                break;
            case MULTIPLY:
                resultObject = countingService.multiply(param1, param2);
                statisticService.increaseOperation(Operation.MULTIPLY);
                break;
            case DIVIDE:
                resultObject = countingService.divide(param1, param2);
                statisticService.increaseOperation(Operation.DIVIDE);
                break;
            default:
                resultObject = new ComplexObject();
                break;
        }
        statisticService.increaseOperation(operation);
        resultObject.setService(param1.getService());
        return resultObject;
    }

    private void validate(ComplexObject param1, ComplexObject param2) {
        if (!param1.getService().equals(param2.getService())) {
            throw new IllegalArgumentException("The services of objects are different");
        }
        validationServiceMap.get(param1.getService()).validateValues(param1);
        validationServiceMap.get(param2.getService()).validateValues(param2);
    }
}
