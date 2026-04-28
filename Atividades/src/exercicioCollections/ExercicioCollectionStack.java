package exercicioCollections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ExercicioCollectionStack {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		Deque<String> pilha = new ArrayDeque<>();
		int opcao;
		
		do {
			System.out.println("========== Estoque Livros ==========\n");
			System.out.println("1-Adicionar Livro na pilha\n");
			System.out.println("2-Listar todos os Livros\n");
			System.out.println("3-Retirar Livro da pilha\n");
			System.out.println("0-Sair\n");
			System.out.println("Digite a opção desejada:\n");
			opcao = leia.nextInt();
			leia.nextLine(); 
			
			switch (opcao) {
			
			case 1:
				
				System.out.println("Digite o nome do Livro");
				String nome = leia.nextLine();
				pilha.push(nome);
				System.out.println("Livro Adicionado!");
				break;
				
			case 2:
				
				if(pilha.isEmpty()) {
					System.out.println("A pilha está vazia!");
				}else {
					System.out.println("Lista de Livros na pilha:");
					for(String livro : pilha) {
						System.out.println(livro);
					}
				}
				break;
				
			case 3:
				
				if(pilha.isEmpty()) {
					System.out.println("A pilha está vazia!");
				}
				else {
					System.out.println("Livro retirado da pilha!" + pilha.pop());
				}
				break;
				
			case 0:
				System.out.println("Programa finalizado!");
				break;
				
			default:
				System.out.println("Opção inválida!");
			
				}
			
			} while (opcao != 0);
	}

}
