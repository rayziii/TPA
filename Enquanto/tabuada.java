package exerciciosWhile;
import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
	
		int i = 1, n, m;
		
		System.out.println ("Insira o número: ");
		n = ler.nextInt();
		
		while ( i <= 10) {
			
			m = n * i;
			
			System.out.println (n + "x" + i + "=" + m);
			
			i++;
			
		} ler.close();
		
	}

}
