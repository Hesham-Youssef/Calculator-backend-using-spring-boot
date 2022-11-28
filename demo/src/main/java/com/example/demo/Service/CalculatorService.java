package com.example.demo.Service;


import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String evalExp(String expression) {
        String[] operands = expression.split(" ", 0);
        switch (operands[1]) {
            case "+":
                return Double.toString(Double.parseDouble(operands[0]) + Double.parseDouble(operands[2]));
            case "-":
                return Double.toString(Double.parseDouble(operands[0]) - Double.parseDouble(operands[2]));
            case "x":
                return Double.toString(Double.parseDouble(operands[0]) * Double.parseDouble(operands[2]));
            case "÷":
                if(Double.parseDouble(operands[2]) == 0)
                    return "Error";
                return Double.toString(Double.parseDouble(operands[0]) / Double.parseDouble(operands[2]));
            case "sqrt(x)":
                if(Double.parseDouble(operands[0]) < 0)
                    return "Error";
                return Double.toString(Math.sqrt(Double.parseDouble(operands[0])));
            default:
                return "Error";
        }
    }
}
