package exSwitch;
import java.util.Scanner;

public class placaVeiculo {
	public static void main (String [] args) {
		
		Scanner ler = new Scanner (System.in);
		int numPlaca;
		
		System.out.println ("Insira o último número da placa do veículo: ");
		numPlaca = ler.nextInt();
		
		switch (numPlaca) {
			case 1: 
				System.out.println ("Não pode circular no domingo.");
				break;
			case 2:
				System.out.println ("Não pode circular na segunda-feira.");
				break;
			case 3:
				System.out.println ("Não pode circular na terça-feira.");
				break;
			case 4:
				System.out.println ("Não pode circular na quarta-feira.");
				break;
			case 5:
				System.out.println ("Não pode circular na quinta-feira.");
				break;
			case 6:
				System.out.println ("Não pode circular na sexta-feira.");
				break;
			case 7:
				System.out.println ("Não pode circular no sábado.");
				break;
			default:
				System.out.println ("Valor inválido.");
				
		} ler.close();
		
	} 

}
