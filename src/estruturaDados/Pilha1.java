package estruturaDados;

import java.util.Scanner;
import java.util.Stack;

public class Pilha1 {

	public static void main(String[] args) {
		Stack<String> livros = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		int num;
		String nome;
		
	do {
		System.out.println("\t1 - Adicionar Livro na pilha");
		System.out.println("\t2 - Listar todos os livros");
		System.out.println("\t3 - Retirar livro da pilha");
		System.out.println("\t0 - Sair");
		num = leia.nextInt();
		
		switch (num) {
			
		case 1: 
			System.out.println("Digite o nome:");
			leia.nextLine();
			nome = leia.nextLine();
			livros.push(nome);
			
			System.out.println("Pilha: ");
				for (String libro : livros) {
		        System.out.println(libro);
				}
			System.out.println("\nLivro adicionado!");
		break;
		
		case 2: 
			System.out.println("Listar todos os livros:/n");
			for (String libro : livros) {
		        System.out.println(libro);
				}
		
		case 3:
			if(livros.isEmpty()) {
				System.out.println("Pilha está vazia\n");
			}else {
		System.out.println(livros.pop());
		System.out.println("\n Um livro foi retirado da pilha!!");
			}
			break;
		
		case 0:
			System.out.println(" O PROGRAMA FOI ENCERRADO!!");
		break;
		
		default:
			System.out.println("Digite uma opção válida!!");
		}
		
		
	
	}while(num != 0);
		
	}

}
