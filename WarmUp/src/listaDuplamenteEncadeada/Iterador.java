package listaDuplamenteEncadeada;

public class Iterador<T> implements java.util.Iterator<T> {

	private ListaDuplamenteEncadeada<T> listaDuplamenteEncadeada;
	private int posicao;

	public Iterador(ListaDuplamenteEncadeada<T> listaDuplamenteEncadeada) {
		this.listaDuplamenteEncadeada = listaDuplamenteEncadeada;
	}

	@Override
	public boolean hasNext() {
		return this.posicao >= 0 && this.posicao < this.listaDuplamenteEncadeada.tamanho;
	}

	@Override
	public T next() {
		return this.listaDuplamenteEncadeada.obter(posicao++);
	}

}
