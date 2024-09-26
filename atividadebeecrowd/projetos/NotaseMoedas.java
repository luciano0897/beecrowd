package projetos;

import java.util.Scanner;
public class NotaseMoedas {

	public static void main(String[] args) {
		/*Leia um valor de ponto flutuante com duas casas decimais. 
		Este valor representa um valor monetário. 
		A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. 
		As notas consideradas são de 100, 50, 20, 10, 5, 2. 
		As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01.
		A seguir mostre a relação de notas necessárias.*/
		
		Scanner et = new Scanner(System.in);
		
		int real = et.nextInt();
		int [] valor = {100, 50, 20, 10, 5, 2};
		double [] moeda = {1, 0.50, 0.25, 0.10, 0.05, 0.01}; 
		
		int cem =  real / valor[0] ;
		int restcem = real % valor[0];
		
		int cinc =  restcem / valor[1];
		int restcinc =  restcem % valor[1];
		
		int vint = restcinc / valor[2];
		int vintrest = restcinc % valor[2];
		
		int dez = vintrest / valor[3];
		int dezrest = vintrest % valor[3];
		
		int cinco = dezrest / valor[4];
		int cincorest = dezrest % valor[4];
		
		int dois = cincorest / valor[5];
		int doisrest = cincorest % valor[5];
		
		int um = (int) (doisrest / moeda[0]);
		
	System.out.print("NOTAS:");
	System.out.println(cem+ " nota(s) de R$ 100.00");
	System.out.println(cinc+ " nota(s) de R$ 50.00");
	System.out.println(vint+ " nota(s) de R$ 20.00");
	System.out.println(dez+" nota(s) de R$ 10.00");
	System.out.println(cinco+ " nota(s) de R$ 5.00");
	System.out.println(dois+" nota(s) de R$ 2.00");
	
	System.out.println("MOEDAS:");
	System.out.println(um+ "moeda(s) de R$ 1.00");
	System.out.println(" moeda(s) de R$ 0.50");
	System.out.println(" moeda(s) de R$ 0.25");
	System.out.println(" moeda(s) de R$ 0.10");	
	System.out.println(" moeda(s) de R$ 0.05");
	System.out.println(" moeda(s) de R$ 0.01");	
	
	}
	
}
