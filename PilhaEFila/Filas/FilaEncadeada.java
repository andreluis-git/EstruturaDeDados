package Filas;

public class FilaEncadeada {
    private class No {
        Candidato item;
        No prox;        
    }
    
    private No inicio;
    private No fim;

    // Operações
    public FilaEncadeada() { //  Cria uma Fila vazia
        this.inicio = new No();
        this.fim = this.inicio;
        this.inicio.prox = null;
    }

    public void enfileira(Candidato candidato) {
        this.fim.prox = new No();
        this.fim = this.fim.prox;
        this.fim.item = candidato;
        this.fim.prox = null;
    }

    public Candidato desenfileira() throws Exception {
    	Candidato valor = null;
        if (this.vazia()) {
            throw new Exception("Erro: A fila esta vazia");
        }
        this.inicio = this.inicio.prox;
        valor = this.inicio.item;
        return valor;
    }

    public boolean vazia() {
        return (this.inicio == this.fim);
    }


    public void imprime() {
        No aux;
        aux = this.inicio.prox;
        while (aux != null) {
            System.out.print(" " + aux.item.nome.toString());
            aux = aux.prox;
        }
        System.out.println();
    }
}
