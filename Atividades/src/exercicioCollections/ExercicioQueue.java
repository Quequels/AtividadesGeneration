package exercicioCollections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioQueue {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		Queue<String> fila = new LinkedList<>();
		int opcao;
		
		do {
		System.out.println("========== Fila Clientes ==========\n");
		System.out.println("1-Adicionar um novo Cliente na fila\n");
		System.out.println("2-Listar todos os Clientes da fila\n");
		System.out.println("3-Chamar(retirar) uma pessoa da fila\n");
		System.out.println("0-Sair\n");
		System.out.println("Digite a opção desejada:\n");
		opcao = leia.nextInt();
		leia.nextLine();
		
		
		
		switch (opcao) {
		case 1: 
			
			System.out.println("Digite o nome do cliente:");
			String nome = leia.nextLine();
			fila.add(nome);
			System.out.println("Cliente Adicionado!");
			break;
			
		case 2:
			
			if(fila.isEmpty()) {
				System.out.println("A fila está vazia");
			}else {
				System.out.println("Clientes na fila:");
				for(String cliente : fila) {
					System.out.println(cliente);
				}
			}
			break;
			
		case 3:
			
			if(fila.isEmpty()) {
				System.out.println("A fila está vazia!");
			}
			else {
				System.out.println("chamado:" + fila.poll());
			}
			break;
			
		case 0:
			System.out.println("Programa finalizado!");
			break;
			
		default:
			System.out.println("Opção inválida!");
		
			}
		
		}while (opcao != 0);
	}
}
