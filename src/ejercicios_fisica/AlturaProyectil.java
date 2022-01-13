package ejercicios_fisica;

import java.util.Scanner;

public class AlturaProyectil {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);	
		
	
		System.out.println("calculo de altura maxima de un proyectil con trayectoria parabolica"); 
		
		float Vo,angulo, gravedad, altura;
		
		System.out.println("Ingrese la velocidad inicial del proyectil en m/s"); 
		Vo= sc.nextFloat();
		
		gravedad=(float) 9.8;
		
		System.out.println("Ingrese el angulo de la trayectoria parabolica en grados"); 
		angulo= sc.nextFloat();
		
		altura =(float) ((Math.pow(Vo,2)*Math.pow(Math.sin(Math.toRadians(angulo)),2))/(gravedad*2));
		
		System.out.println("La altura maxima del proyectil es de: "+altura+" metros");
		
		
		
		

	}

}
