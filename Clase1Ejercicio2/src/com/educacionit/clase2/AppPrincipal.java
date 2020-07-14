package com.educacionit.clase2;

import java.util.Scanner;

public class AppPrincipal {
public static void main(String[] args) {
	/*un maestro desea saber que porcentajes de hombres y que porcentaje de mujeres tiene dentro de
	 * su grupo de estudios
	 */
	float numHombres= 0,numMujeres= 0,totalDeAlumnos= 0;
	float porcentajeHombre=0,porcentajeMujeres=0;
	Scanner teclado=new Scanner(System.in);
	System.out.println("Ingrese la cantidad de hombres");
	numHombres=teclado.nextFloat();
	System.out.println("Ingrese la cantidad de mujeres");
	numMujeres=teclado.nextFloat();
	totalDeAlumnos=numHombres+numMujeres;
	porcentajeHombre=numHombres*100/totalDeAlumnos;
	porcentajeMujeres=numMujeres*100/totalDeAlumnos;
	System.out.println("el porcentaje de hombres es" + porcentajeHombre + "%");
	System.out.println("el porcentaje de mujeres es" + porcentajeMujeres + "%");

}
}
 