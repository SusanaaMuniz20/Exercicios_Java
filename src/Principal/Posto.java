package Principal;

import java.util.Scanner;

public class Posto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Atividade Posto de gasolina (Desconto)

		Scanner leia = new Scanner(System.in);

		// Criar variáveis para receber os valores dos combustíveis
		double valorGasolina = 5.75;
		double valorAlcool = 2.98;

		// criar uma variável para receber a quantidade de litros
		double quantidadedeLitros = 0;

		// variável para receber qual o tipo do combustível

		char tipoCombustivel;

		//Variavel com o total à pagar com desconto incluído
		
		double totalAPagar = 0;
		
		// pedir para o ususário inserir o tipo do combustível
		// qual o tipo do combustível para saber o valor total
		// Validação para que o usuário não digite um combustível inválido

		do {
			System.out.println("Entre com o combustível (A/G): ");
			tipoCombustivel = leia.next().charAt(0);
		} while (Character.toUpperCase(tipoCombustivel) != 'A' && Character.toUpperCase(tipoCombustivel) != 'G');
		
		
		tipoCombustivel = Character.toUpperCase(tipoCombustivel);
		
		// Pedir a quantidade de litros que foram abastecidos

		do {
			System.out.println("Quantos litros foram abastecidos? ");
			quantidadedeLitros = leia.nextDouble();
		} while (quantidadedeLitros <= 0);

		//Fazer o cálculo de desconto baseado na quantidade de litros
	
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
