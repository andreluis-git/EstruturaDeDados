package exercicio4;

public class FilaSequencial {

    private Estudante vetor[];
    private int inicio, fim;

    //Cria uma Fila vazia com 1000 posicoes
    public FilaSequencial() {
        this.vetor = new Estudante[1000];
        this.inicio = 0;
        this.fim = this.inicio;
    }

  //Cria uma Fila vazia com determinada posicao
    public FilaSequencial(int maxTam) {
        this.vetor = new Estudante[maxTam];
        this.inicio = 0;
        this.fim = this.inicio;
    }

  //Adiciona o elemento no fim da fila
    public void enfileira(Estudante valor) throws Exception {
        if ((this.fim + 1) > this.vetor.length) {
            throw new Exception("Erro: A fila esta cheia");
        }
        this.vetor[this.fim] = valor;
        this.fim = (this.fim + 1);
    }
    
  //Retorna e remove o elemento do inicio da fila
    public Estudante desenfileira() throws Exception {
        if (this.vazia()) {
            throw new Exception("Erro: A fila esta vazia");
        }
        Estudante valor = this.vetor[this.inicio];
        this.inicio = (this.inicio + 1) % this.vetor.length;
        return valor;
    }

  //Verifica se a fila esta vazia
    public boolean vazia() {
        return (this.inicio == this.fim);
    }

  //Mostra todos os elementos da fila
    public void imprime() {
        for(int i=this.inicio; i!=this.fim; i=(i + 1) % this.vetor.length) {
            System.out.print(" " + this.vetor[i].nome.toString());
        }
    }
}
