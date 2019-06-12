package com.f1soft.mockitodemo.service;

import org.springframework.stereotype.Service;

@Service
public interface CalculatorService {
    int add(int i,int j);
    int sub(int i,int j);
}
