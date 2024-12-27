package com.calculadora.calculadora.controller;

import org.springframework.web.bind.annotation.RestController;

import com.calculadora.calculadora.Operacio;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;




@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
    @PostMapping("path")
    public String postMethodName(@RequestBody Operacio operation) {
        String operationSTR = operation.getOperation();
        System.out.println(operationSTR);
        return operationSTR;
    }
}
