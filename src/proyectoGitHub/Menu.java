package proyectoGitHub;

import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean continuar=true;
		int opcion = 5;
				
		do {
			System.out.println("Esta es la lista de opciones:");
			System.out.println("1. Abrir programa");
			System.out.println("2. Cerrar programa");
			System.out.println("3. guardar");
			System.out.println("4. SubMenu");
			System.out.println("5. salir");
			System.out.println("Escoga una, por favor: ");
			opcion = sc.nextInt();
			
/*			if(opcion == 1) {
				System.out.println("ABRIR");
			}
			else if(opcion == 2) {
				System.out.println("CERRAR");
			}
			else if(opcion == 3) {
				System.out.println("GUARDAR");
			}
			else if(opcion == 4) {
				System.out.println("SALIR");
				continuar = false;
			}
*/			
			switch (opcion) {
			case 1:
				System.out.println("Abrir");
				break;
			case 2:
				System.out.println("Cerrar");
				break;
			case 3:
				System.out.println("Guardar");
				break;
			case 4:
				mostrarSubmenu();
				break; 
			case 5:
				System.out.println("Salir");
				continuar = false; break;
				
				

			default:
				System.out.println("Es una lista de CINCO opciones, seleccione otra opción.");
				break;
				
			}
			
		}while (continuar);
		sc.close();
		
		}

	private static void mostrarSubmenu() {
		System.out.println("Bienvenido al submenu:");
		System.out.println("1. hola mundo");
		System.out.println("2. adoro java");
		System.out.println("3. adoro eclipse");
	} 
}