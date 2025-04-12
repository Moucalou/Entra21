package program;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double first, second, result = 0;
		char question = 's';

		while (question != 'n') {
		System.out.println("===== CALCULADORA JAVA =====");
		System.out.println("Escolha uma operação: ");
		System.out.println("1 - Adição");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.println("0 - Sair");
		int option = sc.nextInt();
		sc.nextLine();
		
		if (option == 0) {
			question = 'n';
			return;
		}
		
			System.out.print("Digite o primeiro número: ");
			first = sc.nextDouble();
			System.out.print("Digite o segundo número: ");
			second = sc.nextDouble();
		
			switch (option) {
			case 1:
				result = first + second;
				break;
			case 2:
				result = first - second;
				break;
			case 3:
				result = first * second;
				break;
			case 4:
				result = first / second;
				break;
			}
			
			System.out.println("Resultado: " + result);
			
			sc.nextLine();
			System.out.print("Deseja realizar outra operação? (s/n): ");
			question = sc.next().charAt(0);
			
			}

	}

}
