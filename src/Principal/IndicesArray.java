package Principal;

import java.util.Scanner;

public class IndicesArray {

	public static void main(String[] args) {
		/* Um vetor de 20 posi��es, mostrando e inserindo esses n�meros
		 */

		Scanner leia = new Scanner (System.in);
		
		int [] numeros = new int [5];
		int soma = 0;
	
		
		System.out.println("fora do for:" + numeros[0]);
		
		
		// i = interador (sin�nimo de contador)
		for(int i = 0; i < numeros.length; i++) {
			
			System.out.println("Entre com o numero: ");
			numeros[i] = leia.nextInt();
			while(numeros[i] < 0) {
				System.out.println("N�mero inv�lido: ");
				System.out.println("Entre o n�mero: ");
				numeros[i] = leia.nextInt();
			}
			soma += numeros[i];
		}
		System.out.println("A soma dos n�meros: " + soma);
		System.out.println("numeros digitados: ");
		for(int numero : numeros) {
			System.out.println(numero);
		}
		
	}

}
