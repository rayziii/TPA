package exercicios;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int n, i = 1, anterior = 0, atual = 1, proximo;
		
		System.out.println ("Insira o n�mero de termos que deseja ver: ");
		n = ler.nextInt();
		
		System.out.println ("S�rie de Fibonacci: ");
		
		do {
			
			System.out.print (atual + " ");
			proximo = anterior + atual;
			anterior = atual;
			atual = proximo;
			i++;
			
		} while ( i <= n );
		
		ler.close();
	}
	
}
