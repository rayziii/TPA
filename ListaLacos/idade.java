package lacosJava;
import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);

		int i, anoA, anoN, idade;
	
		
		do {
			
			System.out.println ("Insira o ano atual:");
			anoA = ler.nextInt();
			
			System.out.println ("Insira o ano de nascimento do usuário:");
			anoN = ler.nextInt();
			
			idade = anoA - anoN;
			
			System.out.println ("A idade do usuário é: " + idade);
			
			System.out.println ("Deseja continuar? 0- Sim. | 1- Não.");
			i = ler.nextInt();
			
		} while (i == 0);
		
		ler.close();
	}

}
