package exercicios;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int i = 1, fat = 1, n;
		
		System.out.println ("Insira o n�mero: ");
		n = ler.nextInt();
		
		do {
			fat = fat * i;
			i++;
		} while (i <= n);
		
		 System.out.println ("Fatorial " + "(" + n + "!" + ")" + " = " + fat);

		ler.close();
	}
}
