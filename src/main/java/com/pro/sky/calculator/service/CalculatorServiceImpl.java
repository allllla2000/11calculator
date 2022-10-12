package com.pro.sky.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public double plus(double a, double b) {
        return a + b;
    }

    @Override
    public double minus(double a, double b) {
        return a - b;
    }

    @Override
    public double divide(double a, double b) {
        if (b == 0) throw new IllegalArgumentException("На ноль делить нельзя");
        return a / b;

    }

    @Override
    public double multiply(double a, double b) {

        return a * b;
    }
}
