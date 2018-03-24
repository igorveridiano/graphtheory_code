package listaDuplamenteEncadeada;

public interface IListaDuplamenteEncadeada<T> extends ILista<T> {

	public boolean adicionarNoInicio(T valor);

	public boolean adicionarNoFim(T valor);

	public void removerDoInicio();

	public void removerDoFim();
}
