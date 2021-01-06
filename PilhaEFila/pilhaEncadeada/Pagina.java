package pilhaEncadeada;

public class Pagina {

    int pagina;
    Pagina anterior;

    public Pagina(int pagina) {
        this.pagina = pagina;
    }

    public Pagina getAnterior() {
        return anterior;
    }

    public void setAnterior(Pagina anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return "Pagina: " + pagina;
    }
}
