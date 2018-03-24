package listaDuplamenteEncadeada;


public class NoDuplamenteEncadeado<T> {
	
	T valor;
	NoDuplamenteEncadeado<T> proximo;
	NoDuplamenteEncadeado<T> anterior;

	public NoDuplamenteEncadeado(T valor, NoDuplamenteEncadeado<T> proximo) {
		this.valor = valor;
		this.proximo = proximo;
	}

	public NoDuplamenteEncadeado(T valor) {
		this.valor = valor;
	}

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}

	public NoDuplamenteEncadeado<T> getProximo() {
		return proximo;
	}

	public void setProximo(NoDuplamenteEncadeado<T> proximo) {
		this.proximo = proximo;
	}

	public NoDuplamenteEncadeado<T> getAnterior() {
		return anterior;
	}

	public void setAnterior(NoDuplamenteEncadeado<T> anterior) {
		this.anterior = anterior;
	}
}
