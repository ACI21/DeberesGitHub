package proyectoGitHub;

import java.util.Scanner;

public class EjercicioIncremento_AlvaroCarrillo {

	private static void Resultados(int numZonas, String[] lugares, int[][] densidadArea) {
		int acumulador = 0;
		
		for (int i = 0 ; i < numZonas ; i++) {
			System.out.println(("En " + lugares[i] + " se plantan " + densidadArea[0][i] *  densidadArea[1][i]+ " arboles"));
			acumulador += densidadArea[0][i] * densidadArea [1][i];
		}
		
		System.out.println("En total se plantan: " + acumulador + " arboles. ");
	}
	
	private static void Resultados2(int añadirZona,  String[] lugaresExtra, int[][] denAreaExtra) {
		int acumulador = 0;
		
		for (int i = 0 ; i < añadirZona ; i++) {
			System.out.println(("En " + lugaresExtra[i] + " se plantan " + denAreaExtra[0][i] *  denAreaExtra[1][i]+ " arboles"));
			acumulador += denAreaExtra[0][i] * denAreaExtra [1][i];
		}
		
		System.out.println("En total se plantan: " + acumulador + " arboles. ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int numZonas;
		System.out.println("¿Cuantas zonas hay?");
		numZonas = sc.nextInt();
		
		String añadir;
		int añadirZona = 0;
		int [][] densidadArea = new int [2][numZonas];
		int [][] denAreaExtra = new int[2][numZonas + añadirZona];
		String [] lugares = new String [numZonas];
		String [] lugaresExtra = new String [numZonas + añadirZona];
		
		for (int i = 0 ; i < numZonas ; i++) {
			System.out.println("Introduce el nombre de la zona: ");
			lugares [i]= sc.next();
			
			System.out.println("Introduce la densidad de la zona:");
			densidadArea [0][i] = sc.nextInt();
			
			System.out.println("Introduce el area de la zona: ");
			densidadArea [1][i] = sc.nextInt();	
			
			Resultados(numZonas, lugares, densidadArea);
		}
		
		System.out.println("¿Quieres añadir más zonas? (Si/No)");
		añadir = sc.next();
		
		if (añadir.equals ("Si")) {
			
			System.out.println("¿Cuantas zonas quieres añadir?");
			añadirZona = sc.nextInt();
			lugaresExtra = new String [numZonas + añadirZona];
			
			for (int j = numZonas ; j < (numZonas + añadirZona) ; j++) {
				System.out.println("Introduce el nombre de la zona: ");
				lugaresExtra [j]= sc.next();
				
				System.out.println("Introduce la densidad de la zona:");
				denAreaExtra [0][j] = sc.nextInt();
				
				System.out.println("Introduce el area de la zona: ");
				denAreaExtra [1][j] = sc.nextInt();
				
			Resultados2(añadirZona, lugaresExtra, denAreaExtra);
			}
			numZonas = numZonas + añadirZona;
		}
		else {	
			System.out.println("Ya hemos terminado la consulta, gracias.");
		}
		
		sc.close();
	
	
	
	}
}