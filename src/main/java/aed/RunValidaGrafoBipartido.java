package aed;


import aed.grafo.Grafo;
import aed.grafo.Vertice;

public class RunValidaGrafoBipartido {

    public static void main(String[] args) {

        Grafo<String> G = new Grafo<>();
        Grafo<String> GB = new Grafo<>();

        Vertice<String> a = G.addVertice("a");
        Vertice<String> b = G.addVertice("b");
        Vertice<String> c = G.addVertice("c");
        Vertice<String> d = G.addVertice("d");
        Vertice<String> e = G.addVertice("e");
        Vertice<String> f = G.addVertice("f");
        Vertice<String> g = G.addVertice("g");
        Vertice<String> h = G.addVertice("h");
        Vertice<String> i = G.addVertice("i");

        G.addAresta(a,b);
        G.addAresta(a,c);
        G.addAresta(a,f);
        G.addAresta(b,g);
        G.addAresta(b,h);
        G.addAresta(c,i);
        G.addAresta(c,d);
        G.addAresta(d,i);
        G.addAresta(e,f);
        G.addAresta(e,g);



        a = GB.addVertice("a");
        b = GB.addVertice("b");
        c = GB.addVertice("c");
        d = GB.addVertice("d");
        e = GB.addVertice("e");
        f = GB.addVertice("f");
        g = GB.addVertice("g");
        h = GB.addVertice("h");
        i = GB.addVertice("i");

        GB.addAresta(a,b);
        GB.addAresta(a,d);
        GB.addAresta(a,h);
        GB.addAresta(b,c);
        GB.addAresta(b,i);
        GB.addAresta(b,g);
        GB.addAresta(c,d);
        GB.addAresta(c,f);
        GB.addAresta(d,i);
        GB.addAresta(d,e);
        GB.addAresta(e,h);
        GB.addAresta(e,f);
        GB.addAresta(f,g);
        GB.addAresta(f,i);
        GB.addAresta(g,h);
        GB.addAresta(h,i);

        ValidaGrafoBipartido<String> grafoG = new ValidaGrafoBipartido<>(G);
        ValidaGrafoBipartido<String> grafoGB = new ValidaGrafoBipartido<>(GB);

        grafoGB.ehBipartido();
        grafoG.ehBipartido();
    }
}

