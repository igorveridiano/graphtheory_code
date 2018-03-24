package listaDuplamenteEncadeada;

public interface ILista<Tipo> {

	public boolean adicionar(Tipo valor);

	public boolean adicionar(int posicao, Tipo valor);

	public Tipo obter(int posicao);

	public void remover(int posicao);

	public boolean remover(Tipo valor);

	public boolean contem(Tipo valor);

	public int tamanho();

	public void limpar();
}
