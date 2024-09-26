package projetos;
import java.util.Scanner;

public class Soma {

	

	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	int opcao = 0;
	
	
	

	
	do {
		System.out.println("Escolha una opção: ");
		System.out.println(" 1 - Iniciar o jogo");
		System.out.println("2 - Ajuadar");
		System.out.println("3 - Sair");
		System.out.println("4 - Ira somar 2 valores");
		System.out.println("Opção: ");
		opcao = scanner.nextInt();
		
		if (opcao == 4) {
			System.out.println("digite o valor: ");
			int valor1 = scanner.nextInt();
			System.out.println("digite o outro valor: ");
			int valor2 = scanner.nextInt();
			int resultado = valor1 + valor2;
			
			System.out.println(resultado);
		}
		
		
	}while (opcao == 3);
	System.out.println("Obrigado pela sua Atenção tenha um otimo dia ");
		
	
	

	}

}
