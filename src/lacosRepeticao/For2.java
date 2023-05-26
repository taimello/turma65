package lacosRepeticao;
import java.util.Scanner;
public class For2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num, par=0, impar=0, contador;
		
	for(contador = 1; contador <= 10; contador++) {
			
			System.out.println("Digite o " + contador +"° número:");
			num = leia.nextInt();
			
			if(num % 2 == 0) {
				par = par + 1;			
			}else if (num % 2 == 1){
				impar = impar + 1;
			}
		} 
		
	System.out.println("A soma dos números pares é: " + par + "." );
	System.out.println("A soma dos números impares é: " + impar + "." );


	}

}
