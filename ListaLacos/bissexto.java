package lacosJava;

import java.util.Scanner;

public class bissexto {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int i = 0, anoB = 0, anoI, anoF;
		
		System.out.println ("Insira o ano inicial:");
		anoI = ler.nextInt();
		
		System.out.println ("Insira o ano final:");
		anoF = ler.nextInt();
		
		while (anoB < anoI) {
			anoB = anoB + 4;
		}
		
		while (anoB < anoF) {
			i++;
			anoB = anoB + 4;
			System.out.println ("Ano Bissexto: " + anoB);
		}
		
		System.out.println ("Nesse período, tem " + i + " anos bissextos.");
		
		ler.close();
	}

}
