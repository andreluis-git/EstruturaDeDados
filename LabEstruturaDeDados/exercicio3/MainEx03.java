package exercicio3;

public class MainEx03 {

    public static void main(String[] args) {
        Livro l1 = new Livro("Livro 1", 2019, 29.99);
        Livro l2 = new Livro("Livro 2", 2017, 15.99);
        Livro l3 = new Livro("Livro 3", 2015, 27.99);
        Livro l4 = new Livro("Livro 4", 2014, 17.99);
        Livro l5 = new Livro("Livro 5", 2020, 40.99);
        Livro l6 = new Livro("Livro 6", 2018, 18.99);
        Livro l7 = new Livro("Livro 7", 2005, 25.99);
        Livro l8 = new Livro("Livro 8", 2007, 32.99);

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
        
        // Mostrar todos elementos da lista
        System.out.println("===================");
        System.out.println("Todos Elementos da lista:");
        lista.mostraLivros();
        
        Pilha p = new Pilha();
        
        // Empilha todos elementos da lista
        p.empilhar(lista.removeInicio());
        p.empilhar(lista.removeInicio());
        p.empilhar(lista.removeInicio());
        p.empilhar(lista.removeInicio());
        p.empilhar(lista.removeInicio());
        p.empilhar(lista.removeInicio());
        p.empilhar(lista.removeInicio());
        p.empilhar(lista.removeInicio());
        
        // Mostrar todos elementos da pilha
        System.out.println("===================");
        System.out.println("Todos Elementos da pilha:");
        p.mostraLivros();
        
        //Desempilha o ultimo elemento da pilha com retorno
        System.out.println("===================");
        System.out.println("Retorna e desempilha o ultimo elemento:");
        System.out.println(p.get().toString());
        
        // Mostrar todos elementos da pilha
        System.out.println("===================");
        System.out.println("Todos Elementos da pilha:");
        p.mostraLivros();
        
      //Desempilha o ultimo elemento da pilha sem retorno
        System.out.println("===================");
        System.out.println("Desempilha o ultimo elemento:");
        p.desempilhar();
        
     // Mostrar todos elementos da pilha
        System.out.println("===================");
        System.out.println("Todos Elementos da pilha:");
        p.mostraLivros();
        
     // Mostrar o tamanho da pilha
        System.out.println("===================");
        System.out.println("Tamanho da pilha:");
       	System.out.println(p.tamanho());
    }
}
