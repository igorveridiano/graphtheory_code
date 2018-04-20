package graph;

import graph.interfaces.IGrafo;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;



public class Grafo implements IGrafo {

    private Set<Vertice> vertices = new HashSet<Vertice>();
    private Set<Aresta> arestas = new HashSet<Aresta>();
    private Queue<Vertice> queue = new LinkedList<>();
    private Stack<Vertice> stack = new Stack<>();

    public Grafo(Set<Vertice> vertices, Set<Aresta> arestas) {
        this.vertices = vertices;
        this.arestas = arestas;
    }

    @Override
    public Set<Vertice> getAdjacentes(Vertice v) {
        Set<Vertice> adjacentes = new HashSet<Vertice>();

        for(Aresta aresta: this.arestas) {
            if(aresta.getA() == v) {
                adjacentes.add(aresta.getB());
            }

            if(aresta.getB() == v) {
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
			this.queue.add(vertice1);
			while (!this.queue.isEmpty()){
				vertice1 = this.queue.poll();
				for (Vertice vertice2 : getAdjacentes(vertice1)) {
					if (vertice2.isVisited() == false){
						vertice2.setVisited(true);
						this.queue.add(vertice2);
						cont++;
					}	
				}
			}
			if (this.vertices.size() == cont){
				for (Vertice vertice : this.vertices) {
					vertice.setVisited(false);
				}
				return true;
			} else {
				for (Vertice vertice : this.vertices) {
					vertice.setVisited(false);
				}
				return false;
			}
		}
        return true;
    }

    @Override
    public void buscaLargura() {
    	int cont = 0;
    	for (Vertice vertice1 : this.vertices) {
			vertice1.setVisited(true);
			this.queue.add(vertice1);
			cont++;
			System.out.println("Grafo: ");
			while (!this.queue.isEmpty()){
				vertice1 = this.queue.poll();
				System.out.print(vertice1.getNome());
				for (Vertice vertice2 : getAdjacentes(vertice1)) {
					if (vertice2.isVisited() == false){
						vertice2.setVisited(true);
						this.queue.add(vertice2);
						cont++;
						System.out.print(", ");
					}	
				}
			}
			if (this.vertices.size() == cont){
				System.out.println("\n");
				break;
			} else {
				System.out.println("\n");
			}
		}
    	for (Vertice vertice : this.vertices) {
			vertice.setVisited(false);
		}
    }

    @Override
    public void buscaProfundidade() {
    	int cont = 0;
    	for (Vertice vertice1 : this.vertices) {
			vertice1.setVisited(true);
			this.stack.add(vertice1);
			System.out.println("Grafo: ");
			while (!this.stack.isEmpty()){
				for (Vertice vertice2 : getAdjacentes(vertice1)) {
	    			if (vertice2.isVisited() == false) {
	    				vertice2.setVisited(true);
	    				this.stack.add(vertice2);
	    				vertice1 = vertice2;
	    			}
				}
				if (this.stack.size() > 1){
					System.out.print(this.stack.pop().getNome() + ", ");
					cont++;
				} else {
					System.out.print(this.stack.pop().getNome());
					cont++;
				}
			}
			if (this.vertices.size() == cont){
				System.out.println("\n");
				break;
			} else {
				System.out.println("\n");
			}
		}
    	for (Vertice vertice : this.vertices) {
			vertice.setVisited(false);
		}
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
