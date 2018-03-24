package graph;

import java.util.HashSet;
import java.util.Set;

import fila.FilaDupEnc;
import graph.interfaces.IGrafo;


public class Grafo implements IGrafo {

    private Set<Vertice> vertices = new HashSet<Vertice>();
    private Set<Aresta> arestas = new HashSet<Aresta>();
    private FilaDupEnc<Vertice> queue = new FilaDupEnc<> ();

    public Grafo(Set<Vertice> vertices, Set<Aresta> arestas) {
        this.vertices = vertices;
        this.arestas = arestas;
    }

    @Override
    public boolean ehCompleto() {
    	for (Vertice vertice : this.vertices) {
			if (getAdjacentes(vertice).size() == vertices.size() - 1){
				
			} else {
				return false;
			}
		}
        return true;
    }
 
    @Override
    public Set<Vertice> getAdjacentes(Vertice v) {
        Set<Vertice> adjacentes = new HashSet<Vertice>();
        for (Aresta aresta : this.arestas) {
			if (aresta.getA().equals(v)){
				adjacentes.add(aresta.getB());
			} else if (aresta.getB().equals(v)) {
				adjacentes.add(aresta.getA());
			}
		}
        return adjacentes;
    }
    
    @Override
    public boolean ehConexo() {
    	int cont = 1;
    	for (Vertice vertice1 : this.vertices) {
			vertice1.setVisited(true);
			this.queue.enfileirar(vertice1);
			while (!this.queue.vazia()){
				vertice1 = this.queue.desenfileirar();
				for (Vertice vertice2 : getAdjacentes(vertice1)) {
					if (vertice2.isVisited() == false){
						vertice2.setVisited(true);
						this.queue.enfileirar(vertice2);
						cont++;
					}	
				}
			}
			if (this.vertices.size() == cont){
				return true;
			} else {
				return false;
			}
		}
        return true;
    }

    @Override
    public boolean ehRegular() {
    	for (Vertice vertice1 : this.vertices) {
			for (Vertice vertice2 : this.vertices) {
				if(getAdjacentes(vertice1).size() == getAdjacentes(vertice2).size()){
					
				} else {
					return false;
				}
			}
		}
        return true;
    }

    @Override
    public String toString() {

        String retorno = "";

        for(Vertice v: vertices) {
            retorno += v.toString() + "[ ";

            Set<Vertice> adjacentes = this.getAdjacentes(v);

            for(Vertice adj: adjacentes) {
                retorno += adj.toString() + " ";
            }

            retorno += "]\n";


        }

        return retorno;
    }


}
