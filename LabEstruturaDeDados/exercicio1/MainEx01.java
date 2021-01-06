package exercicio1;

public class MainEx01 {

    public static void main(String[] args) {
        Livro l1 = new Livro("Livro 1", 2019, 29.99);
        Livro l2 = new Livro("Livro 2", 2017, 15.99);
        Livro l3 = new Livro("Livro 3", 2015, 27.99);
        Livro l4 = new Livro("Livro 4", 2014, 17.99);
        Livro l5 = new Livro("Livro 5", 2020, 40.99);
        Livro l6 = new Livro("Livro 6", 2018, 18.99);
        Livro l7 = new Livro("Livro 7", 2005, 25.99);
        Livro l8 = new Livro("Livro 8", 2007, 32.99);
        Livro l15 = new Livro("Livro 15", 2003, 99.99);
        Livro l12 = new Livro("Livro 12", 2011, 75.99);

        Lista lista = new Lista();

        // Adicionando livros no fim da lista
        lista.adicionaFim(l1);
        lista.adicionaFim(l2);
        lista.adicionaFim(l3);
        lista.adicionaFim(l4);
        lista.adicionaFim(l5);
        lista.adicionaFim(l6);
        lista.adicionaFim(l7);
        lista.adicionaFim(l8);
        
        // Adicionando livros no Inicio da lista
        lista.adicionaInicio(l12);
        
        // Mostrar todos elementos
        System.out.println("===================");
        System.out.println("Todos Elementos:");
        lista.mostraLivros();

        //Remove um elemento numa determinada posição da lista
        System.out.println("===================");
        System.out.println("Removendo livro posicao 3:");
        lista.remove(3);
        
        // Mostrar todos elementos
        System.out.println("===================");
        System.out.println("Todos Elementos:");
        lista.mostraLivros();
        
        //Remove um elemento numa determinada posição da lista
        System.out.println("===================");
        System.out.println("Removendo livro do inicio:");
        lista.removeInicio();
        
        //Remove um elemento do fim da lista
        System.out.println("===================");
        System.out.println("Removendo livro do fim:");
        lista.removeFim();
        
        // Mostrar elemento do topo
        System.out.println("===================");
        System.out.println("Elemento do topo:");
        System.out.println(lista.top());

        // Mostrar todos elementos
        System.out.println("===================");
        System.out.println("Todos Elementos:");
        lista.mostraLivros();
        
        // Adicionar um elemento numa determinada posição da lista
        System.out.println("===================");
        System.out.println("Adicionando livro na posicao 4:");
        lista.adiciona(4, l15);
        
        // Mostrar o tamanho da lista
        System.out.println("===================");
        System.out.println("Tamanho:");
        System.out.println(lista.tamanho());
        
        // Mostrar todos elementos
        System.out.println("===================");
        System.out.println("Todos Elementos:");
        lista.mostraLivros();
        
        // Verifica se a lista está vazia
        System.out.println("===================");
        System.out.println("Lista vazia:");
        System.out.println(lista.estaVazia());
    }
}
