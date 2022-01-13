package EjerciciosNumericos;

import java.util.Scanner;

public class NumerosPrimos {

	static Scanner entrada = new Scanner(System.in);

		static boolean numeroPrimoRecursivo (int numero, int c) {
			
			if (numero % c == 0 && numero !=2)
				return false;
			else if (c> numero/2)
				return true;
			else
				return numeroPrimoRecursivo( numero, c+1);
		}
		
	public static void main(String[]args) {
		
		int numero;
		
		System.out.println("Ingrese un numero");
		numero=entrada.nextInt();
		
		if (numeroPrimoRecursivo (numero, 2))
			System.out.println("El numero es primo");
		else
			System.out.println("El numero no es primo");
	}
		
		
	}


