package pilhaEncadeada;

public class Principal {
	
	static PilhaEncadeada avancar = new PilhaEncadeada();
    static PilhaEncadeada retornar = new PilhaEncadeada();

    public static void main(String[] args) {
        int user; // 1 = avan�ar, 0 = retornar
        Pagina p1 = new Pagina(0); // Tamb�m poderia conter mais informa��es da p�gina
        Pagina p2 = new Pagina(4);
        Pagina p3 = new Pagina(6);
        Pagina p4 = new Pagina(9);
        
        avancar.push(p1); //empilhar primeira p�gina
        avancar.push(p2); //empilhar segunda p�gina
        avancar.push(p3);
        avancar.push(p4);
        
        System.out.println("===================");
        System.out.println("Todos Elementos Avan�ar:");
        avancar.mostrarPaginas();

        System.out.println("===================");
        System.out.println("Retornando uma pagina");
        user = 0;
        retorna(user); // Alus�o a um Listenner esperando a�ao de retorno
        retorna(user);
        
        System.out.println("Todos Elementos Retornar:");
        retornar.mostrarPaginas();

        System.out.println("===================");
        System.out.println("Todos Elementos Avan�ar:");
        avancar.mostrarPaginas();
        
        System.out.println("===================");
        System.out.println("Avan�ando uma pagina:");
        user = 1;
	    avanca(user);  // Alus�o a um Listenner esperando a�ao de avan�ar
        System.out.println("===================");
        System.out.println("Todos Elementos Avan�ar:");
        avancar.mostrarPaginas();
        avanca(user);
        
        System.out.println("===================");
        System.out.println("Topo: \n" + avancar.top());
    }
    
    static void retorna(int user) {
    	if (user == 0) {
	        retornar.push(new Pagina(avancar.top()));
	        avancar.pop();
        }
    }
    
    static void avanca(int user) {
    	if (user == 1) {
	        avancar.push(new Pagina(retornar.top()));
	        retornar.pop();
        }
    }
}
