package examen1;

public class NumeroPrimo 
{

	public static void main(String[] args) 
	{
		
			int num = 7;
			
			if(esPrimo(num))
				System.out.println(num + " es primo");
			else
				System.out.println(num + " no es primo");
	}
		
		//////////////////////////////////////////////////////
		public static boolean esPrimo(int num)
		{
			for(int div = 2; div <= num/2; div++)
			{
				if(num % div == 0 )
					return false;
			}
			
			return true;
		}

}


