package controller;

class Candidato {
	String nomeCandidato;
	String rgCandidato;
	String cpfCandidato;
	
	// M�todo Construtor
	Candidato()
	{
		this("", "", "");
	}
	
	// M�todo Procedimento
	Candidato(String nomeCandidato,String rgCandidato,String cpfCandidato)
	{
		this.nomeCandidato = nomeCandidato;
		this.rgCandidato = rgCandidato;
		this.cpfCandidato = cpfCandidato;
	}	
}
