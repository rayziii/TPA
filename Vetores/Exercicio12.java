import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i=0, senhaInserir;
		boolean existe = true;
		int limite = 10;

			
		int a[] = new int[10];
		
		for ( i = 0; i < 10; i++ ) {
			
			a[i] = (int)(Math.random()*100);
			
		}
		
		System.out.println("Senhas existentes: ");
		for ( i = 0; i < 10; i++ ) {
			
			System.out.println(a[i]+" "); 
			
		}
	
		System.out.println(" ");
		
		

		for ( limite = 0; limite < 10; limite++ ) {
			
			System.out.println("--VERIFICAÇÃO DE SENHA--");
			System.out.println("Insira a sua senha: ");
			senhaInserir = ler.nextInt();
				
			for ( i = 0; i < 10; i++ ) {
				
					if ( a[i] == senhaInserir ) {
						
						existe = true;
						a[i] = 9999999;
						break;
						
					}
					
					else {
						
						existe = false;
						
					}
			}
			
			
				if ( existe == true ) {
					
					System.out.println(" ");
					System.out.println("Senha que você inseriu: " + senhaInserir );
					System.out.println("Sua senha existe.");
					System.out.println(" ");
					
				}
				else{
					
					System.out.println(" ");
					System.out.println("Senha que você inseriu: " + senhaInserir );
					System.out.println("Senha inválida.");
					System.out.println(" ");
					
				}
			}
		ler.close();
	}
}
