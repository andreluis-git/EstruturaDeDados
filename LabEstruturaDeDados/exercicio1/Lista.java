package exercicio1;

public class Lista {

    private Livro topo, anterior;
    public int totalDeObjetos = 0;
    
    //Adiciona elemento no fim da lista
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
    
  //Adiciona elemento em determinada posicao da lista
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
  //Adiciona elemento no inicio da lista  
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

    
  //Remove elemento no fim da lista
    public void removeFim() {
    	System.out.println(topo.toString());
        topo = topo.getAnterior();
        anterior = topo;
        totalDeObjetos--;
    }
    
  //Adiciona elemento em determinada posicao da lista  
    public void remove(int posicao) {
    	if(!posicaoValida(posicao)){
            throw new IllegalArgumentException("Posicao Invalida!");
        }
    	int auxPosicao = totalDeObjetos - posicao;
    	Livro auxLivro = topo;
    	if (auxPosicao == 0) {
    		removeFim();
    	}else {
    		while(auxPosicao > 1) {
    			auxLivro = auxLivro.getAnterior();
    			auxPosicao--;
    		}
    		System.out.println(auxLivro.getAnterior().toString());
    		auxLivro.setAnterior(auxLivro.getAnterior().anterior);
    		totalDeObjetos--;
    	}
    }
    
  //Adiciona elemento no inicio da lista
    public void removeInicio() {
    	int posicao = 1;
    	if(!posicaoValida(posicao)){
            throw new IllegalArgumentException("Posicao Invalida!");
        }
    	int auxPosicao = totalDeObjetos - posicao;
    	Livro auxLivro = topo;
    	if (auxPosicao == 0) {
    		removeFim();
    	}else {
    		while(auxPosicao > 1) {
    			auxLivro = auxLivro.getAnterior();
    			auxPosicao--;
    		}
    		System.out.println(auxLivro.getAnterior().toString());
    		auxLivro.setAnterior(auxLivro.getAnterior().anterior);
    		totalDeObjetos--;
    	}
    }

  //Retorna o elemento no topo da lista
    public Livro top() {
        return topo;
    }
    
  //Mostra todos elementos da lista
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
   
  //Retorna se a lista esta vazia
    public boolean estaVazia(){
    	if (totalDeObjetos == 0)
    		return true;
    	else
    		return false;
    }
}
