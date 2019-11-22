package programacionmodular;

import java.util.Scanner;

public class PotenciaRecursivo {

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
		
		if (exponente == 0)
			return 1;
		else
			return base * calcularPotencia (base, exponente - 1);
		}
	/////////////////////////////////////////////////
	
	public static void verResultado(int base, int exponente, int resultado) {
		System.out.println("La potencia de " + base + " con exponente " + exponente + " es " + resultado);
	}

}
