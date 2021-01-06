package pilhaEncadeada;

public class PilhaEncadeada {

    private Pagina topo, anterior;
    
    public void push(Pagina pagina) { //empilhar
        if (topo == null) {
            topo = pagina;
        } else {
        	anterior = topo;
            topo = pagina;
            topo.setAnterior(anterior);
        }
    }

    public void pop() {
        topo = topo.getAnterior();
        anterior = topo;
    }

    public int top() {
        return topo.pagina;
    }

    public void mostrarPaginas() {
        Pagina aux = topo;

        while (aux != null) {
            System.out.println(aux.toString());
            aux = aux.getAnterior();
        }
    }
}
