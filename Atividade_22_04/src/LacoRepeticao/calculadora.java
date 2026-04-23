package LacoRepeticao;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		//declaracao de variaveis 
		float num1,num2,resultado;
		int escolha;
		
		//entrada de valores
		System.out.println("*----- Calculadora de 2 Números -----*");
		System.out.println("Digite o 1º Número: ");
		num1 = leia.nextFloat();
		
		System.out.println("Digite o 2º Número: ");
		num2 = leia.nextFloat();
		
		System.out.println("*----- Escolha uma opção -----*");
		System.out.println("1 - Soma ");
		System.out.println("2 - Subtração ");
		System.out.println("3 - Multiplicação ");
		System.out.println("4 - Divisão ");
		escolha = leia.nextInt();
		
		//processamento
		switch(escolha){
		case 1 :
			resultado = num1 + num2 ;
			System.out.println(num1 + " + " + num2 + " = " +resultado);
		break;
		
		case 2 :
			resultado = num1 - num2 ;
			System.out.println(num1 + " - " + num2 + " = " +resultado);
		break;
		
		case 3 :
			resultado = num1 * num2 ;
			System.out.println(num1 + " * " + num2 + " = " +resultado);
		break;
		
		case 4 :
			resultado = num1 / num2 ;
			System.out.println(num1 + " / " + num2 + " = " +resultado);
		break;
		
		default:
			System.out.println("Operação Inválida");
		}
		
		
	}

}
