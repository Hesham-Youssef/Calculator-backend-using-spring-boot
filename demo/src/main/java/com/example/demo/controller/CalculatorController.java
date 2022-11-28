package com.example.demo.controller;


import com.example.demo.Service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.script.ScriptException;
import java.io.Serializable;



@RestController
@CrossOrigin
public class CalculatorController implements Serializable {

    private final CalculatorService calc;

    @Autowired
    CalculatorController(CalculatorService calc){
        this.calc = calc;
    }

    @GetMapping("/{expression}")
    public String expGetter(@PathVariable String expression) throws ScriptException {
        System.out.println(expression);
        return calc.evalExp(expression);
    }


}
