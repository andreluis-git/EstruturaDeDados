package controller;

class Candidato {
	String nomeCandidato;
	String rgCandidato;
	String cpfCandidato;
	
	// Método Construtor
	Candidato()
	{
		this("", "", "");
	}
	
	// Método Procedimento
	Candidato(String nomeCandidato,String rgCandidato,String cpfCandidato)
	{
		this.nomeCandidato = nomeCandidato;
		this.rgCandidato = rgCandidato;
		this.cpfCandidato = cpfCandidato;
	}	
}
