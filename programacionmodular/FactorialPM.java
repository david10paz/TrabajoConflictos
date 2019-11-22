package programacionmodular;

import java.util.Scanner;

public class FactorialPM {

	public static void main(String[] args) {
		
		int numero = pedirNumero();
		int factorial = darFactorial(numero);
		verResultado(numero, factorial);
	}
	//////////////////////////////////////////////////////////////
	public static int pedirNumero () {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce el numero");
		return entrada.nextInt();
	}
	/////////////////////////////////////////////////////////////
	public static int darFactorial (int numero) {
		int factorial= 1;
		for (int i=1 ; i<= numero ; i++)
			factorial = factorial * i;
		return factorial;
	}
	///////////////////////////////////////////////////////////
	public static void verResultado (int numero, int factorial) {
		System.out.println("El factorial de " + numero + " es " + factorial);
	}

}
