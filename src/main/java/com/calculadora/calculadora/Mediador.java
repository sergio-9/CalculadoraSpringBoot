package com.calculadora.calculadora;

public class Mediador {


    public static String mediador(float a, String operacion, float b){
		OperacionesBasicas operador = new OperacionesBasicas();
		float resp = 0;
		if(operacion.equals("suma")){
			resp = operador.suma(a, b);
		}else if (operacion.equals("resta")) {
			resp = operador.resta(a, b);
		}else if (operacion.equals("multiplicacion")) {
			resp = operador.mult(a, b);
		}else if (operacion.equals("division")) {
			resp = operador.div(a, b);
		}else if (operacion.equals("modulo")) {
			resp = operador.mod(a, b);
		}
		return String.valueOf(resp);
	}
}
