package com.f1soft.mockitodemo;

import com.f1soft.mockitodemo.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;

public class MathApp {

    @Autowired
    CalculatorService calculatorService;

    public int add(int i,int j){
        return calculatorService.add(i,j);
    }

    public int sub(int i,int j){
        return calculatorService.sub(i,j);
    }
}
