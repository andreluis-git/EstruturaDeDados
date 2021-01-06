package exercicio2;

public class ListaVetor {

    private Object[] objetos = new Object[10];
    public int totalDeObjetos = 0;
    
    //Dobra o tamanho do vetor caso esteja cheio
    private void garantaEspaco() {
        if (totalDeObjetos == objetos.length) {
            Object[] novoVetor = new Object[objetos.length * 2];
            for (int i = 0; i < objetos.length; i++) {
                novoVetor[i] = objetos[i];
            }
            objetos = novoVetor;
        }
    }
    
  //Retorna se a posicao digitada e valida
    private boolean posicaoValida(int posicao){
        return posicao>=0 && posicao<totalDeObjetos;
    }
   
  //Adiciona elemento na ultima posicao da lista
    public void adiciona(Object objeto) {
        garantaEspaco();
        objetos[totalDeObjetos] = objeto;
        totalDeObjetos++;
    }

  //Adiciona elemento em uma determinada posicao da lista
    public void adiciona(int posicao, Object objeto) {
        garantaEspaco();
        if(!posicaoValida(posicao)){
            throw new IllegalArgumentException("Posicao Invalida!");
        }
        
        for(int i=totalDeObjetos-1; i>=posicao; i--){
            objetos[i+1] = objetos[i];
        }
        objetos[posicao]=objeto;
        totalDeObjetos++;
    }
    
  //Retorna o elemento de determinada posicao sem removelo da lista
    public Object getObjeto(int posicao){
        if(!posicaoValida(posicao)){
            throw new IllegalArgumentException ("Posicao Invalida!");
        }
        return objetos[posicao];
    }
   
  //Remove o elemento de determinada posicao da lista
    public void remove(int posicao){
        if(!posicaoValida(posicao)){
            throw new IllegalArgumentException("Posicao Invalida!");
        }
        for(int i=posicao; i<totalDeObjetos-1; i++){
            objetos[i] = objetos[i+1];
        }
        totalDeObjetos--;
    }
    
  //Verifica se o elemento digitado esta presente na lista
    public boolean contem(Object objeto){
        boolean valor_retorno = false;
        for(int i=0; i<totalDeObjetos; i++){
            if(objeto.equals(objetos[i])){
                valor_retorno =  true;
            }
        }
        return valor_retorno;
    }
    
  //Retorna o tamanho da lista
    public int tamanho(){
        return totalDeObjetos;
    }
}
