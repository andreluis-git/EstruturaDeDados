# Laboratório de Estruturas de Dados Lineares e Recursividade

**1. Implementamos a lista encadeada Livros.java, com os métodos adiciona(), remove() e mostraLivros(). Com base nesta lista, implementar as demais operações de uma lista encadeada, a saber:**
- método para adicionar um elemento no fim da lista. 
- método para adicionar um elemento no início da lista. c) método para adicionar um elemento numa determinada posição da lista. 
- método para remover um elemento no fim da lista. 
- método para remover um elemento no início da lista. 
- método para remover um elemento numa determinada posição da lista. 
- qual é o tamanho da lista? 
- a lista está vazia?

[Resolução](https://github.com/andreluis-git/EstruturaDeDados/tree/main/LabEstruturaDeDados/exercicio1)

**2) A partir da lista sequencial ListaVetor.java, reescrever a classe CarrinhoDeCompras.java substituindo o uso da classe ArrayList pela ListaVetor. Construa os métodos para adicionar, remover, consultar quantas pizzas há no carrinho de compras. Crie uma classe Principal e nela crie objetos das classes Pizza e CarrinhoDeCompras. Adicione objetos da classe Pizza ao objeto da classe CarrinhoDeCompras. Responda: Quantas pizzas há no carrinho? Remova uma das pizzas do carrinho e responda novamente quantas pizzas há no carrinho. Considerando que os objetos da classe Pizza possuem preço, responda qual é o valor de cada carrinho.**

[Resolução](https://github.com/andreluis-git/EstruturaDeDados/tree/main/LabEstruturaDeDados/exercicio2)

**3) Transformar a lista encadeada de devem constar na sua pilha:**
- empilhar()
- desempilhar() 
- topo(), mostra o elemento que está no topo da pilha, sem desempilhar 
- get(), retorna o elemento que está no topo da pilha, desempilhando. 
- tamanho(), retorna o tamanho da pilha (quantos elementos há). 

[Resolução](https://github.com/andreluis-git/EstruturaDeDados/tree/main/LabEstruturaDeDados/exercicio3)

**4) Crie uma Fila de Estudantes, Sequencial e outra Encadeada respeitando a política FIFO. Sua fila deverá ter os seguintes métodos:**
- enfileirar(), adiciona um novo elemento no fim da fila. 
- desenfileirar(), remove o elemento que está na cabeça da fila 
- cabeca(), mostra quem é o 1o elemento da fila. 
- cauda(), mostra os elementos da cauda da fila. 

[Resolução](https://github.com/andreluis-git/EstruturaDeDados/tree/main/LabEstruturaDeDados/exercicio4)

**5) O algoritmo recursivo abaixo retorna o maior elemento do vetor. A fim de demonstrar que você entendeu a ideia do algoritmo, apresente um teste de mesa que ilustra de modo criativo o funcionamento do algoritmo.**
```
public static int maior(int v[], int inicio, int fim) {
  int meio = (inicio+fim)/2; 
  int n1, n2;
  if(meio>inicio){ 
  n1=maior(v, inicio, meio); 
  n2=maior(v, meio+1, fim); 
  } else{
  n1=v[inicio]; 
  n2=v[fim];
  } if(n1>n2) return n1; else return n2;
} 
```

[Resolução](https://github.com/andreluis-git/EstruturaDeDados/tree/main/LabEstruturaDeDados/exercicio5)

**6) Considerando que você fez a questão 5 corretamente, escreva um algoritmo recursivo que encontra o MENOR elemento do vetor de inteiros sem usar nenhum laço.**

[Resolução](https://github.com/andreluis-git/EstruturaDeDados/tree/main/LabEstruturaDeDados/exercicio6)
