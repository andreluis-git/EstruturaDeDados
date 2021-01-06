package Filas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Controller {
	
	private FilaEncadeada filaGravar = new FilaEncadeada(); // ## Fila Encadeada ##

	public String fazerIncricao(Candidato candidato) {
		filaGravar.enfileira(new Candidato(candidato)); // ## Fila Encadeada Enfileira ##
		filaGravar.imprime();
		return "Inscrição Realizada";
	}
	
	public String gravarFila() throws IOException{
		Candidato aux;
		
		String path = "c:/temp";
		try {
			File dir = new File(path);
			if (!dir.exists()) {
				dir.mkdir();
			}
			PrintWriter pw = new PrintWriter(new FileWriter(path + "/TrabalhoED.txt", true));
			while (!filaGravar.vazia()) {
				try {
					aux = filaGravar.desenfileira(); // ## Fila Encadeada Desenfileira ##
					pw.println(aux.codigo);
					pw.println(aux.nome);
					pw.println(aux.rg);
					pw.println(aux.cpf);
				} catch (Exception e) {
					e.printStackTrace();
				}
		    }
			pw.flush();
			pw.close();
			return "Fila Gravada";
		}catch(IOException e){
			return "Falha ao armazenar: " + e.toString();
		}
	}
	
	public FilaSequencial lerFila() throws IOException{
		FilaEncadeada candidatos = new FilaEncadeada(); // ## Fila Encadeada ##
		Candidato aux;
		int qntElementos = 0;
		try {
			String nome_do_arquivo = "TrabalhoED.txt";
			BufferedReader br = new BufferedReader(new FileReader("c:/temp/" + nome_do_arquivo));
			Candidato candidato = new Candidato();
			String i = br.readLine();
			while (i != null) {
				candidato.codigo = i;
				i = br.readLine();
				candidato.nome = i;
				i = br.readLine();
				candidato.rg = i;
				i = br.readLine();
				candidato.cpf = i;
				i = br.readLine();
				candidatos.enfileira(new Candidato(candidato)); // ## Fila Encadeada Enfileira ##
				qntElementos++;
			}
			br.close();
		}catch (IOException e1) {
			System.out.println("Erro ao abrir o arquivo! " + e1.toString());
		}
		FilaSequencial candidatos2 = new FilaSequencial(qntElementos+1); // -- Define a quantidade de elementos da Fila Estatica --
		try {
			while(!candidatos.vazia()) { // ## Fila Encadeada Vazia ##
				aux = candidatos.desenfileira(); // ## Fila Encadeada Desenfileira ##
				candidatos2.enfileira(aux); // -- Fila Estatica Enfileira --
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		candidatos2.imprime(); // -- Fila Estatica Imprime --
		return candidatos2;
	}
}