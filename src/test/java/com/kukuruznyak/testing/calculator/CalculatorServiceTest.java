
package com.kukuruznyak.testing.calculator;


import com.kukuruznyak.testing.calculator.domain.ComplexObject;
import com.kukuruznyak.testing.calculator.domain.Operation;
import com.kukuruznyak.testing.calculator.domain.Service;
import com.kukuruznyak.testing.calculator.service.counting.CountingService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorServiceTest {
    @Mock
    private CountingService countingService;

    @InjectMocks
    private Calculator calculator;

    @Test
    public void addSameObjects() throws Exception {
        ComplexObject complexObject1 = new ComplexObject(0, 0, Service.CAMSUNG);
        ComplexObject complexObject2 = new ComplexObject(0, 0, Service.CAMSUNG);
        ComplexObject expectedObject = new ComplexObject(0, 0, Service.CAMSUNG);

        Mockito.when(countingService.add(complexObject1, complexObject2)).thenReturn(expectedObject);
        ComplexObject resultObject = calculator.operate(complexObject1, complexObject2, Operation.ADD);
        Assert.assertEquals(expectedObject, resultObject);
        Mockito.verify(countingService, Mockito.times(1)).add(complexObject1, complexObject2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addDifferentObjects() throws Exception {
        ComplexObject complexObject1 = new ComplexObject(0, 0, Service.CAMSUNG);
        ComplexObject complexObject2 = new ComplexObject(0, 0, Service.HAPPLE);
        calculator.operate(complexObject1, complexObject2, Operation.ADD);
    }

    @Test
    public void subtractSameObjects() throws Exception {
        ComplexObject complexObject1 = new ComplexObject(0, 0, Service.CAMSUNG);
        ComplexObject complexObject2 = new ComplexObject(0, 0, Service.CAMSUNG);
        ComplexObject expectedObject = new ComplexObject(0, 0, Service.CAMSUNG);

        Mockito.when(countingService.subtract(complexObject1, complexObject2)).thenReturn(expectedObject);
        ComplexObject resultObject = calculator.operate(complexObject1, complexObject2, Operation.SUBTRACT);
        Assert.assertEquals(expectedObject, resultObject);
        Mockito.verify(countingService, Mockito.times(1)).subtract(complexObject1, complexObject2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void subtractDifferentObjects() throws Exception {
        ComplexObject complexObject1 = new ComplexObject(0, 0, Service.CAMSUNG);
        ComplexObject complexObject2 = new ComplexObject(0, 0, Service.HAPPLE);
        calculator.operate(complexObject1, complexObject2, Operation.SUBTRACT);
    }

    @Test
    public void divideSameObjects() throws Exception {
        ComplexObject complexObject1 = new ComplexObject(0, 0, Service.CAMSUNG);
        ComplexObject complexObject2 = new ComplexObject(0, 0, Service.CAMSUNG);
        ComplexObject expectedObject = new ComplexObject(0, 0, Service.CAMSUNG);

        Mockito.when(countingService.divide(complexObject1, complexObject2)).thenReturn(expectedObject);
        ComplexObject resultObject = calculator.operate(complexObject1, complexObject2, Operation.DIVIDE);
        Assert.assertEquals(expectedObject, resultObject);
        Mockito.verify(countingService, Mockito.times(1)).divide(complexObject1, complexObject2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void divideDifferentObjects() throws Exception {
        ComplexObject complexObject1 = new ComplexObject(0, 0, Service.CAMSUNG);
        ComplexObject complexObject2 = new ComplexObject(0, 0, Service.HAPPLE);
        calculator.operate(complexObject1, complexObject2, Operation.DIVIDE);
    }

    @Test
    public void multiplySameObjects() throws Exception {
        ComplexObject complexObject1 = new ComplexObject(0, 0, Service.CAMSUNG);
        ComplexObject complexObject2 = new ComplexObject(0, 0, Service.CAMSUNG);
        ComplexObject expectedObject = new ComplexObject(0, 0, Service.CAMSUNG);

        Mockito.when(countingService.multiply(complexObject1, complexObject2)).thenReturn(expectedObject);
        ComplexObject resultObject = calculator.operate(complexObject1, complexObject2, Operation.MULTIPLY);
        Assert.assertEquals(expectedObject, resultObject);
        Mockito.verify(countingService, Mockito.times(1)).multiply(complexObject1, complexObject2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void multiplyDifferentObjects() throws Exception {
        ComplexObject complexObject1 = new ComplexObject(0, 0, Service.CAMSUNG);
        ComplexObject complexObject2 = new ComplexObject(0, 0, Service.HAPPLE);
        calculator.operate(complexObject1, complexObject2, Operation.MULTIPLY);
    }
}

