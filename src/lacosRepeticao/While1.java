package lacosRepeticao;
import java.util.Scanner;
public class While1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, idade1=0, idade2=0;
		boolean contador = true;
		
		while (contador) { 
			
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();	
			
			if (idade > 0) {
				
				 if (idade < 21) {
						
						idade1= idade1 + 1;
						
					}	else if (idade > 50) {
						
						idade2 = idade2 +  1;
					}
				
			}else {
				contador = false;
			}
		}
		
		System.out.println("Total de pessoas menor de 21 anos é: "+ idade1 + ".");
		System.out.println("Total de pessoas maiores de 50 anos é: "+ idade2 + ".");	
	

}
}
