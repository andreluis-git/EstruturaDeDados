package exercicio2;

public class MainEx02 {

    public static void main(String[] args) {
        Pizza p1 = new Pizza("Marguerita", 55.00);
        Pizza p2 = new Pizza("Portuguesa", 45.50);
        Pizza p3 = new Pizza("Mussarela", 30.80);
        Pizza p4 = new Pizza("Toscana", 42.80);

        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
        
        // Adiciona pizzas a lista carrinho de compra
        carrinho.adicionarItem(p1);
        carrinho.adicionarItem(p3);
        carrinho.adicionarItem(p2);
        carrinho.adicionarItem(p4);
        
        // Mostra quantas pizzas há no carrinho
        System.out.println("Qtde itens no carrinho : " + carrinho.totalPizzasAdicionadas());      
        
        //Remove a pizza passando a posição como parametro
        carrinho.removerItem(2);
        
        // Mostra quantas pizzas há no carrinho
        System.out.println("Qtde itens no carrinho : " + carrinho.totalPizzasAdicionadas());    
    }
}