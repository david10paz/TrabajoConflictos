/**
 * 
 */
/**
 * @author luis
 *
 */
package examen1;

import java.util.Scanner;

class NumeroSecreto
{
	public static void main(String args)
	{
		Scanner entrada = new Scanner(System.in);
		int numSecreto = (int) Math.random() * 100 +1;
		int num;
		System.out.println("Introduce un número entre 1 y 100, -1 si te rindes");
		do{
			num = entrada.nextInt();
			if(numSecreto < num)
				System.out.println("es menor");
			else
				System.out.println("es mayor");
			
		}while(numSecreto != num && num != -1);
		if(numSecreto == num)
			System.out.println("has acertado");
		else
			System.out.println("te rendiste");
		
	}
}
