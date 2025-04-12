package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio44 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> lista = new ArrayList<>();
		List<Integer> listamaiores = new ArrayList<>();
		
		int cont = 0;
		
		System.out.print("Informe o tamanho da lista: ");
		int N = sc.nextInt();
		sc.nextLine();
		
		//leitura dos numeros
		for (int i = 0; i < N; i++) {
			lista.add(sc.nextInt());
		}
		
		//validação dos maiores
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				//se i for menor que j, contador adiciona 1 vez que o numero é menor que outro
				if (lista.get(i) < lista.get(j)) {
					cont++;
				}
			}
			//se o contador for menor que 3, numero adicionado aos maiores
			if (cont < 3) {
				listamaiores.add(lista.get(i));
			}
			//zera o contador pra verificar o proximo i
			cont = 0;
		}
		
		
		System.out.println(listamaiores);
	}

}
