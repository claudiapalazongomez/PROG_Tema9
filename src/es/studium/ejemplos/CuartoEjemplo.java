package es.studium.ejemplos;

import java.util.Scanner;

public class CuartoEjemplo
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		int n;
		do {
		System.out.println("Dame un número entero a calcular su Sucesión: ");
		n = teclado.nextInt();
		} while(n<1);
		teclado.close();
		sucesion(n-1);
	}

	private static void sucesion(int n)
	{
		if(n==0) {
			System.out.println("1.5");
		}
		else {
			sucesion(n-1);
			System.out.println((float)(n+3)/(float)2);
		}
	}

}
