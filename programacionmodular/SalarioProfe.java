package programacionmodular;

import java.util.Scanner;

public class SalarioProfe {

	 static Scanner entrada = new Scanner (System.in);
	
	public static void main(String[] args) 
	{
		arrancarAplicacion();
	}
	////////////////////////////////////////////////
	public static void arrancarAplicacion()
	{
		int emp = pedirEmpleados();
		double tarifa = pedirTarifa();
		calcSalario(emp,tarifa);
	}
	////////////////////////////////////////////////
	public static int pedirEmpleados()
	{
		int emp;
		System.out.println("Introduce el numero de empleados: ");
		do
		{
			emp = entrada.nextInt();
			if(emp <= 0)
				System.err.println("EL numero de empleados tiene que ser mayor que 0.");
		}while(emp <= 0);
		return emp;
	}
	///////////////////////////////////////////////
	public static double pedirTarifa()
	{
		double tarifa;
		System.out.println("Introduce la tarifa ordinaria:");
		do {
			tarifa = entrada.nextDouble();
			
			if(tarifa <= 0)
				System.err.println("La tarifa no puede ser 0");
		}while(tarifa <= 0);
		return tarifa;
	}
	/////////////////////////////////////////////////
	public static void calcSalario(int emp, double tarifa)
	{
		for(int i = 1; i <= emp; i++)
		{
			System.out.println("Empleado " + i);
			int horasTrabajadas = pedirHoras();
			double salBruto = calcSalBruto(tarifa,horasTrabajadas);
			double impuestos = calcImpuestos(salBruto);
			double neto = salBruto - impuestos;
			verResultados(salBruto, impuestos, neto);
		}
	}
	//////////////////////////////////////////////////
	public static int pedirHoras()
	{
		int horas;
		System.out.println("Introduce las horas trabajadas: ");
		
		do {
			horas = entrada.nextInt();
			
			if(horas < 38)
				System.out.println("Las horas tienen que ser 38 o mas");
		}while(horas < 38);
		return horas;
	}
	/////////////////////////////////////////////////////
	public static double calcSalBruto(double tarifa, int horasTrabajadas)
	{
		//declaramos una constante
		final double salarioFijo = 38 * tarifa;
		int horasExtras = horasTrabajadas - 38;
		double bruto = (horasExtras * 1.5) + salarioFijo;
		return bruto;
	}
	/////////////////////////////////////////////////////////////
	public static double calcImpuestos(double bruto)
	{
		final double tramo1 = (bruto - 600);
		final double tramo2 = (bruto - 1200);
		
		double impuestos;
		
		if(bruto <= 600)
			impuestos = 0;
		else if (bruto <= 1200)
			impuestos = tramo1 * 0.25;
		else
			impuestos = 600 * 0.25 + tramo2 * 0.45;
	
		return impuestos;
			
		}
	//////////////////////////////////////////////////////
	public static void verResultados(double salBruto, double impuestos, double neto)
	{
		System.out.println("El salario bruto es: " + salBruto);
		System.out.println("Impuestos: " + impuestos);
		System.out.println("El salario neto es: " + neto);
	}
	}
