package collections;
import java.util.ArrayList;
import java.util.Collections;
public class Collections1 {

	public static void main(String[] args) {

		ArrayList<Double> notas = new ArrayList<>();
		notas.add(7.0);
		notas.add(5.0);
		notas.add(4.0);
		notas.add(10.0);
		
		//mostra na tela todas as notas inseridas
		System.out.println("\n Notas cadastradas:" + notas.toString());
		
		//mostra uma determinada nota existente na lista
		System.out.println("\n Nota 5 existente na lista? " + notas.contains(5d));
		
		notas.set(1, 6d);
		System.out.println("\n Nota 5 foi alterada para 6: " + notas.toString());
		
		notas.remove(4d);
		System.out.println("\n Nota 4 foi apagada: "+ notas.toString());
		
		// checa se a lista está vazia
		System.out.println("\n A lista está vazia? " + notas.isEmpty());
		
		//exibe o tamanho da lista (numero de elementos)
		System.out.println("\n O tamanho da lista é: "+ notas.size());
		
		//exibe o maior valor da lista
		System.out.println("\n O maior valor da lista é? "+ Collections.max(notas));
		//exibe o menor valor da lista
		System.out.println("\n O menor valor da lista é: "+ Collections.min(notas));
		
		//limpa a lista
		notas.clear();
		System.out.println("\n A lista está vazia: " + notas.toString());
		
		
		
		
	}

}
