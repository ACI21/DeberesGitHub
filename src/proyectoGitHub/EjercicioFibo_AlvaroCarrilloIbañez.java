// 

package proyectoGitHub;

import java.util.Scanner;

public class EjercicioFibo_AlvaroCarrilloIba�ez {

	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		 @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	        
		 int numero,n,n2,i;
	  
	        do{
	            System.out.print("Introduce el n�mero que quieras saber de Fibo: ");
	            numero = sc.nextInt();
	        }
	        while(numero<=1);
	  
	        System.out.println("Los " + numero + " primeros t�rminos de la serie de Fibonacci son:");                 

	        n=1;
	        n2=1;

	        System.out.print(n + " ");
	        for(i = 2; i <= numero; i++) {
	            System.out.print(n2 + " ");
	            n2 = n + n2;
	            n = n2 - n;
	        }
	        System.out.println();
				   
	}
}