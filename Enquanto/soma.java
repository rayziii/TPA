package exerciciosWhile;
import java.util.Scanner;

public class soma {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int i = 1, soma = 0;
		
		while (i <= 100) {
			
			soma = soma + i;
			
			i++;
		}
		
		System.out.println ("A soma �: " + soma);
		
		ler.close();
	}


}
