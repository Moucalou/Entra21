package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> lista = new ArrayList<>();
		
		System.out.print("Informe o tamanho da lista: ");
		int N = sc.nextInt();
		sc.nextLine();
		int numero;
		
		for (int i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			numero = sc.nextInt();
			lista.add(numero);
		}
		
		System.out.print("Qual numero você quer encontrar? ");
		int procurar = sc.nextInt();
		
		if (lista.contains(procurar)) {
			System.out.println("Este numero está na lista");
		} else {
			System.out.println("Esse numero não está na lista");
		}
		
		sc.close();
		
	}

}
