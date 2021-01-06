package Filas;

public class Candidato {
	
	String codigo;
	String nome;
	String rg;
	String cpf;
	
	Candidato(){
		super();
	}
	
	public Candidato(Candidato candidato) {
		this.codigo = candidato.codigo;
		this.nome = candidato.nome;
		this.rg = candidato.rg;
		this.cpf = candidato.cpf;
	}
}
