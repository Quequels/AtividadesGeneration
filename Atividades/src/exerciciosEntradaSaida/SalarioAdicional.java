package exerciciosEntradaSaida;

import java.util.Scanner;

public class SalarioAdicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variaveis
		float salarioBruto, adcNoturno, He, descontos, salarioLiq;
		
		Scanner leia = new Scanner(System.in);
		
		//entrada de dados
		System.out.println("Digite o Salário Bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite o Valor do Adicional Noturno: ");
		adcNoturno = leia.nextFloat();
		
		System.out.println("Digite o Valor da Hora Extra: ");
		He = leia.nextFloat();
		
		System.out.println("Digite o Valor dos Descontos");
		descontos = leia.nextFloat();
		
		//processamento
		salarioLiq  = salarioBruto + adcNoturno + (He * 5) - descontos ;
		
		//saida
		System.out.println("Seu Salário líquido: " + salarioLiq);
	}
}

