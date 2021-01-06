package controller;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TelaController implements ActionListener, KeyListener{
	private JTextField tfNome;
	private JTextField tfRg;
	private JTextArea textArea;
	private JTextField tfCpf;
	private FileDialog fdAbrir, fdSalvar;
	private String nome_do_arquivo;
	private JTextField tfQuantidadeNomes;
	
	public TelaController(JTextField tfNome, JTextField tfRg, JTextField tfCpf, JTextArea textArea, FileDialog fdAbrir, FileDialog fdSalvar, JTextField tfQuantidadeNomes) {
		this.tfNome = tfNome;
		this.tfRg = tfRg;
		this.tfCpf = tfCpf;
		this.textArea = textArea;
		this.fdAbrir = fdAbrir;
		this.fdSalvar = fdSalvar;
		this.tfQuantidadeNomes = tfQuantidadeNomes;
	}
	
	public void inserirDados() {
		if(!tfNome.getText().isEmpty()) {
			if (!tfRg.getText().isEmpty() && tfRg.getText().length() > 8) {
				if(!tfCpf.getText().isEmpty() && tfCpf.getText().length() > 10) {
					String nome = tfNome.getText();
					String rg = tfRg.getText();
					String cpf = tfCpf.getText();
					tfCpf.setText("");
					tfNome.setText("");
					tfRg.setText("");
					textArea.setText(textArea.getText()+rg+" "+nome+ " " + cpf +"\n");
				}else {
					JOptionPane.showMessageDialog(null, "Digite um CPF válido!!","Erro!",JOptionPane.ERROR_MESSAGE);
				}
			} else {
				JOptionPane.showMessageDialog(null, "Digite um RG válido!!","Erro!",JOptionPane.ERROR_MESSAGE);
			} 
		}else {
			JOptionPane.showMessageDialog(null, "Digite um nome!!","Erro!",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public boolean textoVazio() {
		if(textArea.getText().isEmpty()) {
			return true;
		}
		return false;
	}
	
	public Candidato[] lerTextArea() {
			String texto[] = textArea.getText().split("\n");
			String[] conteudoLinha;
			Candidato candidatos[] = new Candidato[texto.length];
			for(int i = 0, tamanho = texto.length; i < tamanho; i++) {
				candidatos[i] = new Candidato();
				conteudoLinha = texto[i].split(" ");
				candidatos[i].rgCandidato = conteudoLinha[0];
				candidatos[i].nomeCandidato = conteudoLinha[1];
				candidatos[i].cpfCandidato = conteudoLinha[2];
			}
			return candidatos;
	}
	
	public void limparDados() {
		textArea.setText("");
		tfNome.setText("");
		tfRg.setText("");
		tfCpf.setText("");
		tfQuantidadeNomes.setText("");
	}
	
	public void setTextArea(Candidato[] arr) {
		textArea.setText("");
		for(int i = 0, tamanho = arr.length; i < tamanho; i++) {
			textArea.setText(textArea.getText() + arr[i].rgCandidato + " " + arr[i].nomeCandidato + " " + arr[i].cpfCandidato + "\n");
		}
	}
	
	public Candidato[] classificarCpf() {
		Candidato[] arr = lerTextArea();
		
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, lerTextArea().length - 1);
        
        return arr;
	}
	
	public Candidato[] classificarNome() {
		Candidato arr[] = lerTextArea();
	     int n = arr.length; 

	     QuickSort ob = new QuickSort(); 
	     ob.sort(arr, 0, n-1); 

	     return arr;
	}
	
	public void gravarDados() {
		try {
			fdSalvar.setVisible(true);
			if (fdSalvar.getFile() == null) {
				return;
			}
			nome_do_arquivo = fdSalvar.getDirectory() + fdSalvar.getFile();
			FileWriter out = new FileWriter(nome_do_arquivo);
			out.write(textArea.getText());
			out.close();
			System.out.println("Arquivo gravado com sucesso!");
		}catch (IOException e1) {
			System.out.println("Erro ao gravar no arquivo!" + e1.toString());
		}
	}
	
	public void abrirArquivo() {
		try {
			fdAbrir.setVisible(true);
			if (fdAbrir.getFile() == null) {
				return;
			}
			nome_do_arquivo = fdAbrir.getDirectory() + fdAbrir.getFile();
			FileInputStream fluxo = new FileInputStream(nome_do_arquivo);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			String s = "";
			while(linha != null) {
				s += linha + "\n";
				linha = buffer.readLine();
			}
			buffer.close();
			leitor.close();
			fluxo.close();
			textArea.setText(s);
			System.out.println("Arquivo aberto com sucesso!");
		}catch (IOException e1) {
			System.out.println("Erro ao abrir o arquivo! " + e1.toString());
		}
	}
	
	public void gerarDados() {
		GeradorDeDados tNome = new GeradorDeDados();
		try {
			textArea.setText(tNome.gerarDados(Integer.parseInt(tfQuantidadeNomes.getText())));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
// ---------------------- ActionController -------------------------
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "Inserir") {
			inserirDados();
		}
		if(e.getActionCommand() == "Gravar") {
			gravarDados();
		}
		if(e.getActionCommand() == "Limpar") {
			limparDados();
		}
		if(e.getActionCommand() == "Classificar por CPF") {
			if(!textoVazio()) {
				System.out.println("\n\n---------- Classificação por CPF (MergeSort) -----------------");
				double tempoInicial = System.nanoTime();
				
				Candidato arr[] = classificarCpf();
				setTextArea(arr);
				
				double tempoFinal = System.nanoTime();
				double tempoTotal = tempoFinal - tempoInicial;
				tempoTotal /= Math.pow(10, 9);
				
				System.out.println("Tempo de execução em segundos: " + tempoTotal);
			}
		}
		if(e.getActionCommand() == "Classificar por Nome") {
			if(!textoVazio()) {

				System.out.println("\n\n---------- Classificação por Nome (QuickSort) -----------------");
				double tempoInicial = System.nanoTime();
				
				Candidato arr[] = classificarNome();
				setTextArea(arr);
				
				double tempoFinal = System.nanoTime();
				double tempoTotal = tempoFinal - tempoInicial;
				tempoTotal /= Math.pow(10, 9);
				
				System.out.println("Tempo de execução em segundos: " + tempoTotal);
			}
		}
		if(e.getActionCommand() == "Abrir") {
			abrirArquivo();
		}
		
		if(e.getActionCommand() == "Gerar dados") {
			gerarDados();
		}
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode()==KeyEvent.VK_ENTER){
			inserirDados();
        }
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
}
