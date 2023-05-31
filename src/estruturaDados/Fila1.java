package estruturaDados;
import java.util.Queue;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Fila1 {

	public static void main(String[] args) {
		Queue<String> clientes = new LinkedList<String>();
		Scanner leia = new Scanner (System.in);
		int num;
		String nome;
		
 do {
		
		System.out.println("\t1 - Adicionar cliente na Fila");
		System.out.println("\t2 - Listar todos os clientes");
		System.out.println("\t3 - Retirar cliente da Fila");
		System.out.println("\t0 - Sair");
		num = leia.nextInt();
		
	switch(num) {
		
		case 1:
			System.out.println("Digite o nome:");
			nome = leia.next();
			clientes.add(nome);
			System.out.println("Fila: ");
				for (String client : clientes) {
		        System.out.println(client);
				}
			System.out.println("\n Cliente adionado!");
		break;
		case 2:
			System.out.println("Lista de clientes na fila:/n");
			for (String client : clientes) {
		        System.out.println(client);
				}
		break;
		case 3:
				if(clientes.isEmpty()) {
					System.out.println("Fila está vazia\n");
				}else {
			System.out.println(clientes.poll());
			System.out.println("\n O cliente foi chamado!\n");
				}
				break;
		case 0:
			System.out.println("PROGRAMA ENCERRADO");
			break;
	}
	
}while (num != 0);
}
}
