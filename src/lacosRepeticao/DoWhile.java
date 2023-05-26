package lacosRepeticao;
import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num, soma=0;
		
		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();  
			
				if(num > 0) {
						soma = soma + num;
					}
	}while(num!=0);
		
		System.out.println("A soma de todos os números positivos é: " + soma + ".");

}
}
