package src;
import java.util.Scanner;

public class salario {
	public static void main (String [] args) {
		Scanner ler = new Scanner (System.in);
		double salario;
		
		System.out.println ("Digite o valor do sal�rio: R$");
		salario = ler.nextDouble();
		
		if (salario<1302) {
			System.out.println ("Abaixo do sal�rio m�nimo.");
			}else { 
				System.out.println ("Acima do sal�rio m�nimo.");
			}
	}

}

