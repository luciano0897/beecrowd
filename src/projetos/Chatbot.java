package projetos;

import java.util.Random;
import java.util.Scanner;


public class Chatbot {
	

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		
		System.out.println("Digite o número de termos que deseja somar: ");
		int n = entrada.nextInt();
		int p = entrada.nextInt();
		int total = p + n;
		Random rd = new Random();
		
		
		
		for (int i = 1; i <= total; i++) {
			System.out.println(rd.nextInt(i));
		}
		
	}

}

