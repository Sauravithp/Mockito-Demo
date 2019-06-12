package com.f1soft.mockitodemo.testcases;

import com.f1soft.mockitodemo.MathApp;
import com.f1soft.mockitodemo.service.CalculatorService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MathAppTest {

    @InjectMocks
    MathApp mathApp = new MathApp();

//    @Mock
//    CalculatorService calculatorService;

    CalculatorService calculatorService = mock(CalculatorService.class);

    @Test
    public void testadd() {
        when(calculatorService.add(10,20)).thenReturn(30);
//        when(calculatorService.add(10, 20)).thenAnswer(new Answer<Integer>() {
//
//            @Override
//            public Integer answer(InvocationOnMock invocation) throws Throwable {
//                //get the arguments passed to mock
//                Object[] args = invocation.getArguments();
//
//                //get the mock
//                Object mock = invocation.getMock();
//
//                //return the result
//                return 30;
//            }
//        });
        when(calculatorService.sub(20, 20)).thenReturn(0);
//        doThrow(new RuntimeException("Add operation not implemented"))
//                .when(calculatorService).add(10,20);

        Assert.assertEquals(mathApp.add(10, 20), 30);
        Assert.assertEquals(mathApp.add(10, 20), 30);

//        verify(calculatorService,times(2)).add(10, 20);

        Assert.assertEquals(mathApp.sub(20, 20), 0);


        InOrder inOrder = inOrder(calculatorService);
        inOrder.verify(calculatorService).sub(20, 20);
        inOrder.verify(calculatorService, times(2)).add(10, 20);



    }
}
