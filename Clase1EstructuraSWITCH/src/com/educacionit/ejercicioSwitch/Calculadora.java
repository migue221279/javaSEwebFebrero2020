package com.educacionit.ejercicioSwitch;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
int numeroUno=0,numeroDos=0, resultado=0,opcionIngresada=0;
Scanner teclado=new Scanner(System.in);
System.out.println("Welcome to App");
System.out.println("Que operacion aritmetica desea realizar");
System.out.println("1.SUMAR\n 2.RESTAR \n3.MULTIPLICAR \n4.DIVIDIR");
opcionIngresada=teclado.nextInt();
switch(opcionIngresada) {
case 1:
	System.out.println("Usted selecciono la suma ");
	System.out.println("Ingrese el numero 1");
	numeroUno=teclado.nextInt();
	System.out.println("Ingrese el numero 2");
	numeroDos=teclado.nextInt();
	resultado=numeroUno+numeroDos;
	System.out.println("El resultado es " + resultado);
	break;
case 2:
	System.out.println("Usted selecciono la resta");
	System.out.println("Ingrese el numero 1");
	numeroUno=teclado.nextInt();
	System.out.println("Ingrese el numero 2");
	numeroDos=teclado.nextInt();
	resultado=numeroUno-numeroDos;
	System.out.println("El resultado es " + resultado);

	break;
case 3:
	System.out.println("Usted selecciono la multiplicacion");
	System.out.println("Ingrese el numero 1");
	numeroUno=teclado.nextInt();
	System.out.println("Ingrese el numero 2");
	numeroDos=teclado.nextInt();
	resultado=numeroUno*numeroDos;
	System.out.println("El resultado es " + resultado);

		break;
case 4:
	System.out.println("Usted selecciono la division");
	System.out.println("Ingrese el numero 1");
	numeroUno=teclado.nextInt();
	System.out.println("Ingrese el numero 2");
	numeroDos=teclado.nextInt();
	resultado=numeroUno/numeroDos;
	System.out.println("El resultado es " + resultado);

	break;
	default:
		System.out.println("La opcion ingresada es incorrecta");
		break;
}
	}

}
