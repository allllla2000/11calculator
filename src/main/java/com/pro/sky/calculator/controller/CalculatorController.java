package com.pro.sky.calculator.controller;

import com.pro.sky.calculator.service.CalculatorServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorServiceImpl calculatorService;

    public CalculatorController(CalculatorServiceImpl calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String Hello () {

        return "Добро пожаловать в калькулятор";
    }
    @GetMapping("/plus")
    public String plus (@RequestParam(required = false) Double num1, @RequestParam(required = false) Double num2) {
        //double plusResult = num1 + num2;
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Введены не все параметры");
        }
        return num1 + " + " + num2 + " = " + calculatorService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus (@RequestParam double num1, @RequestParam double num2) {

        return num1 + " - " + num2 + " = " + calculatorService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply (@RequestParam double num1, @RequestParam double num2) {
        return num1 + " * " + num2 + " = " + calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide (@RequestParam double num1, @RequestParam double num2) {

           return num1 + " / " + num2 + " = " + calculatorService.divide(num1, num2);

    }


}
