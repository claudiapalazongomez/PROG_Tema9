package es.studium.ejemplos;

import java.util.Scanner;

public class PrimerEjemplo
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		int n, resultado;
		System.out.println("Dame el número entero a calcular su sumatorio: ");
		n = teclado.nextInt();
		teclado.close();
		resultado = sumatorio(n);
		System.out.println(resultado);
	}

	public static int sumatorio(int n) {
		int r;
		if(n==1) {
			r = 1;
		}
		else {
			r = n + sumatorio(n-1);
		}
		return r;
	}	
}
