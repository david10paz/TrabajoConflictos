package programacionmodular;

import java.util.Scanner;

public class BaseInferior
{
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		//aplicacion para pasar un numero de base 10 a base 2
		arrancarAplicacion();
	}
	/////////////////////////////////////////////////////
	public static void arrancarAplicacion()
	{
		int numero = pedirNum();
		int base = pedirBase(numero);
		cambioBase(numero, base);
	}
	//////////////////////////////////////////////////////
	public static int pedirNum()
	{
		boolean numValido;
		int num;
		System.out.println("Introduce un numero: ");
		do{
			num = entrada.nextInt();
			numValido = (num > 0);
			if(!numValido)
				System.err.println("Error introduce un numero valido, mayor que 0");
			
		}while(!numValido);
		return num;
	}
	//////////////////////////////////////////////////////
	private static int pedirBase(int num)
	{
		boolean baseValida;
		int base = 0;
		System.out.println("Introduce la base: ");
		base = entrada.nextInt();
		if(num <= base)
		{
			System.out.println(num);
			return num;
		}
			
		
		else 
			do {
				base = entrada.nextInt();
				
				
				baseValida = (num >= base);
				
				if(!baseValida)
					System.err.println("Introduce una base valida. ");
				
			}while(!baseValida);	
		
		return base;
	}
	/////////////////////////////////////////////////////
	private static void cambioBase(int numero, int base)
	{
		if(numero < base)
			System.out.print(numero + " ");
		else
		{
			cambioBase(numero / base,base);
			System.out.print(numero % base + " ");
		}	
	}
}
