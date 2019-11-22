package programacionmodular;

import java.util.Scanner;

public class FalctorialRecursivo {

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
	///////////////////////////////////////////////////////////
	public static void verResultado (int numero, int factorial) {
		System.out.println("El factorial de " + numero + " es " + factorial);
	}
	/////////////////////////////////////////////////////////////
	public static int darFactorial (int numero) {
		
		if (numero == 0)
			return 1;
		else
			return numero * darFactorial (numero - 1);
	}
	

}
