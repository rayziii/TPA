import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		
		for (int i = 1; i <= 10; i++) {
			
			for (int t = 1; t <= 10; t++) {
				
				System.out.println (i + " x " + t + " = " + t * i);
			}
		}
	
		ler.close();
	} 

}
