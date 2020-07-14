package com.educacionit.ejercicioifelse;

import java.util.Scanner;

public class AppPrincipal {
	/*Ejercicio3:
	Un obrero necesita calcular sus salario mensual, el cual se obtiene de la siguiente manera:
	si trabaja 40hs o menos se le paga $16 por hora
	si trabaja mas de 40 hs se le paga $16 por cada una de las 40hs y $20 por cada hora extra
	*/
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		int hsTrabajadas=0,hsExtras=0,salarioSemanal=0;
		System.out.println("Por favor ingrese la cantidad de horas trabajadas");

		
		hsTrabajadas=teclado.nextInt();
		if(hsTrabajadas>40) {
			hsExtras=hsTrabajadas-40;
			salarioSemanal=hsExtras*20+40*16;
		
		}else {
			salarioSemanal=hsTrabajadas*16;
		}	
		
		System.out.println("Su salario semanal es de " + salarioSemanal);
		teclado.close();
		
	}
	

}
