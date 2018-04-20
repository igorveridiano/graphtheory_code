package main;

import graph.Aresta;
import graph.Grafo;
import graph.Vertice;

import java.util.HashSet;
import java.util.Set;

public class Main {


    public static void main(String[] args) {

        Set<Vertice> vertices = new HashSet<Vertice>();
        Set<Aresta> arestas = new HashSet<Aresta>();

        Vertice v1 = new Vertice("v1");
        Vertice v2 = new Vertice("v2");
        Vertice v3 = new Vertice("v3");
        Vertice v4 = new Vertice("v4");

        Aresta aresta1 = new Aresta(v1, v2, 0);
        Aresta aresta4 = new Aresta(v4, v3, 0);

        vertices.add(v1);
        vertices.add(v2);
        vertices.add(v3);
        vertices.add(v4);

        arestas.add(aresta1);
        arestas.add(aresta4);

        Grafo grafo = new Grafo(vertices, arestas);
        
        System.out.println(grafo.ehConexo());
        System.out.println(grafo.toString());
        grafo.buscaLargura();
        grafo.buscaProfundidade();

    }

}
