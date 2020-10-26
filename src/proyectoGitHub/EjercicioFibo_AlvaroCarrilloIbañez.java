// Álvaro Carrillo Ibáñez
// https://github.com/ACI21/DeberesGitHub/blob/master/src/proyectoGitHub/EjercicioFibo_AlvaroCarrilloIba%C3%B1ez.java

package proyectoGitHub;

import java.util.Scanner;

public class EjercicioFibo_AlvaroCarrilloIbañez {

	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		 @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	        
		 int numero;	//número a calcular con fibo
		 int n;			//primer número fibo
		 int n2;		//segundo número fibo
		 int i;			//variable para for
	  
	        do{
	            System.out.print("Introduce el número a calcular de Fibo: ");
	            numero = sc.nextInt();	// introducimos el número a calcular
	        }
	        while(numero<=1);	//se indica que el número sea mayor a 1 para calcular
	  
	        System.out.println("\nLos " + numero + " primeros términos de la serie de Fibonacci son:");                 

	        n=0;	// inicializamos variable del primer fibo
	        n2=1;	// inicializamos variable del segundo fibo

	        System.out.print(n + " ");		// imprimimos el primer fibo y un espacio para que quede limpio
	        for(i = 2; i <= numero; i++) {	// indicamos que se repita el for hasta que i sea igual al numero, haciendo que incremente
	            System.out.print(n2 + " ");	// imprimimos el primer fibo y un espacio para que quede limpio
	            n2 = n + n2;				// se reescribe el segundo fibo con el primer fibo mas el segundo fibo
	            n = n2 - n;	            	// se reescribe el primer fibo con el segundo fibo menos el primero
	        } 
	        
	        System.out.println("\n\nLa posición " + numero + " da como resultado " + n + ", en la sucesión del señor Fibo.");
	        
	       
	}
}
