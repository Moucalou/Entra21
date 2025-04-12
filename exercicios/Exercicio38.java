package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercicio38 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> lista = new ArrayList<>();
		
		System.out.print("Digite o tamanho da lista: ");
		int N = sc.nextInt();
		
		Random gerador = new Random();
		int numero = gerador.nextInt(100);
		
		for (int i = 0; i < N; i++) {
			if (!lista.contains(numero)) {
				lista.add(numero);
				numero = gerador.nextInt(100);
			} else {
				numero = gerador.nextInt(100);
			}
		}
		
		System.out.println(lista);
	}

}
