package fila;

import java.util.Iterator;

import listaDuplamenteEncadeada.Iterador;
import listaDuplamenteEncadeada.ListaDuplamenteEncadeada;

public class FilaDupEnc<T> implements IFila<T> {

	ListaDuplamenteEncadeada<T> filaEncadeada = new ListaDuplamenteEncadeada<>();
	private int inicio = 0;
	private int size = 0;
	private T elemento;

	@Override
	public void enfileirar(T elemento) {
		filaEncadeada.adicionarNoFim(elemento);
		setSize(getSize() + 1);
	}

	@Override
	public T desenfileirar() {
		setElemento(filaEncadeada.obter(this.inicio));
		filaEncadeada.removerDoInicio();
		setSize(getSize() - 1);
		return getElemento();
	}

	@Override
	public T primeiro() {
		return this.filaEncadeada.obter(this.inicio);
	}

	@Override
	public int tamanho() {
		return getSize();
	}

	@Override
	public boolean vazia() {
		return getSize() == 0;
	}

	@Override
	public void limpar() {
		this.filaEncadeada.limpar();
		setSize(0);
	}

	@Override
	public Iterator<T> iterator() {
		return new Iterador<>(filaEncadeada);
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public T getElemento() {
		return elemento;
	}

	public void setElemento(T elemento) {
		this.elemento = elemento;
	}

}
