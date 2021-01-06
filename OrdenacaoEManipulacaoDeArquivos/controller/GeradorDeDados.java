package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class GeradorDeDados {
	public ArrayList<Candidato> gerarArr() throws IOException{
		ArrayList<Candidato> nome = new ArrayList<Candidato>();
		File dir = new File("C:\\TEMP", "pasta1.csv");
		FileInputStream fluxo = new FileInputStream(dir);
		InputStreamReader leitor = new InputStreamReader(fluxo);
		BufferedReader buffer = new BufferedReader(leitor);
		String linha = buffer.readLine();
		Candidato aux;
		while(linha != null) {
			aux = new Candidato();
			String linhaSplit[] = linha.split(";");
			aux.rgCandidato = linhaSplit[0];
			aux.nomeCandidato = linhaSplit[1];
			aux.cpfCandidato = linhaSplit[2];
			nome.add(aux);
			linha = buffer.readLine();
		}
		buffer.close();
		leitor.close();
		fluxo.close();
		return nome;
	}
	
	public String gerarDados(int quantidadeNomes) throws IOException{
		GeradorDeDados x = new GeradorDeDados();
		String listaNomes = "";
		ArrayList<Candidato> nomes = x.gerarArr();
		int tamanhoArr = nomes.size();
		for(int i=0; i < quantidadeNomes; i++) {
			int index = (int) (Math.random() * (tamanhoArr - 0) + 0);
			Candidato aux = nomes.get(index);
			listaNomes += aux.rgCandidato + " " + aux.nomeCandidato + " " + aux.cpfCandidato + "\n";
		}
		return listaNomes;
	}
}
