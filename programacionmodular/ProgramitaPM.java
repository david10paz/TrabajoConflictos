package programacionmodular;

//Importamos la clase Scanner
import java.util.Scanner;

public class ProgramitaPM {
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ejecutarPrograma();

	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void ejecutarPrograma() {
		boolean salir;
		do{
			int opcion = verMenu();
			salir = (opcion == 5);
			Operaciones(opcion);
			

		}while(!salir);
		
		if(salir){
			System.out.println("Saliendo del programa");
		}
		
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static int verMenu() {
		boolean opcionValida;
		int opcion;
		System.out.println();
		System.out.println("MENU");
		System.out.println("1.- Suma");
		System.out.println("2.- Resta");
		System.out.println("3.- Multiplicacion");
		System.out.println("4.- Division");
		System.out.println("5.- Salir");
		System.out.print("Introduce una opcion: ");
		do {
			opcion = entrada.nextInt();
			opcionValida = opcion >= 1 && opcion <= 5;
			
			if (!opcionValida) {
				System.out.print("Error, elija una opcion entre 1 y 5: ");
			}
		}while(!opcionValida);
		
		return opcion;
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void Operaciones(int opcion) {
		
		if(opcion != 5){
			System.out.print("Introduce el operando 1: ");
			double num1 = entrada.nextDouble();
			
			System.out.print("Introduce el operando 2: ");
			double num2 = entrada.nextDouble();
			
			switch(opcion) {
				case 1:
					double suma = calcSuma (num1,num2);
					System.out.println("La suma de " + num1 + " y " + num2 + " es " + suma);
					break;
				
				case 2:
					double resta = calcResta(num1, num2);
					System.out.println("La resta de " + num1 + " menos " + num2 + " es " + resta);
					break;
				case 3:
					double multiplicacion = calcMultiplicacion(num1, num2);
					System.out.println("La multiplicacion de " + num1 + " por " + num2 + " es igual a " + multiplicacion);
					break;
				case 4:
					while (num2 == 0) {
						System.out.println("No es valido el segundo numero como 0, introduce otro numero");
						num2 = entrada.nextDouble();
					}
					double division = calcDivision(num1, num2);
					System.out.println("La division de " + num1 + " entre " + num2 + " es igual a " + division);
					break;
					
			}
		}
		
		
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
	public static double calcSuma(double num1, double num2) {
		return num1 + num2;
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static double calcResta(double num1, double num2) {
		return num1 - num2;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static double calcMultiplicacion(double num1, double num2) {
		return num1 * num2;
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static double calcDivision(double num1, double num2) {
		
		return num1 / num2;
	}
}
