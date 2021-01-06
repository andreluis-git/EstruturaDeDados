package Filas;

public class FilaSequencial {

    private Candidato vetor[];
    private int inicio, fim;

    //Cria uma Fila vazia
    public FilaSequencial() {
        this.vetor = new Candidato[1000];
        this.inicio = 0;
        this.fim = this.inicio;
    }

    public FilaSequencial(int maxTam) { // Cria uma Fila vazia
        this.vetor = new Candidato[maxTam];
        this.inicio = 0;
        this.fim = this.inicio;
    }

    public void enfileira(Candidato valor) throws Exception {
        if ((this.fim + 1) > this.vetor.length) {
            throw new Exception("Erro: A fila esta cheia");
        }
        this.vetor[this.fim] = valor;
        this.fim = (this.fim + 1);
    }

    public Candidato desenfileira() throws Exception {
        if (this.vazia()) {
            throw new Exception("Erro: A fila esta vazia");
        }
        Candidato valor = this.vetor[this.inicio];
        this.inicio = (this.inicio + 1) % this.vetor.length;
        return valor;
    }

    public boolean vazia() {
        return (this.inicio == this.fim);
    }

    public void imprime() {
        for(int i=this.inicio; i!=this.fim; i=(i + 1) % this.vetor.length) {
            System.out.print(" " + this.vetor[i].nome.toString());
        }

    }
}
