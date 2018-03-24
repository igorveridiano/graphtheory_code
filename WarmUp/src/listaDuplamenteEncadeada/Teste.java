package listaDuplamenteEncadeada;

public class Teste {

	public static void main(String[] args) {
		ListaDuplamenteEncadeada<Integer> lista = new ListaDuplamenteEncadeada<>();
		Integer valor = 3;
		System.out.println(lista);
		lista.adicionar(4);
		System.out.println(lista);
		lista.adicionarNoInicio(3);
		System.out.println(lista);
		lista.adicionar(1, 3);
		System.out.println(lista);
		lista.adicionarNoFim(5);
		System.out.println(lista);
		lista.adicionar(3);
		System.out.println(lista);
		lista.adicionarNoInicio(1);
		System.out.println(lista);
		lista.adicionarNoInicio(0);
		System.out.println(lista);
		lista.contem(3);
		lista.contem(100);
		System.out.println(lista.obter(3));
		lista.remover(valor);
		System.out.println(lista);
		lista.removerDoFim();
		System.out.println(lista);
		lista.removerDoInicio();
		System.out.println(lista);
		System.out.println(lista.tamanho());
		lista.limpar();
		System.out.println(lista);
	}

}
