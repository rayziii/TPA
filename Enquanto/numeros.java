package exerciciosWhile;
import java.util.Scanner;

public class numeros {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int i = 0;
		
		while (i <= 100) {
			System.out.println (i);
			
			i++;
		}
		
		ler.close();
	}

}
