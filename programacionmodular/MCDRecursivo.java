package programacionmodular;

import java.util.Scanner;

public class MCDRecursivo{

	public static void main(String[] args) {
		
		int num1 = pedirNumero1();
		int num2 = pedirNumero2();
		int calculo = calculoMCD(num1, num2);
		verResultado (num1, num2, calculo);
	}
	////////////////////////////////////////////
	public static int pedirNumero1() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer numero: ");
		return entrada.nextInt();
	}
	///////////////////////////////////////////
	public static int pedirNumero2() {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce el segundo numero: ");
		return entrada.nextInt();
	}
	///////////////////////////////////////////
	public static int calculoMCD(int num1, int num2) {
		
		if (num1 == num2)
			return num1;
		else if (num1 > num2)
			return calculoMCD(num1 - num2, num2);
		else
			return calculoMCD(num1, num2 - num1);
			
	}
	///////////////////////////////////////////////
	public static void verResultado(int num1, int num2, int calculo) {
		System.out.println("El MCD de " + num1 + " y de " + num2 + " es " + calculo);
	}
}