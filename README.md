# Coding Dojo

### Problema 
Dado um grafo qualquer, desenvolver um algoritmo em java para verificar se ele é bipartido ou não. Um grafo bipartido é um grafo cujos vértices podem ser divididos em dois conjuntos disjuntos U e V, de modo que cada aresta conecta um vértice de U a um em V.

### Maneiras de resolver
**Existem duas maneiras de verificar se um grafo é bipartido:**  
a. Um grafo é bipartido, se e somente se, seu número cromático = 2 e, obrigatóriamente, os vértices adjacentes são de cores distintas.
Usando busca em profundidade (DFS), a ideia principal é atribuir a cada vértice uma cor diferente da cor do seu. Se existir uma aresta conectando o vértice atual
a um vértice anterior com a mesma cor, então pode-se afirmar que o grafo não é bipartido.   
  
b. Um grafo é bipartido, se e somente se, não contiver um ciclo ímpar. Usando busca em largura (BFS), a idéia é verificar se existe um ciclo ímpar no grafo, dessa
forma, iniciando no vértice v, se for encontrado um aresta, cujos vértices estão no mesmo nível, um ciclo foi encontrado, logo o grafo não é bipartido. O nível do
vértice u é definido por sua distância do vértice v, assim, se um vértice já foi visitado e o nível dos vértices u e v é o mesmo, implica que um ciclo impar foi
localizado, então pode-se afirmar que o grafo não é bipartido.

**Maneira escolhida para desenvolver a solução: a.**
