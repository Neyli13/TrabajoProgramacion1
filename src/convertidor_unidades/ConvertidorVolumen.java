package convertidor_unidades;

import java.util.Scanner;

public class ConvertidorVolumen {
	
public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		boolean salir = false;
		int opcion;
		
        while (!salir) {
			

			System.out.println("1. Convertir galon a metros cubicos");
			System.out.println("2. Convertir de metros cubicos a galon");
			System.out.println("3. Convertir de litros a galon");
			System.out.println("4. Convertir de galones a litros");
			System.out.println("5. salir ");
			
			System.out.println("Introduce el numero de una opcion: ");
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.println("Esta es la opcion #1. Convertir galon a metros cubicos");
				float galon1, metro_cubico1;
				System.out.println("Ingresa el valor de los galones");
				galon1=sc.nextInt();
				metro_cubico1= (float) (galon1*0.00379);
				System.out.println("la conversion de su valor ingresado en galones es "+metro_cubico1 + " metros cubicos");
				break;
				
				
             case 2:
            	 System.out.println("Esta es la opcion #2. Convertir de metros cubicos a galon ");
            	 float galon2, metro_cubico2;
 				System.out.println("Ingresa el valor de los metros cubicos");
 				metro_cubico2=sc.nextInt();
 				galon2= (float) (metro_cubico2*264.172);
 				System.out.println("la conversion de su valor ingresado en metros cubicos es "+galon2 + " galones");
                break;
				
				
             case 3:
            	 System.out.println("Esta es la opcion #3. Convertir de litros a galon");
            	 float galon3, litro3;
  				System.out.println("Ingresa el valor de los litros");
  				litro3=sc.nextInt();
  				galon3= (float) (litro3*0.264172);
  				System.out.println("la conversion de su valor ingresado en litros es "+galon3 + " galones");
 				break;
 				
 				
             case 4:
            	 System.out.println("Esta es la opcion #4. Convertir de galones a litros  ");
            	 float galon4, litro4;
   				System.out.println("Ingresa el valor de los galones");
   				galon4=sc.nextInt();
   				litro4= (float) (galon4*3.78541);
   				System.out.println("la conversion de su valor ingresado en galones es "+litro4 + " litros");
 				break;
 				
             case 5:
            	 salir=true;
 				break;
 				default:
 					System.out.println("Las  opciones son entre 1 y 5 ");
			}			
}
}
}