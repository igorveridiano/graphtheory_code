package graph;

public class Vertice implements Comparable<Vertice> {

    private String nome;
    private boolean visited = false;

    public Vertice(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public String toString() {
        return this.getNome();
    }

    public int compareTo(Vertice vertice) {
        return this.getNome().compareTo(vertice.getNome());
    }

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

}
