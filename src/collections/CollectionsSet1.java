package collections;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class CollectionsSet1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Set<Integer> num = new HashSet<Integer>();
		int n;
		
		num.add(2);
		num.add(5);
		num.add(1);
		num.add(3);
		num.add(4);
		num.add(9);
		num.add(7);
		num.add(8);
		num.add(10);
		num.add(6);
		
		System.out.println("Digite o número que você deseja encontrar:");
		n = leia.nextInt();
		
		System.out.println("O número: " + n + "");
		}

}
