package exercicio4;

public class FilaEncadeada {
	private class No {
        Estudante item;
        No prox;
    }
    
    private No inicio;
    private No fim;

//  Cria uma Fila vazia
    public FilaEncadeada() { 
        this.inicio = new No();
        this.fim = this.inicio;
        this.inicio.item = null;
        this.fim.item = null;
    }

    //Adiciona o elemento no fim da fila
    public void enfileira(Estudante candidato) {
        this.fim.prox = new No();
        this.fim = this.fim.prox;
        this.fim.item = candidato;
        this.fim.prox = null;
    }
    
  //Retorna e remove o elemento do fim da fila
    public Estudante desenfileira() throws Exception {
    	Estudante valor = null;
        if (this.vazia()) {
            throw new Exception("Erro: A fila esta vazia");
        }
        this.inicio = this.inicio.prox;
        valor = this.inicio.item;
        return valor;
    }
    
  //Retorna o elemento que esta no inicio da fila
    public void cabeca() throws Exception {
    	if (this.vazia()) {
    		throw new Exception("Erro: A fila esta vazia");
    	}
    	No valor = this.inicio.prox;
        Estudante estudante = valor.item;
        estudante.mostrarEstudante();
    }
    
  //Retorna o elemento que esta no fim da fila
    public void cauda() throws Exception {
    	if (this.vazia()) {
    		throw new Exception("Erro: A fila esta vazia");
    	}
        No aux = fim;
        Estudante estudante = aux.item;
        estudante.mostrarEstudante();
    }
    
  //Retorna se a fila esta vazia
    public boolean vazia() {
        return (this.inicio.item == this.fim.item);
    }

  //Mostra todos os elementos da fila
    public void imprime() {
        No aux;
        Estudante estudante;
        aux = this.inicio.prox;
        while (aux != null) {
        	estudante = aux.item;
            estudante.mostrarEstudante();
            aux = aux.prox;
        }
        System.out.println();
    }
}