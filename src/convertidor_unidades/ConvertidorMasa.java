package convertidor_unidades;

import java.util.Scanner;

public class ConvertidorMasa {

	public static void main(String[] args) {
		
Scanner sc= new Scanner (System.in);
		
		boolean salir = false;
		int opcion;
		
        while (!salir) {
        	
        	System.out.println("1. Convertir libras a gramos");
			System.out.println("2. Convertir gramos a libras");
			System.out.println("3. Convertir libras a onzas");
			System.out.println("4. Convertir onzas a libras");
			System.out.println("5. Convertir onzas a gramos");
			System.out.println("6. Convertir gramos a onzas");
			System.out.println("7. Convertir kilos a libras");
			System.out.println("8. Convertir libras a kilos");
			System.out.println("9. Convertir kilos a onzas");
			System.out.println("10. Convertir onzas a kilos ");
			System.out.println("11. salir ");
			
			System.out.println("Introduce el numero de una opcion: ");
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.println("Esta es la opcion #1. Convertir libras a gramos");
				float libra1, gramo1;
				System.out.println("Ingresa el valor en libras");
				libra1=sc.nextFloat();
				gramo1= (float) (libra1*453.592);
				System.out.println("la conversion de su valor ingresado en libras es "+gramo1 + " gramos");
				break;
				
			case 2:
				System.out.println("Esta es la opcion #2. Convertir gramos a libras");
				float libra2, gramo2;
				System.out.println("Ingresa el valor en gramos");
				gramo2=sc.nextFloat();
				libra2= (float) (gramo2*0.00220462);
				System.out.println("la conversion de su valor ingresado en gramos es "+libra2 + " libras");
				break;	
				
			case 3:
				System.out.println("Esta es la opcion #3. Convertir libras a onzas");
				float libra3, onza3;
				System.out.println("Ingresa el valor en libras");
				libra3=sc.nextFloat();
				onza3= (float) (libra3*16);
				System.out.println("la conversion de su valor ingresado en libras es "+onza3 + " onzas");
				break;
				
			case 4:
				System.out.println("Esta es la opcion #4. Convertir onzas a libras");
				float libra4, onza4;
				System.out.println("Ingresa el valor en onzas");
				onza4=sc.nextFloat();
				libra4= (float) (onza4*0.0625);
				System.out.println("la conversion de su valor ingresado en onzas es "+libra4 + " libras");
				break;
				
			
			case 5:
				System.out.println("Esta es la opcion #5. Convertir onzas a gramos");
				float gramo5, onza5;
				System.out.println("Ingresa el valor en onzas");
				onza5=sc.nextFloat();
				gramo5= (float) (onza5*28.3495);
				System.out.println("la conversion de su valor ingresado en onzas es "+gramo5 + " gramos");
				break;
				
			case 6:
				System.out.println("Esta es la opcion #6. Convertir gramos a onzas");
				float gramo6, onza6;
				System.out.println("Ingresa el valor en gramos");
				gramo6=sc.nextFloat();
				onza6= (float) (gramo6*0.035274);
				System.out.println("la conversion de su valor ingresado en gramos es "+onza6 + " onzas");
				break;
				
			case 7:
				System.out.println("Esta es la opcion #7. Convertir kilos a libras");
				float kilo7, libra7;
				System.out.println("Ingresa el valor en kilos");
				kilo7=sc.nextFloat();
				libra7= (float) (kilo7*2.20462);
				System.out.println("la conversion de su valor ingresado en kilos es "+libra7 + " libras");
				break;	
				
			
			case 8:
				System.out.println("Esta es la opcion #8. Convertir libras a kilos");
				float kilo8, libra8;
				System.out.println("Ingresa el valor en libras");
				libra8=sc.nextFloat();
				kilo8= (float) (libra8*0.453592);
				System.out.println("la conversion de su valor ingresado en libras es "+kilo8 + " kilos");
				break;
				
			case 9:
				System.out.println("Esta es la opcion #9. Convertir kilos a onzas");
				float kilo9, onza9;
				System.out.println("Ingresa el valor en kilos");
				kilo9=sc.nextFloat();
				onza9= (float) (kilo9*35.274);
				System.out.println("la conversion de su valor ingresado en kilos es "+onza9 + " onzas");
				break;
				
			case 10:
				System.out.println("Esta es la opcion #10. Convertir onzas a kilos");
				float kilo10, onza10;
				System.out.println("Ingresa el valor en onzas");
				onza10=sc.nextFloat();
				kilo10= (float) (onza10*0.0283495);
				System.out.println("la conversion de su valor ingresado en onzas es "+kilo10 + " kilos");
				break;
				
			 case 11:
            	 salir=true;
 				break;
 				default:
 					System.out.println("Las  opciones son entre 1 y 11 ");
				
			}

	}
	}
}
