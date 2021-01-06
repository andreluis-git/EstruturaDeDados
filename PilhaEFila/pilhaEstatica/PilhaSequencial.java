package pilhaEstatica;

import javax.swing.JOptionPane;

class PilhaSequencial {

    int inicio;
    int fim;
    int tamanho;
    int qtdeElementos = 0;
    int p[];
    String acao;

    public PilhaSequencial(String acao) {
        inicio = fim = -1;
        tamanho = 100;
        p = new int[tamanho]; // Tamanho do vetor
        qtdeElementos = 0;
        this.acao = acao;
    }

    public boolean estaVazia() {
        if (qtdeElementos == 0) {
            return true;
        }
        return false;
    }

    public boolean estaCheia() {
        if (qtdeElementos == tamanho - 1) {
            return true;
        }
        return false;
    }

    public void adicionar(int e) {
        if (!estaCheia()) {
            if (inicio == -1) {
                inicio = 0;
            }
            fim++;
            p[fim] = e;
            qtdeElementos++;
        }
    }

    public int remover() {
        if (!estaVazia()) {
            int valor = p[fim];
            fim--;
            qtdeElementos--;
            return valor;
        }
        return 0;
    }
    
    public int top() {
    	return p[fim];
    }

    public void mostrar() {
        String elementos = "Historico " + acao + "";
        for (int i = fim; i >= 0; i--) {
            elementos += p[i] + " ";
        }
        JOptionPane.showMessageDialog(null, elementos);
    }  
} // fim da classe Pilha