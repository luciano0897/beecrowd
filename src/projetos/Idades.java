package projetos;

import java.util.Scanner;

public class Idades {

	public static void main(String[] args) {
		/*Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias.
		Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 
		363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.*/
		Scanner scanner = new Scanner(System.in);
		
		int diasano = 365;
		int mes = 30;
		int meses = 12;
		int entradaDia = scanner.nextInt();
		
		
		int anos =  entradaDia / diasano;
		int anosdia =  entradaDia % diasano;
		
		
		int divmeses = anosdia / mes;
		int divdia = anosdia % mes;

		
	
		
		
		System.out.println(anos+" ano(s)");
		System.out.println(divmeses+" mes(es)");
		System.out.println(divdia+" dia(s)");
		

	}

}
