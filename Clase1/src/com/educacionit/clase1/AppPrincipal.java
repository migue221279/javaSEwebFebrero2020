package com.educacionit.clase1;

import java.util.Scanner;

public class AppPrincipal {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hola mundo cruel de java!");
System.out.println("world");

System.out.println("la suma de muchisimos ayeres forman mi pasado");
	
	//ejercicio 1:
	/*
	 * suponga que un individuo desea invertir su capital en un banco
	 * y desea saber cuanto dinero ganara despues de un mes sin el banco le paga a razon de 2%
	 * mensual
	 * 
	 */
double ganancia=0;
double capitalInicial=0;
Scanner teclado=new Scanner(System.in);//defino un Scanner para capturar los datos del teclado
//Solicitamos datos del usuario
System.out.println("por favor eingrese el capital que invertira");
//capturamos el dato
capitalInicial=teclado.nextDouble();
//capturamos la ganancia obtenida
ganancia=capitalInicial*0.02;
//mostramos el total de dinero a retirar
System.out.println("Ud recibira un total de " +(ganancia + capitalInicial) + "pesos");

teclado.close();
}
}



