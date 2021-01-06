package exercicio3;

public class Pilha {

    private Livro topo, anterior;
    public int totalDeObjetos = 0;

  //Adiciona o elemento no topo da pilha
    public void empilhar(Livro livro) { //empilhar
        if (anterior == null) {
            anterior = livro;
        } else {
            topo = livro;
            topo.setAnterior(anterior);
            anterior = topo;
        }
        totalDeObjetos++;
    }
    
  //Remove o elemento do topo da pilha
    public void desempilhar() {
        topo = topo.getAnterior();
        anterior = topo;
        totalDeObjetos--;
    }

  //Retorna e remove o elemento do topo da pilha
    public Livro get() {
    	Livro auxReturn = topo;
        topo = topo.getAnterior();
        anterior = topo;
        totalDeObjetos--;
        return auxReturn;
    }

  //Retorna o elemento do topo da pilha sem remover
    public Livro top() {
        return topo;
    }

  //Mostra todos elementos da pilha
    public void mostraLivros() {
        Livro aux = topo;
        while (aux != null) {
            System.out.println(aux.toString());
            aux = aux.getAnterior();
        }
    }
    
  //Retorna o tamanho da pilha
    public int tamanho(){
        return totalDeObjetos;
    }
}
