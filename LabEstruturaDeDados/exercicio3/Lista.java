package exercicio3;

public class Lista {

    private Livro topo, anterior;
    public int totalDeObjetos = 0;

    //Adiciona o elemento no fim da lista
    public void adicionaFim(Livro livro) { 
        if (topo == null) {
            topo = livro;
        } else {
        	anterior = topo;
            topo = livro;
            topo.setAnterior(anterior);
        }
        totalDeObjetos++;
    }
    
  //Adiciona o elemento em determinada posicao da lista
    public void adiciona(int posicao, Livro livro) { 
    	if(!posicaoValida(posicao)){
    		throw new IllegalArgumentException("Posicao Invalida!");
    	}
    	int auxPosicao = totalDeObjetos - posicao;
    	Livro auxLivro = topo;
    	while(auxPosicao > 0) {
    		auxLivro = auxLivro.getAnterior();
    		auxPosicao--;
    	}
    	System.out.println(auxLivro.toString());
    	livro.setAnterior(auxLivro.getAnterior());
    	auxLivro.setAnterior(livro);
        totalDeObjetos++;
    }
    
  //Adiciona o elemento no inicio da lista
    public void adicionaInicio(Livro livro) { 
    	int posicao = 1;
    	if(!posicaoValida(posicao)){
    		throw new IllegalArgumentException("Posicao Invalida!");
    	}
    	int auxPosicao = totalDeObjetos - posicao;
    	Livro auxLivro = topo;
    	while(auxPosicao > 0) {
    		auxLivro = auxLivro.getAnterior();
    		auxPosicao--;
    	}
    	livro.setAnterior(auxLivro.getAnterior());
    	auxLivro.setAnterior(livro);
        totalDeObjetos++;
    }

  //Remove o elemento do fim da fila
    public Livro removeFim() {
    	Livro auxReturn = topo;
        topo = topo.getAnterior();
        anterior = topo;
        totalDeObjetos--;
        return auxReturn;
    }
    
  //Remove o elemento de determinada posicao da lista
    public Livro remove(int posicao) {
    	if(!posicaoValida(posicao)){
            throw new IllegalArgumentException("Posicao Invalida!");
        }
    	int auxPosicao = totalDeObjetos - posicao;
    	Livro auxLivro = topo;
    	if (auxPosicao == 0) {
    		return removeFim();
    	}else {
    		while(auxPosicao > 1) {
    			auxLivro = auxLivro.getAnterior();
    			auxPosicao--;
    		}
    		Livro auxReturn = auxLivro.getAnterior();
    		auxLivro.setAnterior(auxLivro.getAnterior().anterior);
    		totalDeObjetos--;
    		return auxReturn;
    	}
    }
    
  //Remove o elemento do inicio da lista
    public Livro removeInicio() {
    	int posicao = 1;
    	if(!posicaoValida(posicao)){
            throw new IllegalArgumentException("Posicao Invalida!");
        }
    	int auxPosicao = totalDeObjetos - posicao;
    	Livro auxLivro = topo;
    	if (auxPosicao == 0) {
    		return removeFim();
    	}else {
    		while(auxPosicao > 1) {
    			auxLivro = auxLivro.getAnterior();
    			auxPosicao--;
    		}
    		Livro auxReturn = auxLivro.getAnterior();
    		auxLivro.setAnterior(auxLivro.getAnterior().anterior);
    		totalDeObjetos--;
    		return auxReturn;
    	}
    }

  //Retorna o elemento que esta no topo da lista sem remover
    public Livro top() {
        return topo;
    }

  //Mostra todos elementos presentes na lista
    public void mostraLivros() {
        Livro aux = topo;

        while (aux != null) {
            System.out.println(aux.toString());
            aux = aux.getAnterior();
        }
    }
    
  //Verifica se a posicao digitada existe na lista
    private boolean posicaoValida(int posicao){
        return posicao>=0 && posicao<=totalDeObjetos;
    }
    
  //Retorna o tamanho da lista
    public int tamanho(){
        return totalDeObjetos;
    }
    
  //Verifica se a lista esta vazia
    public boolean estaVazia(){
    	if (totalDeObjetos == 0)
    		return true;
    	else
    		return false;
    }
}
