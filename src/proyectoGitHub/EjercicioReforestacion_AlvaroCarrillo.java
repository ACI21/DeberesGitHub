https://github.com/ACI21/DeberesGitHub/blob/master/src/proyectoGitHub/EjercicioReforestacion_AlvaroCarrillo.java
EjercicioReforestacion_AlvaroCarrillo

package proyectoGitHub;

public class Reforestacion_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] Area ;
		Area = new int[] {4, 2, 6, 7};
		int [] FactorD; 
		FactorD = new int[] {2, 4, 1, 6};
		int total = 0;
				
		for (int i = 0; i<=4 ; i++) {
			System.out.println("Para el bloque "+ i + ", se hará una reforestación con: " + (Area[i]*FactorD[i]) + " árboles."); 
			total = total + (Area[i]*FactorD[i]);
			
			if (i == 3) {
				System.out.println("\nLa reforestación total constaria de: "+ total + " árboles.");
			}
		}
	}
}
