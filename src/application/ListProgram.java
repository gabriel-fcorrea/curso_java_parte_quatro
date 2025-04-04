package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListProgram {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); // utiliza-se para inserir um elemento em determinada posição da lista

		System.out.println(list.size()); // utiliza-se para consultar o tamanho da lista

		list.remove("Anna"); // utiliza-se para remover um elemento de acordo com a comparação do valor
		list.remove(1); // utiliza-se para remover um elemento de acordo com a posição na lista

		for (String obj : list) {
			System.out.println(obj);
		}

		// FUNÇÃO LAMBDA:
		// "->" lê-se como "tal que"
		// no exemplo abaixo, "remove se" toda a String "obj" (lista) tal que a primeira
		// letra seja 'M'
		list.removeIf(obj -> obj.charAt(0) == 'M'); // remove um elemento por PREDICADO, ou seja, de acordo com as
													// condições inseridas
		System.out.println("----------------------------");
		for (String obj : list) {
			System.out.println(obj);
		}

		list.add("Maria");
		list.add("Alex");
		list.add("Anna");
		list.add(2, "Marco");

		// para encontrar a posição de um elemento: indexOf

		int a = list.indexOf("Anna");

		System.out.println("----------------------------");
		System.out.println("indexOf:" + a);

		// para mostrar apenas um elemento de acordo com o predicado:
		List<String> result = list.stream().filter(obj -> obj.charAt(0) == 'A').collect(Collectors.toList());
		// cria-se uma lista nova só para os resultados
		// referencia a lista original (list.stream) e transforma em lambda
		// filtra de acordo com as preferências de busca (filter)
		// transforma lambda novamente em lista do tipo String (Collectors.toList)

		System.out.println("----------------------------");

		for (String x : result) {
			System.out.println(x);
		}

		// para encontrar o primeiro elemento de acordo com o critério de filtragem:
		// orElse retorna nulo caso não seja encontrado
		String name = list.stream().filter(obj -> obj.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println("----------------------------");
		for (String obj : list) {
			System.out.println(obj);
		}

		System.out.println("----------------------------");
		System.out.println(name);

	}
}
