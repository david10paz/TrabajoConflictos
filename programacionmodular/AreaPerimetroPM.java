/*
 * Paso de parametros: Cuando invocamos a un método o a una función los parametros se pueden pasar por valor o por referecia
 *	 La diferecia reside es que cuando pasamos por valor lo que enviamos a la funcion es una copia de los parametros actuales o originales
 * 		El paso por referencia consiste en pasar en lugar de una copia las direcciones de memoria de los parametros originales o actuales
 * 			En este caso si se puede modificar la variables originales
 * 				En java los datos primitivos: char, float, int,... se pasan siempre por valor, y los objetos se pasan por referencia
 */

package programacionmodular;

//Importamos la clase Scanner
import java.util.Scanner;
public class AreaPerimetroPM
{
	/*Este programa introduce por teclado 
	  dos numeros que representan la base y la altura
	  que daran resultado al area y al perimetro del problema */
	  
	  public static void main(String args[])
	{
		double base = pedirBase();
		double altura = pedirAltura();
		double area = calcularArea(base, altura);
		double perimetro = calcularPerimetro(base, altura);
		verResultado(area, perimetro);
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static double pedirBase()
	{
		//Creamos un objeto tipo Scanner
		Scanner entrada = new Scanner (System.in);
				
		//Introducimos por teclado los numeros que daran la base y la altura
		System.out.println("La base es: ");
		return entrada.nextDouble();
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static double pedirAltura()
	{
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("La altura es: ");
		return entrada.nextDouble();	
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static double calcularArea(double base, double altura)
	{
		return base * altura;
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static double calcularPerimetro(double base, double altura)
	{
		return 2 * (base * altura);
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void verResultado(double area, double perimetro)
	{
		//Enviamos a la pantalla el resultado del area
				System.out.println("El area es: " + area);
				
				//Enviamos a la pantalla el resultado del perimetro
				System.out.println("El perimetro es: " + perimetro);
	}
}

