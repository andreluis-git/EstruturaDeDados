package exercicio4;

public class Estudante {
	
	String ra;
	String nome;
	
	Estudante(){
		super();
	}
	
	public Estudante(String ra, String nome) {
		this.ra = ra;
		this.nome = nome;
	}
	
	public void mostrarEstudante() {
		System.out.println("RA: " + ra + ", Nome: " + nome);
	}
}
