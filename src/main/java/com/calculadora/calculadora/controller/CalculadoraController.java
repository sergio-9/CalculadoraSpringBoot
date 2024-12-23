package com.calculadora.calculadora.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.calculadora.calculadora.CalculadoraApplication;



@RestController
public class CalculadoraController {
    @GetMapping("/calculadora/{a}/{operacion}/{b}")
    public String getMethodName(@PathVariable float a, @PathVariable String operacion, @PathVariable float b) {
        CalculadoraApplication respuesta = new CalculadoraApplication();
        return respuesta.mediador(a, operacion, b);
    }
    
}
