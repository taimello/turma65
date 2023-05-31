package collections;
import java.util.Collections;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class Fila {

	public static void main(String[] args) {
		Queue<Integer> fila = new LinkedList<Integer>();
		
		for(int i = 0; i <= 10; i++) {
			fila.add(i);
		}
		System.out.println("\n Primeiro elemento da fila: " + fila.peek());
		System.out.println("\n Elementos na fila: " + fila);
		System.out.println("\n Remover elementos: " + fila.poll());	
		System.out.println("\n Fila atualizada: " + fila);
		System.out.println("\n Adicionar elemento: " + fila.add(11));
		System.out.println("\n Exibir fila: " + fila);
	}

}
