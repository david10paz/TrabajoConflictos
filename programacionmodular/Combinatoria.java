package programacionmodular;

import java.util.Scanner;

public class Combinatoria 
{

	public static void main(String[] args) 
	{
		int elementos = pedirElementos();
		int combinaciones = pedirCombinaciones();
		int factorialE = calcularFactorialE(elementos);
		int factorialC = calcularFactorialC(combinaciones);
		int resta = calculoResta(factorialE, factorialC);
		int restaFactorial = calculoRestaFactorial(resta);
		int resultadoComb = calculoComb(factorialE, factorialC, restaFactorial); 
		verResultado(elementos, combinaciones, resultadoComb);

	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static int pedirElementos()
	{
		Scanner entrada = new Scanner (System.in);
		System.out.println("introduzca el numero de elementos: ");
		return entrada.nextInt();
		
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static int pedirCombinaciones()
	{
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduzca el numero de combinaciones: ");
		return entrada.nextInt();
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static int calcularFactorialE(int elementos)
	{
		do {
			if(elementos == 0)
				return 1;
			else
				return elementos * calcularFactorialE(elementos - 1);
		}while(elementos >= 0);
		
		
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static int calcularFactorialC(int combinaciones)
	{
		do {
			System.out.println("Error introduce un numero positivo");
			
		}while(combinaciones >= 0);
		
		if(combinaciones == 0)
			return 1;
		else
			return combinaciones * calcularFactorialC(combinaciones - 1);
		
		 
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static int calculoResta(int factorialE, int factorialC)
	{
		int calcResta = factorialE - factorialC;
		return calcResta;
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static int calculoRestaFactorial(int calcResta)
	{
		if(calcResta == 0)
			return 1;
		else
			return calcResta * calculoRestaFactorial(calcResta - 1);
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static int calculoComb(int factorialE, int factorialC, int restaFactorial)
	{
		int resultado = (factorialE / factorialC * restaFactorial);
		return resultado;
	}
	public static void verResultado(int elementos, int combinaciones, int resultadoComb)
	{
		System.out.println("Las combinaciones de " + elementos + " elementos, tomados de " + combinaciones + " en " + combinaciones + " son: " + resultadoComb);
	}
}
