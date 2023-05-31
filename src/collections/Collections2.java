package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Collections2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<>();
		//usuario inserindo os dados da lista
		System.out.println("Inserir 5 cores: ");
		for(int i = 0; i <= 4; i ++) {
			cores.add(leia.next());
		} 
	//mostrar todas as cores que foram adicionadas
		System.out.println("\n As cores adicionadas foram: " + cores.toString());
		
	//ordenar as cores
	
		System.out.println("\n Ordenar as cores: ");
		
		for (String colors : cores) {
	        System.out.println(colors);
	}
		
		
			
	

		
		
		
		
	}

}
