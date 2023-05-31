package collections;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		
		pilha.push("O Assasino no Expresso oriente");
		pilha.push("Alquimista");
		pilha.push("Como influenciar pessoas");
		pilha.push("Persépolis");
		pilha.push("Um estudo em vermelho");
		
		System.out.println("\n Elemento no topo da pilha: " + pilha.peek());
		System.out.println("\n Elementos da pilha: " + pilha);
		System.out.println("\n Retirar elemento: " + pilha.pop());
		System.out.println("\n Pilha atualizada " + pilha);
		System.out.println("\n Adicionar elemento: " + pilha.push("Duna"));
		System.out.println("\n Pilha atualizada" + pilha);





		

		
	}

}
