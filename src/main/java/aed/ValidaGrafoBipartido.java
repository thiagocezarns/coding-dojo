package aed;

import aed.grafo.Aresta;
import aed.grafo.Grafo;
import aed.grafo.Vertice;

public class ValidaGrafoBipartido<T> {

    private Grafo<T> grafo;
    private boolean bipartido;

    ValidaGrafoBipartido(Grafo<T> grafo) {
        setGrafo(grafo);
        setBipartido(true);
    }

    public Grafo<T> getGrafo() {
        return this.grafo;
    }

    public void setGrafo(Grafo<T> grafo) {
        this.grafo = grafo;
    }

    private boolean getBipartido() {
        return this.bipartido;
    }

    private void setBipartido(boolean v) {
        this.bipartido = v;
    }

    public void ehBipartido() {
        this.DFS();
        if(getBipartido())
            System.out.println("Eh bipartido.");
        else
            System.out.println("Nao eh bipartido");
    }

    private void DFS() {
        for (Vertice<T> vertice : this.getGrafo().getVertices()) {
            if (!vertice.getVisitado()) {
                dfs(vertice, "verde");
            }
        }
    }

    public void dfs(Vertice<T> vertice, String cor) {
        vertice.setVisitado(true);
        vertice.setCor(cor);
        for (Aresta<T> adjacente : vertice.getAdjacentes()) {
            if (!adjacente.getVerticeDestino().getVisitado()) {
                cor = vertice.getCor().equals("verde") ? "amarelo" : "verde";
                dfs(adjacente.getVerticeDestino(), cor);
            } else {
                if (vertice.getCor().equals(adjacente.getVerticeDestino().getCor())) {
                    this.setBipartido(false);
                    return;
                }
            }
        }
    }
}

