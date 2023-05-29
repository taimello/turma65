package vetoresMatrizes;
import java.util.Scanner;
public class Vetores1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		
		int vetorInteiros[] = new int[10];
		int soma=0;
		
	// inserir dados no vetor
		for(int indice = 0; indice < 10; indice ++ ) {
			System.out.println("Digite o " + (indice+1) + "° número:");
			vetorInteiros[indice] = leia.nextInt();		
		}// elementos impares
		
		System.out.println("Elementos nos indices impares:");
		for (int indice = 1; indice < 10; indice += 2) {
			if(indice % 2 == 1) {
				System.out.println(vetorInteiros[indice]);
			}
			
		}// elementos pares
		
		System.out.println("Elementos pares:");
		for (int indice = 0; indice < 10; indice ++) {
			if (vetorInteiros[indice] % 2 ==0) {
				System.out.println(vetorInteiros[indice]);
			}
		} // soma e media dos vetores
		for(int indice = 0; indice < 10; indice ++) {
			soma = soma + vetorInteiros[indice];
		} System.out.println("\n Soma: " + soma + "");
		for(int indice = 0; indice < 10; indice ++) {
		} System.out.println("\n Média: " + (soma / 10) + "");
	}
}