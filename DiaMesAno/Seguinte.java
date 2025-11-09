package exercicio;

import java.util.Scanner;

public class Seguinte {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int dia, mes, ano, i = 1;

        while (i == 1) {
            System.out.println("Insira o dia:");
            dia = ler.nextInt();

            System.out.println("Insira o mês:");
            mes = ler.nextInt();

            System.out.println("Insira o ano:");
            ano = ler.nextInt();
            
            int diaAtual = dia, mesAtual = mes, anoAtual = ano;

            switch (mes) {
                case 2:
                    if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {                    
                        if (dia > 29) {
                            dia = 1;
                            mes++;
                        }
                    } else {
                        dia++;
                        if (dia > 28) {
                            dia = 1;
                            mes++;
                        }
                    }
                    break;

                case 4: 
                case 6: 
                case 9:
                case 11:                   
                    dia++;
                    if (dia > 30) {
                        dia = 1;
                        mes++;
                    }
                    break;

                case 1:
    			case 3:
    			case 5:
    			case 7:
    			case 8:
    			case 10:
    			case 12:
                    dia++;
                    if (dia > 31) {
                        dia = 1;
                        mes++;
                    }
                    break;
                    
                default: 
                	System.out.println("Valor inválido.");
            }

            if (mes > 12) {
                mes = 1;
                ano++;
            }
            
            System.out.println("Dia atual: " + diaAtual + "/" + mesAtual + "/" + anoAtual);

            System.out.println("Dia seguinte: " + dia + "/" + mes + "/" + ano);

            System.out.println("Deseja continuar? | 1- Sim | 2- Não");
            i = ler.nextInt();
        }

        ler.close();
    }
}
