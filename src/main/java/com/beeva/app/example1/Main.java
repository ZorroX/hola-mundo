package com.beeva.app.example1;

import org.beeva.com.calculadora.Calculadora;

public class Main {

	public static void main(String[] args) {
		String operacion= new String(args[0]);
		Integer a= new Integer(args[1]);
		Integer b= new Integer(args[2]);
		Calculadora calc = CalculadoraInstance.getInstance();
		int resultado;
		if (operacion.equals("suma")){
			resultado=calc.suma(a,b);			
		}
		else {
			resultado=calc.resta(a,b);
		}
		System.out.println(resultado);

	}

}
