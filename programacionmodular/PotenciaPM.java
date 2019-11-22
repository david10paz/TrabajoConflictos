package programacionmodular;

import java.util.Scanner;

public class PotenciaPM {

	public static void main(String[] args) {
		
		int base = pedirBase();
		int exponente = pedirExponente();
		int resultado = calcularPotencia(base, exponente);
		verResultado(base, exponente, resultado);
	}
	/////////////////////////////////////////////////
	public static int pedirBase() {
		Scanner entrada = new Scanner (System.in);
		System.out.println("La base es: ");
		return entrada.nextInt();
		}
	/////////////////////////////////////////////////
	public static int pedirExponente() {
		Scanner entrada = new Scanner (System.in);
		System.out.println("El exponente es: ");
		return entrada.nextInt();
		}
	/////////////////////////////////////////////////
	public static int calcularPotencia (int base, int exponente) {
		int resultado = 1;
		for (int i = 1 ; i <= exponente ; i++) {
			resultado = resultado * base;
		}
		return resultado;
	/////////////////////////////////////////////////
	}
	public static void verResultado(int base, int exponente, int resultado) {
		System.out.println("La potencia de " + base + " con exponente " + exponente + " es " + resultado);
	}

}
