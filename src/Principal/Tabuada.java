package Principal;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Faça um rograma que receba o operador (+, -, / *)
		 * e um número e mostre a tabuada conforme os dados
		 * de entrada (numero não pode ser maior que 10 e nem menor que 10)
		 */
		
		Scanner sc = new Scanner (System.in);
		
		char operacao;
		int numero = 0;
		
		System.out.println("Qual o tipo da operação (+, -, /, *)");
		operacao = sc.next().charAt(0);
		
		System.out.println("Qual o número que deseja fazer a tabuada: ");
		numero = sc.nextInt();
		
		
		switch (operacao) {
		case '+': 
			for(int contador = 1; contador <= 10; contador++) {
				System.out.println(numero + " + " + contador + " = " + (contador + numero));
			} 
			break;
		case '-': 
			int aux = numero;
			for(int contador = 1; contador <= 10; contador++) {
				System.out.println((aux + contador) + " - " + ((aux + contador) - numero));
			}
			break;
			
			default:
				System.out.println("Operação inválida");
				
			break;
		}
		

				sc.close();
				
	}

}
