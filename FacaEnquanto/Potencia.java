package exercicios;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int b, e, p = 1, i = 0;
		
		System.out.println ("Insira o valor da base: ");
		b = ler.nextInt();
		
		System.out.println ("Insira o valor do expoente: ");
		e = ler.nextInt();
		
		do {
			
			p = p * b;
			i++;
			
		} while (i < e);
			
		System.out.println ("Pot�ncia " + "(" + b + "^" + e + ")" + " = " + p);
		
		ler.close();
	}

}
