// dos numeros que se multipliquen con for;

package proyectoGitHub;

import java.util.Scanner;

public class Factorizar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double factorial;
		double num;
				
		System.out.println("Indique el primer número a factorizar: ");
		num = sc.nextLong();
		
		factorial = 1;		
		for (double i = num; i >0; i-- ) {
			factorial = factorial *i;
					
		}
		
		System.out.println("El resultado es: " + factorial);
		sc.close();
	}

}
