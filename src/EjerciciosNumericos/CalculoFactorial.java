package EjerciciosNumericos;

import java.util.Scanner;

public class CalculoFactorial {
		
		static Scanner entrada = new Scanner(System.in);
		
		static int FactorialNoRecursivo (int n)
		{
			int fac = 1;
			
			for(int i=1; i<= n; i++)
				fac = fac * i;
			return fac;
		}
		
		public static void main(String[]args) {
			
			int numero;
			
			for (int x = 1; x<=10; x++) {
				System.out.println("Ingrese el numero: ");
				numero = entrada.nextInt();
				
				System.out.println("\n El factorial del numero es: \n" + FactorialNoRecursivo(numero));
			}

	}

}
