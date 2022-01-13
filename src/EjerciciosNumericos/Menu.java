package EjerciciosNumericos;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
		
		boolean salir = false;
		int opcion;
		
        while (!salir) {
        	
        	System.out.println("1. Generar numero aleatorio"); 
			System.out.println("2. sumar 2 numeros");
			System.out.println("3. Salir");
			
			System.out.println("Introduce el numero de una opcion: ");
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.println("Esta es la opcion #1. Generar numeros aleatorios");   
				int menor = 1000, numero;
				for (int i = 0; i < 100; i++) {
					numero = (int) (Math.random()*(1000+1));
					System.out.println(numero+ ", ");
					
					if (numero < menor)
						menor = numero;}
				System.out.println("\n\n El menor de los numeros aleatorios es : "+menor);
					
				
				break;
				
			case 2:
				System.out.println("Esta es la opcion #2 sumar 2 numeros");
				float num1, num2, suma;
				System.out.println("Ingresa un numero");
				num1=sc.nextFloat();
				System.out.println("Ingresa un numero");
				num2=sc.nextFloat();		
				suma=num1+num2;
				System.out.println("El resultado de la suma es de: "+suma);
				
				break;
				
			case 3:
				 salir=true;
	 				break;
	 				default:
	 					System.out.println("Las  opciones son entre 1 y 3");
					
				}

	}
        
}
}

