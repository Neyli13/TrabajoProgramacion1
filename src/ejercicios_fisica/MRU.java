package ejercicios_fisica;

import java.util.Scanner;

public class MRU {

	public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	
	float distancia, tiempo, velocidad;
	System.out.println("calculo de velocidad en MRU");
	
	System.out.println("Introduzca el valor de la distancia en kilometros");
	distancia=sc.nextInt();
	
	System.out.println("Introduzca el valor del tiempo en horas");
	tiempo=sc.nextInt();
	
	velocidad=(float)(distancia/tiempo);
	
	System.out.println("El valor de la velocidad es de "+velocidad+" km/h");
	
		

	}

}
