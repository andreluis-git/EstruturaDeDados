package exercicio2;

public class CarrinhoDeCompra {
	ListaVetor carrinho_de_compras = new ListaVetor();
    
    public void adicionarItem(Pizza objeto){
        carrinho_de_compras.adiciona(objeto);
    }
    
    public void removerItem(int posicao){
        carrinho_de_compras.remove(posicao);
    }
    
    public int totalPizzasAdicionadas(){
        return carrinho_de_compras.tamanho();
    }
    
    
}
