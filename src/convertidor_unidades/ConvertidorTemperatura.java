package convertidor_unidades;

import java.util.Scanner;

public class ConvertidorTemperatura {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		boolean salir = false;
		int opcion;
		
		while (!salir) {
			

			System.out.println("1. Convertir de celsius a farenheit");
			System.out.println("2. Convertir de farenheit a celsius");
			System.out.println("3. Convertir de celsius a kelvin");
			System.out.println("4. Convertir de kelvin a celsius");
			System.out.println("5. Convertir de farenheit a kelvin");
			System.out.println("6. Convertir de kelvin a farenheit");
			System.out.println("7. Salir");
			
			System.out.println("Introduce el numero de una opcion: ");
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.println("Esta es la opcion #1. Convertir de celsius a farenheit");
				int celsius1, farenheit1;
				System.out.println("Ingresa el valor de la temperatura en celsius");
				celsius1=sc.nextInt();
				farenheit1= (int) ((celsius1*1.8)+32);
				System.out.println("la conversion de su valor ingresado en celsius es "+farenheit1 + "farenheit");
				break;
				
				
             case 2:
            	 System.out.println("Esta es la opcion #2. Convertir de farenheit a celsius  ");
            	 int celsius2, farenheit2;
            	 System.out.println("Ingresa el valor de la temperatura en farenheit");
            	 farenheit2= sc.nextInt();
            	 celsius2= (int)((farenheit2-32)*5)/9;
            	 System.out.println("la conversion de su valor ingresado en farenheit es "+celsius2 + " celsius");
                break;
				
				
             case 3:
            	 System.out.println("Esta es la opcion #3. Convertir de celsius a kelvin  ");
            	 int celsius3, kelvin3;
            	 System.out.println("Ingresa el valor de la temperatura en celsius");
            	 celsius3=sc.nextInt();
            	 kelvin3= (int) (celsius3+273.15);
            	 System.out.println("la conversion de su valor ingresado en celsius es "+kelvin3 + " kelvin");
 				break;
 				
 				
             case 4:
            	 System.out.println("Esta es la opcion #4. Convertir de kelvin a celsius  ");
            	 int celsius4, kelvin4;
            	 System.out.println("Ingresa el valor de la temperatura en kelvin");
            	 kelvin4=sc.nextInt();
            	 celsius4= (int) (kelvin4-273.15);
            	 System.out.println("la conversion de su valor ingresado en kelvin es "+celsius4 + " celsius");
 				break;
 				
 				
             case 5:
            	 System.out.println("Esta es la opcion #5. Convertir de farenheit a kelvin ");
            	 int farenheit5, kelvin5;
            	 System.out.println("Ingresa el valor de la temperatura en farenheit");
            	 farenheit5= sc.nextInt();
            	 kelvin5= (int) ((int)((farenheit5-32)*5)/9+273.15);
            	 System.out.println("la conversion de su valor ingresado en farenheit es "+kelvin5 + " kelvin");
            	 break;
 				
 				
             case 6:
            	 System.out.println("Esta es la opcion #6. Convertir de kelvin a farenheit  ");
            	 int farenheit6, kelvin6;
            	 System.out.println("Ingresa el valor de la temperatura en kelvin");
            	 kelvin5= sc.nextInt();
            	 farenheit5= (int) ((int)((kelvin5-273)*9)/5+32);
            	 System.out.println("la conversion de su valor ingresado en kelvin es "+farenheit5 + " farenheit");
            	 
 				break;
             case 7:
            	 salir=true;
 				break;
 				default:
 					System.out.println("Las  opciones son entre 1 y 7 ");
			}
			
		}
		
		System.out.println("Fin del menu ");

	}

}
