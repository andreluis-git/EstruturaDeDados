package exercicio4;

public class MainEx04 {
	
	public static void main(String[] args) {
		Estudante estudante = new Estudante("4564655", "Lucas");
		Estudante estudante2 = new Estudante("4564656", "Andre");
		Estudante estudante3 = new Estudante("4564657", "Paulo");
		Estudante estudante4 = new Estudante("4564658", "Renato");
		Estudante estudante5 = new Estudante("4564659", "Joao");
		Estudante estudante6 = new Estudante("4564660", "Marcos");
		
		FilaEncadeada filaEncadeada = new FilaEncadeada();
		
		filaEncadeada.enfileira(estudante);
		filaEncadeada.enfileira(estudante2);
		filaEncadeada.enfileira(estudante3);
		filaEncadeada.enfileira(estudante4);
		filaEncadeada.enfileira(estudante5);
		filaEncadeada.enfileira(estudante6);
		
		System.out.println("===================");
        System.out.println("Todos Elementos da fila:");
		filaEncadeada.imprime();
		
		try {
			filaEncadeada.desenfileira();
			filaEncadeada.desenfileira();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("===================");
        System.out.println("Todos Elementos da fila:");
		filaEncadeada.imprime();
		
		System.out.println("===================");
        System.out.println("Cebeca da fila:");
		try {
			filaEncadeada.cabeca();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("===================");
        System.out.println("Cauda da fila:");
		try {
			filaEncadeada.cauda();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
