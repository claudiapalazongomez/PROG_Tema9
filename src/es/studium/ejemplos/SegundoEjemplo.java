package es.studium.ejemplos;

import java.util.Scanner;

public class SegundoEjemplo
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		int n, resultado;
		System.out.println("Dame el número entero a calcular su factorial: ");
		n = teclado.nextInt();
		teclado.close();
		resultado = factorial(n);
		System.out.println(resultado);

	}
	
	public static int factorial(int n) {
		int r;
		if(n==1) {
			r = 1;
		}
		else {
			r = n * factorial(n-1);
		}
		return r;
	}	
}
