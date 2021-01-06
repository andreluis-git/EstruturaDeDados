package pilhaEstatica;

public class Controller {
	PilhaSequencial avanca = new PilhaSequencial("Páginas visitadas:\n");
    PilhaSequencial retorna = new PilhaSequencial("Páginas retornadas:\n");
    
    public void adicionaPagina(String pagina) {
    	int numPagina = Integer.parseInt(pagina);
    	avanca.adicionar(numPagina);
    }
    
    public void mostrarHistorico() {
    	avanca.mostrar();
    }
    
    public String avancar(String atual) {
    	int aux;
    	aux = Integer.parseInt(atual);
    	avanca.adicionar(aux);
    	aux = retorna.remover();
    	return String.valueOf(aux);
    }
    
    public String retornar(String atual) {
    	int aux;
    	aux = Integer.parseInt(atual);
    	retorna.adicionar(aux);
    	aux = avanca.remover();
    	return String.valueOf(aux);
    }
    
    public boolean vazia() {
    	boolean status;
    	status = retorna.estaVazia();
    	if (status == true) {
    		return false;
    	} else {
    		return true;
    	}
    }
}
