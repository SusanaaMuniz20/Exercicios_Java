package Principal;

import java.util.Scanner;

public class Posto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Atividade Posto de gasolina (Desconto)

		Scanner leia = new Scanner(System.in);

		// Criar vari�veis para receber os valores dos combust�veis
		double valorGasolina = 5.75;
		double valorAlcool = 2.98;

		// criar uma vari�vel para receber a quantidade de litros
		double quantidadedeLitros = 0;

		// vari�vel para receber qual o tipo do combust�vel

		char tipoCombustivel;

		//Variavel com o total � pagar com desconto inclu�do
		
		double totalAPagar = 0;
		
		// pedir para o usus�rio inserir o tipo do combust�vel
		// qual o tipo do combust�vel para saber o valor total
		// Valida��o para que o usu�rio n�o digite um combust�vel inv�lido

		do {
			System.out.println("Entre com o combust�vel (A/G): ");
			tipoCombustivel = leia.next().charAt(0);
		} while (Character.toUpperCase(tipoCombustivel) != 'A' && Character.toUpperCase(tipoCombustivel) != 'G');
		
		
		tipoCombustivel = Character.toUpperCase(tipoCombustivel);
		
		// Pedir a quantidade de litros que foram abastecidos

		do {
			System.out.println("Quantos litros foram abastecidos? ");
			quantidadedeLitros = leia.nextDouble();
		} while (quantidadedeLitros <= 0);

		//Fazer o c�lculo de desconto baseado na quantidade de litros
	
		if(tipoCombustivel == 'G') {
			if(quantidadedeLitros <= 20)
				totalAPagar = (quantidadedeLitros * valorGasolina);
				totalAPagar = totalAPagar - (totalAPagar * 0.04);
				System.out.println("Valor a ser pago com desconto: " + totalAPagar);
		} else {
			totalAPagar = (quantidadedeLitros * valorGasolina);
			totalAPagar = totalAPagar - (totalAPagar * 0.06);
			System.out.println("Valor a ser pago com desconto: " + totalAPagar);
		}
		
		if(tipoCombustivel == 'A') {
			if(quantidadedeLitros <= 20)
				totalAPagar = (quantidadedeLitros * valorAlcool);
				totalAPagar = totalAPagar - (totalAPagar * 0.03);
				System.out.println("Valor a ser pago com desconto: " + totalAPagar);
		} else {
			totalAPagar = (quantidadedeLitros * valorAlcool);
			totalAPagar = totalAPagar - (totalAPagar * 0.05);
			System.out.println("Valor a ser pago com desconto: " + totalAPagar);
		}
		
		
		
		
		
		
		
	}

}
