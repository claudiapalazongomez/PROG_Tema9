package es.studium.ejemplos;

import java.util.Scanner;

public class TercerEjemplo
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		int n;
		System.out.println("Dame un número entero a calcular su Fibonacci: ");
		n = teclado.nextInt();
		teclado.close();
		for(int i= 1; i<=n; i++) {
			System.out.println(fibonacci(i));
		}
	}
	
	public static int fibonacci(int n) {
		int resultado;
		if(n==0) { 
			resultado = 0;
		}
		else if(n==1){
			resultado = 1;
		}
		else {
			resultado = fibonacci(n-1) + fibonacci(n-2);
		}
		return resultado;
	}
}
