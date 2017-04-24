package com.beeva.app.example1;

import org.beeva.com.calculadora.Calculadora;

public class CalculadoraInstance {
private static Calculadora calculadora = new Calculadora();
private CalculadoraInstance(){
	
}
public static Calculadora getInstance(){
	if(calculadora == null){
		calculadora=new Calculadora(); 
	}
		return calculadora;	
	
	
}
}
