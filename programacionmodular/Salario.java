package programacionmodular;

import java.util.Scanner;

public class Salario 
{
	static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args)
	{
		final int horas = 38;
		int tarifaOrd = pedirTarifa();
		int empleados = pedirEmpleados();
		calcularSalario(horas, tarifaOrd, empleados);
		
	
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static int pedirTarifa()
	{
		System.out.println("Introduzca la tarifa ordinaria: ");
		int tarifa = entrada.nextInt();
		while(tarifa <= 0) {
			System.out.println("ERROR: La tarifa debe de ser mayor que 0");
			System.out.println("Introduzca una nueva tarifa: ");
			tarifa = entrada.nextInt();
		}
		return tarifa;
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static int pedirEmpleados()
	{
		System.out.println("Introduzca el numero de empleados: ");
		return entrada.nextInt();
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void calcularSalario(int horas, int tarifaOrd, int empleados)
	{
		int horasT = pedirHorasTrabajadas(horas); 
		float salarioB = calcularSalarioBruto(horasT, horas, tarifaOrd);
		float calculoImpuestos = calcularImpuestos(salarioB);
		float salarioN = calcularSalarioNeto(salarioB, calculoImpuestos);
		verResultados(salarioB, calculoImpuestos, salarioN, empleados);
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static int pedirHorasTrabajadas(int horas)
	{
		System.out.println("Introduzca el numero de horas trabajadas: ");
		int horasTrabajadas = entrada.nextInt();
		while(horasTrabajadas < horas) {
			System.out.println("ERROR: El mínimo de horas trabajadas es 38");
			System.out.println("Introduzca de nuevo las horas trabajadas: ");
			horasTrabajadas = entrada.nextInt();
		}
		return horasTrabajadas;
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static float calcularSalarioBruto(int horasT, int horas, int tarifaOrd) 
	{
		float salarioBruto = 0;
		if (horasT == horas)
			salarioBruto = horas * tarifaOrd;
		else
			salarioBruto = (horasT - horas) * (1.5f * tarifaOrd) + (38 * tarifaOrd);
		
		return salarioBruto;
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static float calcularImpuestos(float salarioB)
	{
		float impuestos;
		float tramo1 = salarioB - 600 ;
		float tramo2 = salarioB - 1200;
		float operacion1 = tramo2 + (tramo1 * 0.45f);
		float operacion2 = tramo1 * 0.25f;
		if(salarioB <= 600) {
			impuestos = 0;
		}
		else if (salarioB <= 1200)
			impuestos = operacion2;
		else
			impuestos = operacion1;

		return impuestos;
		
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static float calcularSalarioNeto(float salarioB, float calculoImpuestos) 
	{
		float salarioNeto = salarioB - calculoImpuestos;
		return salarioNeto;
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void verResultados(float salarioB, float calculoImpuestos, float salarioN, int empleados)
	{
		System.out.println("El salario bruto es de: " + salarioB + " euros");
		System.out.println("El salario neto es de: " + salarioN + " euros");
		System.out.println("Los impuestos son: " + calculoImpuestos + " euros");
		System.out.println("El salario bruto de los empleados citados son de:"
				+ " " + salarioB * empleados) ;
		
	}
}
