package exercicio2;

public class Pizza {
    String sabor;
    double preco;
    static int qtde_pizzas = 0;
    
    //metodo construtor é o método que leva o nome da classe
    //e serve para inicializar os objetos da classe.
    public Pizza(String sabor, double preco){
        this.sabor = sabor;
        this.preco = preco;
        qtde_pizzas++;
    }
    
    public int getQtdePizzas(){ return qtde_pizzas; }
    public String getSabor(){ return sabor; }
    public double getPreco(){ return preco; }     
    
}
