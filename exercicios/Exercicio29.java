package exercicios;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escreva uma palavra: ");
		String palavra = sc.nextLine();		
		
		int p = palavra.length();
		boolean d = true;
		for (int i = 0; i < palavra.length(); i++) {
			p--;
			if (!(palavra.charAt(i) == palavra.charAt(p))) {
				d = false;
			}
		}
		if (d) {
			System.out.println("Palindromo");
		} else {
			System.out.println("Não é Palindromo");
		}

	}

}
