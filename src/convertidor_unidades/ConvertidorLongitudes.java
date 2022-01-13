package convertidor_unidades;

import java.util.Scanner;

public class ConvertidorLongitudes {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		boolean salir = false;
		int opcion;
		
        while (!salir) {
			

			System.out.println("1. Convertir de centimetros a metros");
			System.out.println("2. Convertir de metros a centimetros");
			System.out.println("3. Convertir de metros a kilometros");
			System.out.println("4. Convertir de kilometros a metros");
			System.out.println("5. Convertir de metros a millas");
			System.out.println("6. Convertir de millas a metros");
			System.out.println("7. Convertir de kilometros a  millas");
			System.out.println("8. Convertir de millas a kilometros");
			System.out.println("9. salir ");
			
				

			System.out.println("Introduce el numero de una opcion: ");
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.println("Esta es la opcion #1. Convertir de centimetros a metros");
				int metro1, centimetro1;
				System.out.println("Ingresa el valor de la longitud en centimetros");
				centimetro1=sc.nextInt();
				metro1= centimetro1/100;
				System.out.println("la conversion de su valor ingresado en centimetros es "+metro1 + " metros");
				break;
				
				
             case 2:
            	 System.out.println("Esta es la opcion #2. Convertir de metros a centimetros  ");
            	 int metro2, centimetro2;
 				System.out.println("Ingresa el valor de la longitud en metros");
 				metro2=sc.nextInt();
 				centimetro2= metro2*100;
 				System.out.println("la conversion de su valor ingresado en metros es "+centimetro2 + " centimetros");
                break;
				
				
             case 3:
            	 System.out.println("Esta es la opcion #3. Convertir de metros a kilometros ");
            	 int metro3, kilometro3;
  				System.out.println("Ingresa el valor de la longitud en metros");
  				metro3=sc.nextInt();
  				kilometro3= metro3/1000;
  				System.out.println("la conversion de su valor ingresado en metros es "+kilometro3 + " kilometros");
 				break;
 				
 				
             case 4:
            	 System.out.println("Esta es la opcion #4. Convertir de kilometros a metros  ");
            	 int metro4, kilometro4;
   				System.out.println("Ingresa el valor de la longitud en kilometros");
   				kilometro4=sc.nextInt();
   				metro4= kilometro4*1000;
   				System.out.println("la conversion de su valor ingresado en kilometros es "+metro4 + " metros");
 				break;
 				
 				
             case 5:
            	 System.out.println("Esta es la opcion #5. Convertir de metros a millas ");
            	 float metro5, milla5;
    				System.out.println("Ingresa el valor de la longitud en metros");
    				metro5=sc.nextInt();
    				milla5= (float) (metro5*0.000621);
    				System.out.println("la conversion de su valor ingresado en metros es "+milla5 + " millas");
            	 break;
 				
 				
             case 6:
            	 System.out.println("Esta es la opcion #6. Convertir de millas a metros  ");
            	 float metro6, milla6;
 				System.out.println("Ingresa el valor de la longitud en millas");
 				milla6=sc.nextInt();
 				metro6= (float) (milla6*1609.34);
 				System.out.println("la conversion de su valor ingresado en millas es "+metro6 + " metros");
 				break;
 				
 				
             case 7:
            	 System.out.println("Esta es la opcion #7. Convertir de kilometros a  millas  ");
            	 float kilometro7, milla7;
  				System.out.println("Ingresa el valor de la longitud en kilometros");
  				kilometro7=sc.nextInt();
  				milla7= (float) (kilometro7*0.621371);
  				System.out.println("la conversion de su valor ingresado en kilometros es "+milla7 + " millas");
            	 break;
 				
 				
             case 8:
            	 System.out.println("Esta es la opcion #8. Convertir de millas a kilometros  ");
            	 float kilometro8, milla8;
   				System.out.println("Ingresa el valor de la longitud en millas");
   				milla8=sc.nextInt();
   				kilometro8= (float) (milla8*1.60934);
   				System.out.println("la conversion de su valor ingresado en millas es "+kilometro8 + " kilometros");
 				break;
 				
 				
             case 9:
            	 salir=true;
 				break;
 				default:
 					System.out.println("Las  opciones son entre 1 y 9 ");
			}
			
		}
		
		System.out.println("Fin del menu ");
	}

}
