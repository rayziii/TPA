package src;
import java.util.Scanner;

public class numeros {
	public static void main (String [] args) {
		Scanner ler = new Scanner (System.in);
		double numero;
		
		System.out.println ("Digite o n�mero: ");
		numero = ler.nextDouble();
		
		if (numero< 0) {
			System.out.println ("Negativo.");
		}else if (numero== 0) {
			System.out.println ("Neutro.");	
		}else {
			System.out.println ("Positivo.");
		}
	ler.close();
	}

}




