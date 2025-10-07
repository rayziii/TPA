package src;
import java.util.Scanner;

public class clima {
	public static void main (String [] args) {
		Scanner ler = new Scanner (System.in);
		int tempFah, tempCel;
		
		System.out.println ("Insira a temperatura em Fahrenheit (°F): ");
		tempFah = ler.nextInt ();
		
		tempCel = (tempFah-32)*5/9;
	
		if (tempCel<15) {
			System.out.println (tempCel + "°C Frio.");
		} else if (tempCel>=15 && tempCel<22) {
			System.out.println (tempCel + "°C Ameno.");
		} else if (tempCel>=22) { 
			System.out.println (tempCel + "°C Calor.");
		}
		ler.close();
	}
}
