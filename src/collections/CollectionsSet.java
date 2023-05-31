package collections;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class CollectionsSet {

	public static void main(String[] args) {
		Set<Integer> numero = new HashSet<Integer>();
		Scanner leia = new Scanner (System.in);
		// usuario inserido valores no set
		System.out.println("Inserir 10 valores inteiros não repetidos: ");
		for(int i= 0; i <=9; i++) {
			numero.add(leia.nextInt());
		}
		//listar dados do set
		System.out.println("\n Listar dados do set:");
		
		Iterator <Integer> inumero = numero.iterator();
		while (inumero.hasNext()) {
			System.out.println(inumero.next());
	}

}
}
