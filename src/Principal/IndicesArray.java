package Principal;

import java.util.Scanner;

public class IndicesArray {

	public static void main(String[] args) {
		/* Um vetor de 20 posições, mostrando e inserindo esses números
		 */

		Scanner leia = new Scanner (System.in);
		
		int [] numeros = new int [5];
		int soma = 0;
	
		
		System.out.println("fora do for:" + numeros[0]);
		
		
		// i = interador (sinônimo de contador)
		for(int i = 0; i < numeros.length; i++) {
			
			System.out.println("Entre com o numero: ");
			numeros[i] = leia.nextInt();
			while(numeros[i] < 0) {
				System.out.println("Número inválido: ");
				System.out.println("Entre o número: ");
				numeros[i] = leia.nextInt();
			}
			soma += numeros[i];
		}
		System.out.println("A soma dos números: " + soma);
		System.out.println("numeros digitados: ");
		for(int numero : numeros) {
			System.out.println(numero);
		}
		
	}

}
