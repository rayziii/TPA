import java.util.Scanner;

public class ContagemMil {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int i;
		
		for (i=1; i < 1001; i = i + 2) {
			System.out.print (i + " ");
		}
		
		ler.close();
	}
	
}
