package exerciciosEntradaSaida;

import java.util.Scanner;

public class SalarioAbono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float salario, abono, novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		//entrada de dados
		System.out.println("Digite o Salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o Abono: ");
		abono = leia.nextFloat();
		
		//processamento
		novoSalario = salario + abono;
		
		System.out.println("Seu novo Salário: " + novoSalario);
		

		
		
	
	}

}
