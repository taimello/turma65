package lacosRepeticao;
import java.util.Scanner;
public class For {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1=0, n2=0, cont;
		
		System.out.println("Digite o primeiro número do intervalo:");
		n1 = leia.nextInt();
		
		System.out.println("Digite o segundo número do intervalo:");
		n2 = leia.nextInt();
		
		if(n1 < n2){
		
		for(cont = n1; cont <= n2; cont++) {
			if(cont % 3 == 0 && cont % 5 == 0 && cont != 0) {
				System.out.println("No intervalor entre "+ n1 + 
						"e "+ n2 + "\n" + cont + " É multiplo de 3 e 5");
			}
		}
	}else {
		System.out.println("Intervalo Invalido");
	}

}
}
