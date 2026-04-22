package LacoRepeticao;

import java.util.Scanner;

public class Lanchonete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int escolha, quantidade, preco, valorTotal;
		
		System.out.println("1- Cachorro Quente - R$ 10");
		System.out.println("2- X-Salada - R$ 15");
		System.out.println("3- X-Bacon - R$ 18 ");
		System.out.println("4- Bauru - R$ 12");
		System.out.println("5- Refrigerante - R$ 8");
		System.out.println("6- Suco de Laranja - R$ 13");
		
		System.out.println("Digite a opção escolhida: ");
		escolha = leia.nextInt();
		
		System.out.println("Digite a quantidade: ");
		quantidade = leia.nextInt();
		
		switch (escolha) {
		
		case 1:
			preco = 10;
			System.out.println("Produto: Cachorro Quente" );
			
			valorTotal = quantidade * preco;
			
			System.out.println("Valor total: " + valorTotal );
			break;
		
		case 2:
				preco = 15;
				System.out.println("Produto: X-Salada" );
				
				valorTotal = quantidade * preco;
				
				System.out.println("Valor total: " + valorTotal );
				break;
			
			
		case 3:
			preco = 18;
			System.out.println("Produto: X-Bacon" );
			
			valorTotal = quantidade * preco;
			
			System.out.println("Valor total: " + valorTotal );
			break;
	
		
		case 4:
			preco = 12;
			System.out.println("Produto: Bauru" );
			
			valorTotal = quantidade * preco;
			
			System.out.println("Valor total: " + valorTotal );
			break;
		
		
		case 5:
			preco = 8;
			System.out.println("Produto: Refrigerante" );
			
			valorTotal = quantidade * preco;
			
			System.out.println("Valor total: " + valorTotal );
			break;
		
		
		case 6:
			preco = 13;
			System.out.println("Produto:  Suco de Laranja" );
			
			valorTotal = quantidade * preco;
			
			System.out.println("Valor total: " + valorTotal );
			break;
		}

		
		
	}

}
