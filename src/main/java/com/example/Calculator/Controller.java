package com.example.Calculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/calculator")
public class Controller {
    private final CalculatorService calculatorService;

    public Controller(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/calcul")
    public String greetings() {
        return calculatorService.greating();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam(value = "a", required = false) Float one, @RequestParam(value = "b", required = false) Float two) {
        return one + " + " + two + " = " + calculatorService.plus(one, two);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam(value = "a", required = false) Float one, @RequestParam(value = "b", required = false) Float two) {
        return one + " - " + two + " = " + calculatorService.minus(one, two);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(value = "a", required = false) Float one, @RequestParam(value = "b", required = false) Float two) {
        return one + " * " + two + " = " + calculatorService.multiply(one, two);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam(value = "a", required = false) Float one, @RequestParam(value = "b", required = false) Float two) {
        return one + " / " + two + " = " + calculatorService.divide(one, two);
    }
}




