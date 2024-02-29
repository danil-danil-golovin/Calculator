package com.example.Calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String greating() {
        return "Добро пожаловать в калькулятор";
    }

    private boolean noNullConfirmed(Float one, Float two) {
        return one != null || two != null;
    }

    public String nullMessage() {
        return "Одно из введённых значений выражения пустое. Для расчёта нужны два значения переменных";
    }

    public String divisorZeroMessage() {
        return "Значение делителя равен нулю. На ноль делить нельзя";
    }

    public String goingBeyond() {
        return "Выход за пределы допустимого значения переменной";
    }


    public Float plus(Float one, Float two) {
        if (noNullConfirmed(one, two)) {
            return (one + two);
        }
            throw new IllegalArgumentException(nullMessage());
        }



    public Float minus(Float one, Float two) {
        if (noNullConfirmed(one, two)) {
            return (one - two);
        }
            throw new IllegalArgumentException(nullMessage());
        }


    public Float multiply(Float one, Float two) {
        if (noNullConfirmed(one, two)) {
                return (one * two);
            }
            throw new IllegalArgumentException(nullMessage());
        }



    public Float divide(Float one, Float two) {
        if (one == null || two == null) {
            throw new IllegalArgumentException(nullMessage());
        }
        if (two == 0) {
            throw new IllegalArgumentException(divisorZeroMessage());
        }
            return (one / two);
        }
    }





