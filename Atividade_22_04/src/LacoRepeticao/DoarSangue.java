package LacoRepeticao;

import java.util.Scanner;

public class DoarSangue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaracao de variaveis
		String doador;
		int idade;
		boolean doacao;
		
		Scanner leia = new Scanner(System.in);
		
		//entrada de dados
		System.out.println("Digite o nome: ");
		doador = leia.next();
		
		System.out.println("Digite a idade do doador:");
		idade = leia.nextInt();
		
		System.out.println("Já doou sangue? ");
		doacao = leia.hasNext();

		//processamento e saida 
		
		if(idade >= 18 && idade < 60) {
			System.out.println(doador + " está apto para doar sangue.");
		}
		else if(idade >= 60 && idade <= 69 && doacao == true) {
			System.out.println(doador + " está apto para doar sangue.");
			
		}
		else {
			System.out.println(doador + " não está apto para doar sangue.");
		}
		
		
	}

}
