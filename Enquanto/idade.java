package exerciciosWhile;
import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int i = 1, id, qtdMa = 0, qtdMe = 0;
		
		
		while (i <= 5) {
			System.out.println("Insira a idade: ");
			id = ler.nextInt();
			
			if (id >= 18) {
				qtdMa = qtdMa + 1;
				
			} else {
				qtdMe = qtdMe + 1;
				
			}
			i++;
		}
		
		System.out.println ("Maiores de idade= " + qtdMa);
		System.out.println ("Menores de idade= " + qtdMe);
		
		 ler.close();

	}

}
